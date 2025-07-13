package androidx.navigation;

/* renamed from: androidx.navigation.o */
/* loaded from: classes.dex */
public class C0520o extends androidx.navigation.C0518m implements java.lang.Iterable<androidx.navigation.C0518m> {

    /* renamed from: g0 */
    public final p319s.C5942i<androidx.navigation.C0518m> f2984g0;

    /* renamed from: h0 */
    public int f2985h0;

    /* renamed from: i0 */
    public java.lang.String f2986i0;

    /* renamed from: androidx.navigation.o$a */
    public class a implements java.util.Iterator<androidx.navigation.C0518m> {

        /* renamed from: Y */
        public int f2987Y;

        /* renamed from: Z */
        public boolean f2988Z;

        /* renamed from: a0 */
        public final /* synthetic */ androidx.navigation.C0520o f2989a0;

        public a(androidx.navigation.C0520o r1) {
                r0 = this;
                r0.f2989a0 = r1
                r0.<init>()
                r1 = -1
                r0.f2987Y = r1
                r1 = 0
                r0.f2988Z = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                int r0 = r3.f2987Y
                r1 = 1
                int r0 = r0 + r1
                androidx.navigation.o r2 = r3.f2989a0
                s.i<androidx.navigation.m> r2 = r2.f2984g0
                int r2 = r2.m12352j()
                if (r0 >= r2) goto Lf
                goto L10
            Lf:
                r1 = 0
            L10:
                return r1
        }

