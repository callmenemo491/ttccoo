package p108g5;

/* renamed from: g5.a */
/* loaded from: classes.dex */
public abstract class AbstractC2256a implements p108g5.InterfaceC2283r {

    /* renamed from: a */
    public final java.util.ArrayList<p108g5.InterfaceC2283r.b> f10255a;

    /* renamed from: b */
    public final java.util.HashSet<p108g5.InterfaceC2283r.b> f10256b;

    /* renamed from: c */
    public final p108g5.InterfaceC2286u.a f10257c;

    /* renamed from: d */
    public final p162j4.InterfaceC3403h.a f10258d;

    /* renamed from: e */
    public android.os.Looper f10259e;

    /* renamed from: f */
    public p088f4.AbstractC2031n1 f10260f;

    public AbstractC2256a() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r2.f10255a = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r2.f10256b = r0
            g5.u$a r0 = new g5.u$a
            r0.<init>()
            r2.f10257c = r0
            j4.h$a r0 = new j4.h$a
            r0.<init>()
            r2.f10258d = r0
            return
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: b */
    public final void mo5929b(android.os.Handler r3, p162j4.InterfaceC3403h r4) {
            r2 = this;
            j4.h$a r0 = r2.f10258d
            java.util.Objects.requireNonNull(r0)
            java.util.concurrent.CopyOnWriteArrayList<j4.h$a$a> r0 = r0.f14745c
            j4.h$a$a r1 = new j4.h$a$a
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: e */
    public /* synthetic */ boolean mo5930e() {
            r1 = this;
            boolean r0 = p108g5.C2282q.m6030b(r1)
            return r0
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: f */
    public /* synthetic */ p088f4.AbstractC2031n1 mo5931f() {
            r1 = this;
            f4.n1 r0 = p108g5.C2282q.m6029a(r1)
            return r0
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: g */
    public final void mo5932g(p108g5.InterfaceC2283r.b r3) {
            r2 = this;
            android.os.Looper r0 = r2.f10259e
            java.util.Objects.requireNonNull(r0)
            java.util.HashSet<g5.r$b> r0 = r2.f10256b
            boolean r0 = r0.isEmpty()
            java.util.HashSet<g5.r$b> r1 = r2.f10256b
            r1.add(r3)
            if (r0 == 0) goto L15
            r2.mo5940p()
        L15:
            return
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: h */
    public final void mo5933h(p108g5.InterfaceC2283r.b r3) {
            r2 = this;
            java.util.HashSet<g5.r$b> r0 = r2.f10256b
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            java.util.HashSet<g5.r$b> r1 = r2.f10256b
            r1.remove(r3)
            if (r0 == 0) goto L1a
            java.util.HashSet<g5.r$b> r3 = r2.f10256b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L1a
            r2.mo5939o()
        L1a:
            return
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: i */
    public final void mo5934i(p108g5.InterfaceC2283r.b r2) {
            r1 = this;
            java.util.ArrayList<g5.r$b> r0 = r1.f10255a
            r0.remove(r2)
            java.util.ArrayList<g5.r$b> r0 = r1.f10255a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1b
            r2 = 0
            r1.f10259e = r2
            r1.f10260f = r2
            java.util.HashSet<g5.r$b> r2 = r1.f10256b
            r2.clear()
            r1.mo5943s()
            goto L1e
        L1b:
            r1.mo5933h(r2)
        L1e:
            return
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: j */
    public final void mo5935j(p108g5.InterfaceC2283r.b r4, p352u5.InterfaceC6317g0 r5) {
            r3 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r3.f10259e
            if (r1 == 0) goto Ld
            if (r1 != r0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            goto Le
        Ld:
            r1 = 1
        Le:
            p371v5.C6549a.m13288b(r1)
            f4.n1 r1 = r3.f10260f
            java.util.ArrayList<g5.r$b> r2 = r3.f10255a
            r2.add(r4)
            android.os.Looper r2 = r3.f10259e
            if (r2 != 0) goto L27
            r3.f10259e = r0
            java.util.HashSet<g5.r$b> r0 = r3.f10256b
            r0.add(r4)
            r3.mo5941q(r5)
            goto L2f
        L27:
            if (r1 == 0) goto L2f
            r3.mo5932g(r4)
            r4.mo5383a(r3, r1)
        L2f:
            return
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: k */
    public final void mo5936k(p162j4.InterfaceC3403h r5) {
            r4 = this;
            j4.h$a r0 = r4.f10258d
            java.util.concurrent.CopyOnWriteArrayList<j4.h$a$a> r1 = r0.f14745c
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            j4.h$a$a r2 = (p162j4.InterfaceC3403h.a.C7396a) r2
            j4.h r3 = r2.f14747b
            if (r3 != r5) goto L8
            java.util.concurrent.CopyOnWriteArrayList<j4.h$a$a> r3 = r0.f14745c
            r3.remove(r2)
            goto L8
        L1e:
            return
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: l */
    public final void mo5937l(p108g5.InterfaceC2286u r5) {
            r4 = this;
            g5.u$a r0 = r4.f10257c
            java.util.concurrent.CopyOnWriteArrayList<g5.u$a$a> r1 = r0.f10433c
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            g5.u$a$a r2 = (p108g5.InterfaceC2286u.a.C7393a) r2
            g5.u r3 = r2.f10436b
            if (r3 != r5) goto L8
            java.util.concurrent.CopyOnWriteArrayList<g5.u$a$a> r3 = r0.f10433c
            r3.remove(r2)
            goto L8
        L1e:
            return
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: m */
    public final void mo5938m(android.os.Handler r3, p108g5.InterfaceC2286u r4) {
            r2 = this;
            g5.u$a r0 = r2.f10257c
            java.util.Objects.requireNonNull(r0)
            java.util.concurrent.CopyOnWriteArrayList<g5.u$a$a> r0 = r0.f10433c
            g5.u$a$a r1 = new g5.u$a$a
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    /* renamed from: o */
    public void mo5939o() {
            r0 = this;
            return
    }

    /* renamed from: p */
    public void mo5940p() {
            r0 = this;
            return
    }

    /* renamed from: q */
    public abstract void mo5941q(p352u5.InterfaceC6317g0 r1);

    /* renamed from: r */
    public final void m5942r(p088f4.AbstractC2031n1 r3) {
            r2 = this;
            r2.f10260f = r3
            java.util.ArrayList<g5.r$b> r0 = r2.f10255a
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            g5.r$b r1 = (p108g5.InterfaceC2283r.b) r1
            r1.mo5383a(r2, r3)
            goto L8
        L18:
            return
    }

    /* renamed from: s */
    public abstract void mo5943s();
}
