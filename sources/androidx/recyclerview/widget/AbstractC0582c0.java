package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC0582c0 {

    /* renamed from: a */
    public final androidx.recyclerview.widget.RecyclerView.AbstractC0557m f3380a;

    /* renamed from: b */
    public int f3381b;

    /* renamed from: c */
    public final android.graphics.Rect f3382c;

    public AbstractC0582c0(androidx.recyclerview.widget.RecyclerView.AbstractC0557m r1, androidx.recyclerview.widget.C0578a0 r2) {
            r0 = this;
            r0.<init>()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f3381b = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f3382c = r2
            r0.f3380a = r1
            return
    }

    /* renamed from: a */
    public static androidx.recyclerview.widget.AbstractC0582c0 m2015a(androidx.recyclerview.widget.RecyclerView.AbstractC0557m r1, int r2) {
            if (r2 == 0) goto L13
            r0 = 1
            if (r2 != r0) goto Lb
            androidx.recyclerview.widget.b0 r2 = new androidx.recyclerview.widget.b0
            r2.<init>(r1)
            return r2
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "invalid orientation"
            r1.<init>(r2)
            throw r1
        L13:
            androidx.recyclerview.widget.a0 r2 = new androidx.recyclerview.widget.a0
            r2.<init>(r1)
            return r2
    }

    /* renamed from: b */
    public abstract int mo1997b(android.view.View r1);

    /* renamed from: c */
    public abstract int mo1998c(android.view.View r1);

    /* renamed from: d */
    public abstract int mo1999d(android.view.View r1);

    /* renamed from: e */
    public abstract int mo2000e(android.view.View r1);

    /* renamed from: f */
    public abstract int mo2001f();

    /* renamed from: g */
    public abstract int mo2002g();

    /* renamed from: h */
    public abstract int mo2003h();

    /* renamed from: i */
    public abstract int mo2004i();

    /* renamed from: j */
    public abstract int mo2005j();

    /* renamed from: k */
    public abstract int mo2006k();

    /* renamed from: l */
    public abstract int mo2007l();

    /* renamed from: m */
    public int m2016m() {
            r2 = this;
            int r0 = r2.f3381b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L8
            r0 = 0
            goto Lf
        L8:
            int r0 = r2.mo2007l()
            int r1 = r2.f3381b
            int r0 = r0 - r1
        Lf:
            return r0
    }

    /* renamed from: n */
    public abstract int mo2008n(android.view.View r1);

    /* renamed from: o */
    public abstract int mo2009o(android.view.View r1);

    /* renamed from: p */
    public abstract void mo2010p(int r1);
}