        @Override // java.util.Iterator
        public androidx.navigation.C0518m next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L19
                r0 = 1
                r3.f2988Z = r0
                androidx.navigation.o r1 = r3.f2989a0
                s.i<androidx.navigation.m> r1 = r1.f2984g0
                int r2 = r3.f2987Y
                int r2 = r2 + r0
                r3.f2987Y = r2
                java.lang.Object r0 = r1.m12353k(r2)
                androidx.navigation.m r0 = (androidx.navigation.C0518m) r0
                return r0
            L19:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r6 = this;
                boolean r0 = r6.f2988Z
                if (r0 == 0) goto L2d
                androidx.navigation.o r0 = r6.f2989a0
                s.i<androidx.navigation.m> r0 = r0.f2984g0
                int r1 = r6.f2987Y
                java.lang.Object r0 = r0.m12353k(r1)
                androidx.navigation.m r0 = (androidx.navigation.C0518m) r0
                r1 = 0
                r0.f2972Z = r1
                androidx.navigation.o r0 = r6.f2989a0
                s.i<androidx.navigation.m> r0 = r0.f2984g0
                int r1 = r6.f2987Y
                java.lang.Object[] r2 = r0.f22816a0
                r3 = r2[r1]
                java.lang.Object r4 = p319s.C5942i.f22813c0
                r5 = 1
                if (r3 == r4) goto L26
                r2[r1] = r4
                r0.f22814Y = r5
            L26:
                int r1 = r1 - r5
                r6.f2987Y = r1
                r0 = 0
                r6.f2988Z = r0
                return
            L2d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "You must call next() before you can remove an element"
                r0.<init>(r1)
                throw r0
        }
    }

    public C0520o(androidx.navigation.AbstractC0527v<? extends androidx.navigation.C0520o> r1) {
            r0 = this;
            r0.<init>(r1)
            s.i r1 = new s.i
            r1.<init>()
            r0.f2984g0 = r1
            return
    }

    @Override // androidx.navigation.C0518m
    /* renamed from: i */
    public androidx.navigation.C0518m.a mo1594i(androidx.fragment.app.C0392l0 r5) {
            r4 = this;
            androidx.navigation.m$a r0 = super.mo1594i(r5)
            androidx.navigation.o$a r1 = new androidx.navigation.o$a
            r1.<init>(r4)
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            androidx.navigation.m r2 = (androidx.navigation.C0518m) r2
            androidx.navigation.m$a r2 = r2.mo1594i(r5)
            if (r2 == 0) goto L9
            if (r0 == 0) goto L23
            int r3 = r2.m1595e(r0)
            if (r3 <= 0) goto L9
        L23:
            r0 = r2
            goto L9
        L25:
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<androidx.navigation.C0518m> iterator() {
            r1 = this;
            androidx.navigation.o$a r0 = new androidx.navigation.o$a
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.navigation.C0518m
    /* renamed from: l */
    public void mo1580l(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            super.mo1580l(r3, r4)
            android.content.res.Resources r0 = r3.getResources()
            int[] r1 = p104g1.C2206a.f10102d
            android.content.res.TypedArray r4 = r0.obtainAttributes(r4, r1)
            r0 = 0
            int r0 = r4.getResourceId(r0, r0)
            int r1 = r2.f2973a0
            if (r0 == r1) goto L25
            r2.f2985h0 = r0
            r1 = 0
            r2.f2986i0 = r1
            java.lang.String r3 = androidx.navigation.C0518m.m1591h(r3, r0)
            r2.f2986i0 = r3
            r4.recycle()
            return
        L25:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Start destination "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = " cannot use the same id as the graph "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: m */
    public final void m1596m(androidx.navigation.C0518m r4) {
            r3 = this;
            int r0 = r4.f2973a0
            if (r0 == 0) goto L4d
            int r1 = r3.f2973a0
            if (r0 == r1) goto L2e
            s.i<androidx.navigation.m> r1 = r3.f2984g0
            java.lang.Object r0 = r1.m12348d(r0)
            androidx.navigation.m r0 = (androidx.navigation.C0518m) r0
            if (r0 != r4) goto L13
            return
        L13:
            androidx.navigation.o r1 = r4.f2972Z
            if (r1 != 0) goto L26
            if (r0 == 0) goto L1c
            r1 = 0
            r0.f2972Z = r1
        L1c:
            r4.f2972Z = r3
            s.i<androidx.navigation.m> r0 = r3.f2984g0
            int r1 = r4.f2973a0
            r0.m12351g(r1, r4)
            return
        L26:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Destination already has a parent set. Call NavGraph.remove() to remove the previous parent."
            r4.<init>(r0)
            throw r4
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Destination "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " cannot have the same id as graph "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L4d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Destinations must have an id. Call setId() or include an android:id in your navigation XML."
            r4.<init>(r0)
            throw r4
    }

    /* renamed from: n */
    public final androidx.navigation.C0518m m1597n(int r2) {
            r1 = this;
            r0 = 1
            androidx.navigation.m r2 = r1.m1598p(r2, r0)
            return r2
    }

    /* renamed from: p */
    public final androidx.navigation.C0518m m1598p(int r3, boolean r4) {
            r2 = this;
            s.i<androidx.navigation.m> r0 = r2.f2984g0
            r1 = 0
            java.lang.Object r0 = r0.m12349e(r3, r1)
            androidx.navigation.m r0 = (androidx.navigation.C0518m) r0
            if (r0 == 0) goto Ld
            r1 = r0
            goto L17
        Ld:
            if (r4 == 0) goto L17
            androidx.navigation.o r4 = r2.f2972Z
            if (r4 == 0) goto L17
            androidx.navigation.m r1 = r4.m1597n(r3)
        L17:
            return r1
    }

    @Override // androidx.navigation.C0518m
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = " startDestination="
            r0.append(r1)
            int r1 = r3.f2985h0
            androidx.navigation.m r1 = r3.m1597n(r1)
            if (r1 != 0) goto L29
            java.lang.String r1 = r3.f2986i0
            if (r1 != 0) goto L37
            java.lang.String r1 = "0x"
            r0.append(r1)
            int r1 = r3.f2985h0
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            goto L37
        L29:
            java.lang.String r2 = "{"
            r0.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "}"
        L37:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
