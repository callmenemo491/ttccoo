package p221m9;

/* renamed from: m9.e0 */
/* loaded from: classes.dex */
public class C4446e0 extends p221m9.AbstractC4439c<java.lang.String> implements p221m9.InterfaceC4449f0, java.util.RandomAccess {

    /* renamed from: Z */
    public final java.util.List<java.lang.Object> f18126Z;

    static {
            m9.e0 r0 = new m9.e0
            r1 = 10
            r0.<init>(r1)
            r1 = 0
            r0.f18111Y = r1
            return
    }

    public C4446e0(int r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.<init>()
            r1.f18126Z = r0
            return
    }

    public C4446e0(java.util.ArrayList<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.f18126Z = r1
            return
    }

    /* renamed from: e */
    public static java.lang.String m9981e(java.lang.Object r2) {
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L7
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L7:
            boolean r0 = r2 instanceof p221m9.AbstractC4454h
            if (r0 == 0) goto L20
            m9.h r2 = (p221m9.AbstractC4454h) r2
            java.util.Objects.requireNonNull(r2)
            java.nio.charset.Charset r0 = p221m9.C4505z.f18308a
            int r1 = r2.size()
            if (r1 != 0) goto L1b
            java.lang.String r2 = ""
            goto L1f
        L1b:
            java.lang.String r2 = r2.mo10064z(r0)
        L1f:
            return r2
        L20:
            byte[] r2 = (byte[]) r2
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = p221m9.C4505z.f18308a
            r0.<init>(r2, r1)
            return r0
    }

    @Override // p221m9.C4505z.c
    /* renamed from: B */
    public p221m9.C4505z.c mo9905B(int r2) {
            r1 = this;
            int r0 = r1.size()
            if (r2 < r0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            java.util.List<java.lang.Object> r2 = r1.f18126Z
            r0.addAll(r2)
            m9.e0 r2 = new m9.e0
            r2.<init>(r0)
            return r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    @Override // p221m9.InterfaceC4449f0
    /* renamed from: G */
    public p221m9.InterfaceC4449f0 mo9982G() {
            r1 = this;
            boolean r0 = r1.f18111Y
            if (r0 == 0) goto La
            m9.p1 r0 = new m9.p1
            r0.<init>(r1)
            return r0
        La:
            return r1
    }

    @Override // p221m9.InterfaceC4449f0
    /* renamed from: J */
    public void mo9983J(p221m9.AbstractC4454h r2) {
            r1 = this;
            r1.m9909a()
            java.util.List<java.lang.Object> r0 = r1.f18126Z
            r0.add(r2)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // p221m9.InterfaceC4449f0
    /* renamed from: M */
    public java.lang.Object mo9984M(int r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.f18126Z
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // p221m9.InterfaceC4449f0
    /* renamed from: N */
    public java.util.List<?> mo9985N() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.f18126Z
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            r1.m9909a()
            java.util.List<java.lang.Object> r0 = r1.f18126Z
            r0.add(r2, r3)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractList, java.util.List
    public boolean addAll(int r2, java.util.Collection<? extends java.lang.String> r3) {
            r1 = this;
            r1.m9909a()
            boolean r0 = r3 instanceof p221m9.InterfaceC4449f0
            if (r0 == 0) goto Ld
            m9.f0 r3 = (p221m9.InterfaceC4449f0) r3
            java.util.List r3 = r3.mo9985N()
        Ld:
            java.util.List<java.lang.Object> r0 = r1.f18126Z
            boolean r2 = r0.addAll(r2, r3)
            int r3 = r1.modCount
            int r3 = r3 + 1
            r1.modCount = r3
            return r2
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.String> r2) {
            r1 = this;
            int r0 = r1.size()
            boolean r2 = r1.addAll(r0, r2)
            return r2
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r1 = this;
            r1.m9909a()
            java.util.List<java.lang.Object> r0 = r1.f18126Z
            r0.clear()
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int r6) {
            r5 = this;
            java.util.List<java.lang.Object> r0 = r5.f18126Z
            java.lang.Object r0 = r0.get(r6)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Ld
            java.lang.String r0 = (java.lang.String) r0
            goto L48
        Ld:
            boolean r1 = r0 instanceof p221m9.AbstractC4454h
            if (r1 == 0) goto L2c
            m9.h r0 = (p221m9.AbstractC4454h) r0
            java.util.Objects.requireNonNull(r0)
            java.nio.charset.Charset r1 = p221m9.C4505z.f18308a
            int r2 = r0.size()
            if (r2 != 0) goto L21
            java.lang.String r1 = ""
            goto L25
        L21:
            java.lang.String r1 = r0.mo10064z(r1)
        L25:
            boolean r0 = r0.mo10059n()
            if (r0 == 0) goto L47
            goto L42
        L2c:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = p221m9.C4505z.f18308a
            r1.<init>(r0, r2)
            m9.r1$b r2 = p221m9.C4486r1.f18221a
            int r3 = r0.length
            r4 = 0
            int r0 = r2.mo10293c(r4, r0, r4, r3)
            if (r0 != 0) goto L40
            r4 = 1
        L40:
            if (r4 == 0) goto L47
        L42:
            java.util.List<java.lang.Object> r0 = r5.f18126Z
            r0.set(r6, r1)
        L47:
            r0 = r1
        L48:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int r2) {
            r1 = this;
            r1.m9909a()
            java.util.List<java.lang.Object> r0 = r1.f18126Z
            java.lang.Object r2 = r0.remove(r2)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            java.lang.String r2 = m9981e(r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            r1.m9909a()
            java.util.List<java.lang.Object> r0 = r1.f18126Z
            java.lang.Object r2 = r0.set(r2, r3)
            java.lang.String r2 = m9981e(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.f18126Z
            int r0 = r0.size()
            return r0
    }
}
