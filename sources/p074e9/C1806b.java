package p074e9;

/* renamed from: e9.b */
/* loaded from: classes.dex */
public final class C1806b extends p139i1.AbstractC3061d {

    /* renamed from: e9.b$a */
    public static class a extends java.util.AbstractList<java.lang.Integer> implements java.util.RandomAccess, java.io.Serializable {

        /* renamed from: Y */
        public final int[] f7852Y;

        /* renamed from: Z */
        public final int f7853Z;

        /* renamed from: a0 */
        public final int f7854a0;

        public a(int[] r2) {
                r1 = this;
                int r0 = r2.length
                r1.<init>()
                r1.f7852Y = r2
                r2 = 0
                r1.f7853Z = r2
                r1.f7854a0 = r0
                return
        }

        public a(int[] r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f7852Y = r1
                r0.f7853Z = r2
                r0.f7854a0 = r3
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(java.lang.Object r6) {
                r5 = this;
                boolean r0 = r6 instanceof java.lang.Integer
                if (r0 == 0) goto L20
                int[] r0 = r5.f7852Y
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                int r1 = r5.f7853Z
                int r2 = r5.f7854a0
            L10:
                r3 = -1
                if (r1 >= r2) goto L1b
                r4 = r0[r1]
                if (r4 != r6) goto L18
                goto L1c
            L18:
                int r1 = r1 + 1
                goto L10
            L1b:
                r1 = -1
            L1c:
                if (r1 == r3) goto L20
                r6 = 1
                goto L21
            L20:
                r6 = 0
            L21:
                return r6
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r8 != r7) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof p074e9.C1806b.a
                if (r1 == 0) goto L2e
                e9.b$a r8 = (p074e9.C1806b.a) r8
                int r1 = r7.size()
                int r2 = r8.size()
                r3 = 0
                if (r2 == r1) goto L16
                return r3
            L16:
                r2 = 0
            L17:
                if (r2 >= r1) goto L2d
                int[] r4 = r7.f7852Y
                int r5 = r7.f7853Z
                int r5 = r5 + r2
                r4 = r4[r5]
                int[] r5 = r8.f7852Y
                int r6 = r8.f7853Z
                int r6 = r6 + r2
                r5 = r5[r6]
                if (r4 == r5) goto L2a
                return r3
            L2a:
                int r2 = r2 + 1
                goto L17
            L2d:
                return r0
            L2e:
                boolean r8 = super.equals(r8)
                return r8
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Object get(int r3) {
                r2 = this;
                int r0 = r2.size()
                p124h7.C2939x3.m7280f(r3, r0)
                int[] r0 = r2.f7852Y
                int r1 = r2.f7853Z
                int r1 = r1 + r3
                r3 = r0[r1]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                return r3
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
                r3 = this;
                int r0 = r3.f7853Z
                r1 = 1
            L3:
                int r2 = r3.f7854a0
                if (r0 >= r2) goto L11
                int r1 = r1 * 31
                int[] r2 = r3.f7852Y
                r2 = r2[r0]
                int r1 = r1 + r2
                int r0 = r0 + 1
                goto L3
            L11:
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(java.lang.Object r6) {
                r5 = this;
                boolean r0 = r6 instanceof java.lang.Integer
                r1 = -1
                if (r0 == 0) goto L22
                int[] r0 = r5.f7852Y
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                int r2 = r5.f7853Z
                int r3 = r5.f7854a0
            L11:
                if (r2 >= r3) goto L1b
                r4 = r0[r2]
                if (r4 != r6) goto L18
                goto L1c
            L18:
                int r2 = r2 + 1
                goto L11
            L1b:
                r2 = -1
            L1c:
                if (r2 < 0) goto L22
                int r6 = r5.f7853Z
                int r2 = r2 - r6
                return r2
            L22:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(java.lang.Object r6) {
                r5 = this;
                boolean r0 = r6 instanceof java.lang.Integer
                r1 = -1
                if (r0 == 0) goto L23
                int[] r0 = r5.f7852Y
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                int r2 = r5.f7853Z
                int r3 = r5.f7854a0
                int r3 = r3 + r1
            L12:
                if (r3 < r2) goto L1c
                r4 = r0[r3]
                if (r4 != r6) goto L19
                goto L1d
            L19:
                int r3 = r3 + (-1)
                goto L12
            L1c:
                r3 = -1
            L1d:
                if (r3 < 0) goto L23
                int r6 = r5.f7853Z
                int r3 = r3 - r6
                return r3
            L23:
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Object set(int r3, java.lang.Object r4) {
                r2 = this;
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r0 = r2.size()
                p124h7.C2939x3.m7280f(r3, r0)
                int[] r0 = r2.f7852Y
                int r1 = r2.f7853Z
                int r1 = r1 + r3
                r3 = r0[r1]
                java.util.Objects.requireNonNull(r4)
                int r4 = r4.intValue()
                r0[r1] = r4
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r2 = this;
                int r0 = r2.f7854a0
                int r1 = r2.f7853Z
                int r0 = r0 - r1
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Integer> subList(int r4, int r5) {
                r3 = this;
                int r0 = r3.size()
                p124h7.C2939x3.m7283i(r4, r5, r0)
                if (r4 != r5) goto Le
                java.util.List r4 = java.util.Collections.emptyList()
                return r4
            Le:
                e9.b$a r0 = new e9.b$a
                int[] r1 = r3.f7852Y
                int r2 = r3.f7853Z
                int r4 = r4 + r2
                int r2 = r2 + r5
                r0.<init>(r1, r4, r2)
                return r0
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                int r1 = r3.size()
                int r1 = r1 * 5
                r0.<init>(r1)
                r1 = 91
                r0.append(r1)
                int[] r1 = r3.f7852Y
                int r2 = r3.f7853Z
                r1 = r1[r2]
                r0.append(r1)
                int r1 = r3.f7853Z
            L1b:
                int r1 = r1 + 1
                int r2 = r3.f7854a0
                if (r1 >= r2) goto L2e
                java.lang.String r2 = ", "
                r0.append(r2)
                int[] r2 = r3.f7852Y
                r2 = r2[r1]
                r0.append(r2)
                goto L1b
            L2e:
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: u */
    public static int m4542u(long r6) {
            int r0 = (int) r6
            long r1 = (long) r0
            r3 = 1
            r4 = 0
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 != 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto Le
            return r0
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r1[r4] = r6
            java.lang.String r6 = "Out of range: %s"
            java.lang.String r6 = p185k7.C3828h5.m8609x(r6, r1)
            r0.<init>(r6)
            throw r0
    }

    /* renamed from: v */
    public static int m4543v(long r3) {
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lb
            r3 = 2147483647(0x7fffffff, float:NaN)
            return r3
        Lb:
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            return r3
        L15:
            int r4 = (int) r3
            return r4
    }

    /* renamed from: w */
    public static int[] m4544w(java.util.Collection<? extends java.lang.Number> r4) {
            boolean r0 = r4 instanceof p074e9.C1806b.a
            if (r0 == 0) goto L11
            e9.b$a r4 = (p074e9.C1806b.a) r4
            int[] r0 = r4.f7852Y
            int r1 = r4.f7853Z
            int r4 = r4.f7854a0
            int[] r4 = java.util.Arrays.copyOfRange(r0, r1, r4)
            return r4
        L11:
            java.lang.Object[] r4 = r4.toArray()
            int r0 = r4.length
            int[] r1 = new int[r0]
            r2 = 0
        L19:
            if (r2 >= r0) goto L2b
            r3 = r4[r2]
            java.util.Objects.requireNonNull(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L19
        L2b:
            return r1
    }
}
