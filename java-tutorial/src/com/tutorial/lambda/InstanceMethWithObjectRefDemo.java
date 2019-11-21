package com.tutorial.lambda;

class InstanceMethWithObjectRefDemo {
	static <T> int counter(T[] vals, MyFunc<T> f, T v) {
		int count = 0;
		for (final T val : vals) {
			if (f.func(val)) {
				System.out.println("v1:" + val + "  v2:" + v);
				count++;
			}
		}
		return count;
	}

	interface MyFunc<T> {
		boolean func(T v1);
	}

	interface MyFunc2<T> {
		boolean func(T v);
	}

	static <T> int counter2(T[] vals, MyFunc2<T> f, T v) {
		int count = 0;
		for (final T val : vals) {
			if (f.func(val)) {
				System.out.println("v1:" + val + "  v2:" + v);
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		int count;

		final HighTemp[] weekDayHighs = { new HighTemp(89), new HighTemp(82), new HighTemp(90), new HighTemp(89),
				new HighTemp(89), new HighTemp(91), new HighTemp(84), new HighTemp(83) };

		final HighTemp[] weekDayHighs2 = { new HighTemp(32), new HighTemp(12), new HighTemp(24), new HighTemp(19),
				new HighTemp(18), new HighTemp(12), new HighTemp(-1), new HighTemp(13) };

		final MyFunc<HighTemp> f = HighTemp::sameTemp;

		count = counter(weekDayHighs, f, new HighTemp(89));
		System.out.println(count + " days had same temp of 89");

		count = counter(weekDayHighs2, f, new HighTemp(12));
		System.out.println(count + " days had same temp of 12");

		// final MyFunc<HighTemp> f2 = (v1, v2) -> v1.lessThanTemp(v2);
		// HighTemp::lessThanTemp;
		// count = counter(weekDayHighs2, f2, new HighTemp(19));
		System.out.println(count + " days had a high of less than 19");

		count = counter2(weekDayHighs2, HighTemp::lessThanTempNoArg, new HighTemp(19));
		System.out.println(count + " days had a high of less than 19");

	}
}
