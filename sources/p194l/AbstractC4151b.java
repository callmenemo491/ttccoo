package p194l;

/* renamed from: l.b */
/* loaded from: classes.dex */
public abstract class AbstractC4151b {

    /* renamed from: a */
    public java.lang.Object f17200a;

    /* renamed from: b */
    public p319s.C5941h<p138i0.InterfaceMenuItemC3056b, android.view.MenuItem> f17201b;

    /* renamed from: c */
    public p319s.C5941h<p138i0.InterfaceSubMenuC3057c, android.view.SubMenu> f17202c;

    public AbstractC4151b(int r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2 * 2
            float[] r0 = new float[r0]
            r1.f17201b = r0
            int[] r2 = new int[r2]
            r1.f17202c = r2
            return
    }

    public AbstractC4151b(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f17200a = r1
            return
    }

    /* renamed from: c */
    public abstract void mo9197c();

    /* renamed from: d */
    public float m9198d(int r1, int r2, int r3) {
            r0 = this;
            int r1 = r1 - r2
            float r1 = (float) r1
            float r2 = (float) r3
            float r1 = r1 / r2
            return r1
    }

    /* renamed from: e */
    public android.view.MenuItem m9199e(android.view.MenuItem r4) {
            r3 = this;
            boolean r0 = r4 instanceof p138i0.InterfaceMenuItemC3056b
            if (r0 == 0) goto L31
            r0 = r4
            i0.b r0 = (p138i0.InterfaceMenuItemC3056b) r0
            s.h<i0.b, android.view.MenuItem> r1 = r3.f17201b
            s.h r1 = (p319s.C5941h) r1
            if (r1 != 0) goto L14
            s.h r1 = new s.h
            r1.<init>()
            r3.f17201b = r1
        L14:
            s.h<i0.b, android.view.MenuItem> r1 = r3.f17201b
            s.h r1 = (p319s.C5941h) r1
            r2 = 0
            java.lang.Object r4 = r1.getOrDefault(r4, r2)
            android.view.MenuItem r4 = (android.view.MenuItem) r4
            if (r4 != 0) goto L31
            l.c r4 = new l.c
            java.lang.Object r1 = r3.f17200a
            android.content.Context r1 = (android.content.Context) r1
            r4.<init>(r1, r0)
            s.h<i0.b, android.view.MenuItem> r1 = r3.f17201b
            s.h r1 = (p319s.C5941h) r1
            r1.put(r0, r4)
        L31:
            return r4
    }

    /* renamed from: f */
    public android.view.SubMenu m9200f(android.view.SubMenu r3) {
            r2 = this;
            boolean r0 = r3 instanceof p138i0.InterfaceSubMenuC3057c
            if (r0 == 0) goto L30
            i0.c r3 = (p138i0.InterfaceSubMenuC3057c) r3
            s.h<i0.c, android.view.SubMenu> r0 = r2.f17202c
            s.h r0 = (p319s.C5941h) r0
            if (r0 != 0) goto L13
            s.h r0 = new s.h
            r0.<init>()
            r2.f17202c = r0
        L13:
            s.h<i0.c, android.view.SubMenu> r0 = r2.f17202c
            s.h r0 = (p319s.C5941h) r0
            java.lang.Object r0 = r0.get(r3)
            android.view.SubMenu r0 = (android.view.SubMenu) r0
            if (r0 != 0) goto L2f
            l.g r0 = new l.g
            java.lang.Object r1 = r2.f17200a
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1, r3)
            s.h<i0.c, android.view.SubMenu> r1 = r2.f17202c
            s.h r1 = (p319s.C5941h) r1
            r1.put(r3, r0)
        L2f:
            return r0
        L30:
            return r3
    }

    /* renamed from: g */
    public abstract void mo9201g();

    /* renamed from: h */
    public abstract void mo9202h(p348u1.AbstractC6284b r1);

    /* renamed from: i */
    public abstract void mo9203i();

    /* renamed from: j */
    public abstract void mo9204j();

    /* renamed from: k */
    public abstract void mo9205k();
}
