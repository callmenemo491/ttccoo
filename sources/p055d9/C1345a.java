package p055d9;

/* renamed from: d9.a */
/* loaded from: classes.dex */
public final class C1345a {

    /* renamed from: d9.a$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6861a = null;

        static {
                java.math.RoundingMode[] r0 = java.math.RoundingMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p055d9.C1345a.a.f6861a = r0
                java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = p055d9.C1345a.a.f6861a     // Catch: java.lang.NoSuchFieldError -> L1d
                java.math.RoundingMode r1 = java.math.RoundingMode.DOWN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = p055d9.C1345a.a.f6861a     // Catch: java.lang.NoSuchFieldError -> L28
                java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = p055d9.C1345a.a.f6861a     // Catch: java.lang.NoSuchFieldError -> L33
                java.math.RoundingMode r1 = java.math.RoundingMode.UP     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = p055d9.C1345a.a.f6861a     // Catch: java.lang.NoSuchFieldError -> L3e
                java.math.RoundingMode r1 = java.math.RoundingMode.CEILING     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = p055d9.C1345a.a.f6861a     // Catch: java.lang.NoSuchFieldError -> L49
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_DOWN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = p055d9.C1345a.a.f6861a     // Catch: java.lang.NoSuchFieldError -> L54
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = p055d9.C1345a.a.f6861a     // Catch: java.lang.NoSuchFieldError -> L60
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                return
        }
    }

    /* renamed from: a */
    public static int m3842a(int r5, int r6, java.math.RoundingMode r7) {
            java.util.Objects.requireNonNull(r7)
            if (r6 == 0) goto L63
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            return r0
        Le:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = p055d9.C1345a.a.f6861a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L50;
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L57;
                case 5: goto L4a;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L47
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L57
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3b
            r6 = 1
            goto L3c
        L3b:
            r6 = 0
        L3c:
            r7 = r0 & 1
            if (r7 == 0) goto L42
            r7 = 1
            goto L43
        L42:
            r7 = 0
        L43:
            r6 = r6 & r7
            if (r6 == 0) goto L56
            goto L57
        L47:
            if (r1 <= 0) goto L56
            goto L57
        L4a:
            if (r5 <= 0) goto L56
            goto L57
        L4d:
            if (r5 >= 0) goto L56
            goto L57
        L50:
            if (r1 != 0) goto L53
            goto L54
        L53:
            r2 = 0
        L54:
            if (r2 == 0) goto L5b
        L56:
            r2 = 0
        L57:
            if (r2 == 0) goto L5a
            int r0 = r0 + r5
        L5a:
            return r0
        L5b:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "mode was UNNECESSARY, but rounding was necessary"
            r5.<init>(r6)
            throw r5
        L63:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
    }

    /* renamed from: b */
    public static int m3843b(int r3, java.math.RoundingMode r4) {
            if (r3 <= 0) goto L4d
            int[] r0 = p055d9.C1345a.a.f6861a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 1
            switch(r4) {
                case 1: goto L2d;
                case 2: goto L3e;
                case 3: goto L3e;
                case 4: goto L25;
                case 5: goto L25;
                case 6: goto L14;
                case 7: goto L14;
                case 8: goto L14;
                default: goto Le;
            }
        Le:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L14:
            int r4 = java.lang.Integer.numberOfLeadingZeros(r3)
            r0 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = r0 >>> r4
            int r4 = 31 - r4
            int r0 = r0 - r3
            int r3 = ~r0
            int r3 = ~r3
            int r3 = r3 >>> 31
            int r4 = r4 + r3
            return r4
        L25:
            int r3 = r3 - r0
            int r3 = java.lang.Integer.numberOfLeadingZeros(r3)
            int r3 = 32 - r3
            return r3
        L2d:
            r4 = 0
            if (r3 <= 0) goto L32
            r1 = 1
            goto L33
        L32:
            r1 = 0
        L33:
            int r2 = r3 + (-1)
            r2 = r2 & r3
            if (r2 != 0) goto L39
            goto L3a
        L39:
            r0 = 0
        L3a:
            r4 = r1 & r0
            if (r4 == 0) goto L45
        L3e:
            int r3 = java.lang.Integer.numberOfLeadingZeros(r3)
            int r3 = 31 - r3
            return r3
        L45:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "mode was UNNECESSARY, but rounding was necessary"
            r3.<init>(r4)
            throw r3
        L4d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ") must be > 0"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }
}
