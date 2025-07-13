package p083f;

/* renamed from: f.j */
/* loaded from: classes.dex */
public abstract class AbstractC1923j {

    /* renamed from: Y */
    public static final p319s.C5936c<java.lang.ref.WeakReference<p083f.AbstractC1923j>> f8322Y = null;

    /* renamed from: Z */
    public static final java.lang.Object f8323Z = null;

    static {
            s.c r0 = new s.c
            r1 = 0
            r0.<init>(r1)
            p083f.AbstractC1923j.f8322Y = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p083f.AbstractC1923j.f8323Z = r0
            return
    }

    public AbstractC1923j() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: s */
    public static void m4710s(p083f.AbstractC1923j r3) {
            java.lang.Object r0 = p083f.AbstractC1923j.f8323Z
            monitor-enter(r0)
            s.c<java.lang.ref.WeakReference<f.j>> r1 = p083f.AbstractC1923j.f8322Y     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L25
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L25
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L25
            f.j r2 = (p083f.AbstractC1923j) r2     // Catch: java.lang.Throwable -> L25
            if (r2 == r3) goto L1f
            if (r2 != 0) goto L9
        L1f:
            r1.remove()     // Catch: java.lang.Throwable -> L25
            goto L9
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    /* renamed from: c */
    public abstract void mo4711c(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    /* renamed from: d */
    public android.content.Context mo4712d(android.content.Context r1) {
            r0 = this;
            return r1
    }

    /* renamed from: e */
    public abstract <T extends android.view.View> T mo4713e(int r1);

    /* renamed from: f */
    public int mo4714f() {
            r1 = this;
            r0 = -100
            return r0
    }

    /* renamed from: g */
    public abstract android.view.MenuInflater mo4715g();

    /* renamed from: h */
    public abstract p083f.AbstractC1914a mo4716h();

    /* renamed from: i */
    public abstract void mo4717i();

    /* renamed from: j */
    public abstract void mo4718j();

    /* renamed from: k */
    public abstract void mo4719k(android.content.res.Configuration r1);

    /* renamed from: l */
    public abstract void mo4720l(android.os.Bundle r1);

    /* renamed from: m */
    public abstract void mo4721m();

    /* renamed from: n */
    public abstract void mo4722n(android.os.Bundle r1);

    /* renamed from: o */
    public abstract void mo4723o();

    /* renamed from: p */
    public abstract void mo4724p(android.os.Bundle r1);

    /* renamed from: q */
    public abstract void mo4725q();

    /* renamed from: r */
    public abstract void mo4726r();

    /* renamed from: t */
    public abstract boolean mo4727t(int r1);

    /* renamed from: u */
    public abstract void mo4728u(int r1);

    /* renamed from: v */
    public abstract void mo4729v(android.view.View r1);

    /* renamed from: w */
    public abstract void mo4730w(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    /* renamed from: x */
    public void mo4731x(int r1) {
            r0 = this;
            return
    }

    /* renamed from: y */
    public abstract void mo4732y(java.lang.CharSequence r1);
}
