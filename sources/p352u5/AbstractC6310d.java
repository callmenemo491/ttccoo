package p352u5;

/* renamed from: u5.d */
/* loaded from: classes.dex */
public abstract class AbstractC6310d implements p352u5.InterfaceC6320i {

    /* renamed from: a */
    public final boolean f24650a;

    /* renamed from: b */
    public final java.util.ArrayList<p352u5.InterfaceC6317g0> f24651b;

    /* renamed from: c */
    public int f24652c;

    /* renamed from: d */
    public p352u5.C6323l f24653d;

    public AbstractC6310d(boolean r2) {
            r1 = this;
            r1.<init>()
            r1.f24650a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 1
            r2.<init>(r0)
            r1.f24651b = r2
            return
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: g */
    public /* synthetic */ java.util.Map mo6022g() {
            r1 = this;
            java.util.Map r0 = p352u5.C6318h.m12963a(r1)
            return r0
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: j */
    public final void mo6023j(p352u5.InterfaceC6317g0 r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            java.util.ArrayList<u5.g0> r0 = r1.f24651b
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L16
            java.util.ArrayList<u5.g0> r0 = r1.f24651b
            r0.add(r2)
            int r2 = r1.f24652c
            int r2 = r2 + 1
            r1.f24652c = r2
        L16:
            return
    }

    /* renamed from: r */
    public final void m12952r(int r5) {
            r4 = this;
            u5.l r0 = r4.f24653d
            int r1 = p371v5.C6552b0.f25624a
            r1 = 0
        L5:
            int r2 = r4.f24652c
            if (r1 >= r2) goto L19
            java.util.ArrayList<u5.g0> r2 = r4.f24651b
            java.lang.Object r2 = r2.get(r1)
            u5.g0 r2 = (p352u5.InterfaceC6317g0) r2
            boolean r3 = r4.f24650a
            r2.mo12960c(r4, r0, r3, r5)
            int r1 = r1 + 1
            goto L5
        L19:
            return
    }

    /* renamed from: s */
    public final void m12953s() {
            r4 = this;
            u5.l r0 = r4.f24653d
            int r1 = p371v5.C6552b0.f25624a
            r1 = 0
        L5:
            int r2 = r4.f24652c
            if (r1 >= r2) goto L19
            java.util.ArrayList<u5.g0> r2 = r4.f24651b
            java.lang.Object r2 = r2.get(r1)
            u5.g0 r2 = (p352u5.InterfaceC6317g0) r2
            boolean r3 = r4.f24650a
            r2.mo12961d(r4, r0, r3)
            int r1 = r1 + 1
            goto L5
        L19:
            r0 = 0
            r4.f24653d = r0
            return
    }

    /* renamed from: t */
    public final void m12954t(p352u5.C6323l r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.f24652c
            if (r0 >= r1) goto L15
            java.util.ArrayList<u5.g0> r1 = r3.f24651b
            java.lang.Object r1 = r1.get(r0)
            u5.g0 r1 = (p352u5.InterfaceC6317g0) r1
            boolean r2 = r3.f24650a
            r1.mo12962f(r3, r4, r2)
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    /* renamed from: u */
    public final void m12955u(p352u5.C6323l r4) {
            r3 = this;
            r3.f24653d = r4
            r0 = 0
        L3:
            int r1 = r3.f24652c
            if (r0 >= r1) goto L17
            java.util.ArrayList<u5.g0> r1 = r3.f24651b
            java.lang.Object r1 = r1.get(r0)
            u5.g0 r1 = (p352u5.InterfaceC6317g0) r1
            boolean r2 = r3.f24650a
            r1.mo12959a(r3, r4, r2)
            int r0 = r0 + 1
            goto L3
        L17:
            return
    }
}
