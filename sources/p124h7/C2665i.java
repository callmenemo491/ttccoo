package p124h7;

/* renamed from: h7.i */
/* loaded from: classes.dex */
public final class C2665i extends p124h7.AbstractC2879tf<java.lang.String> implements java.util.RandomAccess, p124h7.InterfaceC2683j {

    /* renamed from: Z */
    public final java.util.List<java.lang.Object> f11596Z;

    static {
            h7.i r0 = new h7.i
            r1 = 10
            r0.<init>(r1)
            r1 = 0
            r0.f11928Y = r1
            return
    }

    public C2665i() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public C2665i(int r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.<init>()
            r1.f11596Z = r0
            return
    }

    public C2665i(java.util.ArrayList<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.f11596Z = r1
            return
    }

    /* renamed from: h */
    public static java.lang.String m6819h(java.lang.Object r2) {
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L7
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L7:
            boolean r0 = r2 instanceof p124h7.AbstractC2574cg
            if (r0 == 0) goto L1d
            h7.cg r2 = (p124h7.AbstractC2574cg) r2
            java.nio.charset.Charset r0 = p124h7.C2575d.f11429a
            int r1 = r2.mo6474h()
            if (r1 != 0) goto L18
            java.lang.String r2 = ""
            goto L1c
        L18:
            java.lang.String r2 = r2.mo6516p(r0)
        L1c:
            return r2
        L1d:
            byte[] r2 = (byte[]) r2
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = p124h7.C2575d.f11429a
            r0.<init>(r2, r1)
            return r0
    }

    @Override // p124h7.InterfaceC2683j
    /* renamed from: V */
    public final void mo6820V(p124h7.AbstractC2574cg r2) {
            r1 = this;
            r1.m7174a()
            java.util.List<java.lang.Object> r0 = r1.f11596Z
            r0.add(r2)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            r1.m7174a()
            java.util.List<java.lang.Object> r0 = r1.f11596Z
            r0.add(r2, r3)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractList, java.util.List
    public final boolean addAll(int r2, java.util.Collection<? extends java.lang.String> r3) {
            r1 = this;
            r1.m7174a()
            boolean r0 = r3 instanceof p124h7.InterfaceC2683j
            if (r0 == 0) goto Ld
            h7.j r3 = (p124h7.InterfaceC2683j) r3
            java.util.List r3 = r3.mo6823g()
        Ld:
            java.util.List<java.lang.Object> r0 = r1.f11596Z
            boolean r2 = r0.addAll(r2, r3)
            int r3 = r1.modCount
            int r3 = r3 + 1
            r1.modCount = r3
            return r2
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.String> r2) {
            r1 = this;
            int r0 = r1.size()
            boolean r2 = r1.addAll(r0, r2)
            return r2
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r1 = this;
            r1.m7174a()
            java.util.List<java.lang.Object> r0 = r1.f11596Z
            r0.clear()
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // p124h7.InterfaceC2683j
    /* renamed from: d */
    public final p124h7.InterfaceC2683j mo6821d() {
            r1 = this;
            boolean r0 = r1.f11928Y
            if (r0 == 0) goto La
            h7.z0 r0 = new h7.z0
            r0.<init>(r1)
            return r0
        La:
            return r1
    }

    /* renamed from: e */
    public final java.lang.String m6822e(int r6) {
            r5 = this;
            java.util.List<java.lang.Object> r0 = r5.f11596Z
            java.lang.Object r0 = r0.get(r6)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Ld
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Ld:
            boolean r1 = r0 instanceof p124h7.AbstractC2574cg
            if (r1 == 0) goto L2e
            h7.cg r0 = (p124h7.AbstractC2574cg) r0
            java.nio.charset.Charset r1 = p124h7.C2575d.f11429a
            int r2 = r0.mo6474h()
            if (r2 != 0) goto L1e
            java.lang.String r1 = ""
            goto L22
        L1e:
            java.lang.String r1 = r0.mo6516p(r1)
        L22:
            boolean r0 = r0.mo6518u()
            if (r0 == 0) goto L2d
            java.util.List<java.lang.Object> r0 = r5.f11596Z
            r0.set(r6, r1)
        L2d:
            return r1
        L2e:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = p124h7.C2575d.f11429a
            r1.<init>(r0, r2)
            h7.e1 r2 = p124h7.C2631g1.f11538a
            int r3 = r0.length
            r4 = 0
            boolean r0 = r2.m6636c(r0, r4, r3)
            if (r0 == 0) goto L46
            java.util.List<java.lang.Object> r0 = r5.f11596Z
            r0.set(r6, r1)
        L46:
            return r1
    }

    @Override // p124h7.InterfaceC2683j
    /* renamed from: g */
    public final java.util.List<?> mo6823g() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.f11596Z
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.String r1 = r0.m6822e(r1)
            return r1
    }

    @Override // p124h7.InterfaceC2683j
    /* renamed from: j */
    public final java.lang.Object mo6824j(int r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.f11596Z
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // p124h7.InterfaceC2557c
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2557c mo6521k(int r2) {
            r1 = this;
            int r0 = r1.size()
            if (r2 < r0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            java.util.List<java.lang.Object> r2 = r1.f11596Z
            r0.addAll(r2)
            h7.i r2 = new h7.i
            r2.<init>(r0)
            return r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r2) {
            r1 = this;
            r1.m7174a()
            java.util.List<java.lang.Object> r0 = r1.f11596Z
            java.lang.Object r2 = r0.remove(r2)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            java.lang.String r2 = m6819h(r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            r1.m7174a()
            java.util.List<java.lang.Object> r0 = r1.f11596Z
            java.lang.Object r2 = r0.set(r2, r3)
            java.lang.String r2 = m6819h(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.f11596Z
            int r0 = r0.size()
            return r0
    }
}
