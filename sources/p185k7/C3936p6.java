package p185k7;

/* renamed from: k7.p6 */
/* loaded from: classes.dex */
public final class C3936p6 extends p185k7.AbstractC3730a5<java.lang.String> implements java.util.RandomAccess, p185k7.InterfaceC3949q6 {

    /* renamed from: Z */
    public final java.util.List<java.lang.Object> f16830Z;

    static {
            k7.p6 r0 = new k7.p6
            r1 = 10
            r0.<init>(r1)
            r1 = 0
            r0.f16451Y = r1
            return
    }

    public C3936p6() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public C3936p6(int r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.<init>()
            r1.f16830Z = r0
            return
    }

    public C3936p6(java.util.ArrayList<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.f16830Z = r1
            return
    }

    /* renamed from: h */
    public static java.lang.String m8879h(java.lang.Object r2) {
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L7
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L7:
            boolean r0 = r2 instanceof p185k7.AbstractC3842i5
            if (r0 == 0) goto L1d
            k7.i5 r2 = (p185k7.AbstractC3842i5) r2
            java.nio.charset.Charset r0 = p185k7.C3871k6.f16722a
            int r1 = r2.mo8520h()
            if (r1 != 0) goto L18
            java.lang.String r2 = ""
            goto L1c
        L18:
            java.lang.String r2 = r2.mo8533m(r0)
        L1c:
            return r2
        L1d:
            byte[] r2 = (byte[]) r2
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = p185k7.C3871k6.f16722a
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            r1.m8197a()
            java.util.List<java.lang.Object> r0 = r1.f16830Z
            r0.add(r2, r3)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // p185k7.AbstractC3730a5, java.util.AbstractList, java.util.List
    public final boolean addAll(int r2, java.util.Collection<? extends java.lang.String> r3) {
            r1 = this;
            r1.m8197a()
            boolean r0 = r3 instanceof p185k7.InterfaceC3949q6
            if (r0 == 0) goto Ld
            k7.q6 r3 = (p185k7.InterfaceC3949q6) r3
            java.util.List r3 = r3.mo8543g()
        Ld:
            java.util.List<java.lang.Object> r0 = r1.f16830Z
            boolean r2 = r0.addAll(r2, r3)
            int r3 = r1.modCount
            int r3 = r3 + 1
            r1.modCount = r3
            return r2
    }

    @Override // p185k7.AbstractC3730a5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.String> r2) {
            r1 = this;
            int r0 = r1.size()
            boolean r2 = r1.addAll(r0, r2)
            return r2
    }

    @Override // p185k7.AbstractC3730a5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r1 = this;
            r1.m8197a()
            java.util.List<java.lang.Object> r0 = r1.f16830Z
            r0.clear()
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // p185k7.InterfaceC3949q6
    /* renamed from: d */
    public final p185k7.InterfaceC3949q6 mo8542d() {
            r1 = this;
            boolean r0 = r1.f16451Y
            if (r0 == 0) goto La
            k7.f8 r0 = new k7.f8
            r0.<init>(r1)
            return r0
        La:
            return r1
    }

    /* renamed from: e */
    public final java.lang.String m8880e(int r6) {
            r5 = this;
            java.util.List<java.lang.Object> r0 = r5.f16830Z
            java.lang.Object r0 = r0.get(r6)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Ld
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Ld:
            boolean r1 = r0 instanceof p185k7.AbstractC3842i5
            if (r1 == 0) goto L2e
            k7.i5 r0 = (p185k7.AbstractC3842i5) r0
            java.nio.charset.Charset r1 = p185k7.C3871k6.f16722a
            int r2 = r0.mo8520h()
            if (r2 != 0) goto L1e
            java.lang.String r1 = ""
            goto L22
        L1e:
            java.lang.String r1 = r0.mo8533m(r1)
        L22:
            boolean r0 = r0.mo8535p()
            if (r0 == 0) goto L2d
            java.util.List<java.lang.Object> r0 = r5.f16830Z
            r0.set(r6, r1)
        L2d:
            return r1
        L2e:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = p185k7.C3871k6.f16722a
            r1.<init>(r0, r2)
            k7.k8 r2 = p185k7.C3899m8.f16749a
            int r3 = r0.length
            r4 = 0
            boolean r0 = r2.m8784a(r0, r4, r3)
            if (r0 == 0) goto L46
            java.util.List<java.lang.Object> r0 = r5.f16830Z
            r0.set(r6, r1)
        L46:
            return r1
    }

    @Override // p185k7.InterfaceC3949q6
    /* renamed from: g */
    public final java.util.List<?> mo8543g() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.f16830Z
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.String r1 = r0.m8880e(r1)
            return r1
    }

    @Override // p185k7.InterfaceC3949q6
    /* renamed from: j */
    public final java.lang.Object mo8544j(int r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.f16830Z
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // p185k7.InterfaceC3857j6
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ p185k7.InterfaceC3857j6 mo8299k(int r2) {
            r1 = this;
            int r0 = r1.size()
            if (r2 < r0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            java.util.List<java.lang.Object> r2 = r1.f16830Z
            r0.addAll(r2)
            k7.p6 r2 = new k7.p6
            r2.<init>(r0)
            return r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    @Override // p185k7.InterfaceC3949q6
    /* renamed from: r */
    public final void mo8545r(p185k7.AbstractC3842i5 r2) {
            r1 = this;
            r1.m8197a()
            java.util.List<java.lang.Object> r0 = r1.f16830Z
            r0.add(r2)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // p185k7.AbstractC3730a5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r2) {
            r1 = this;
            r1.m8197a()
            java.util.List<java.lang.Object> r0 = r1.f16830Z
            java.lang.Object r2 = r0.remove(r2)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            java.lang.String r2 = m8879h(r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            r1.m8197a()
            java.util.List<java.lang.Object> r0 = r1.f16830Z
            java.lang.Object r2 = r0.set(r2, r3)
            java.lang.String r2 = m8879h(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.f16830Z
            int r0 = r0.size()
            return r0
    }
}
