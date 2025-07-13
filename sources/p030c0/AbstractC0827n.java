package p030c0;

/* renamed from: c0.n */
/* loaded from: classes.dex */
public abstract class AbstractC0827n {

    /* renamed from: a */
    public p030c0.C0826m f4487a;

    public AbstractC0827n() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public void mo2481a(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = r2.mo2476c()
            if (r0 == 0) goto Lb
            java.lang.String r1 = "androidx.core.app.extra.COMPAT_TEMPLATE"
            r3.putString(r1, r0)
        Lb:
            return
    }

    /* renamed from: b */
    public abstract void mo2475b(p030c0.InterfaceC0822i r1);

    /* renamed from: c */
    public java.lang.String mo2476c() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: d */
    public android.widget.RemoteViews mo2489d(p030c0.InterfaceC0822i r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: e */
    public android.widget.RemoteViews mo2490e(p030c0.InterfaceC0822i r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: f */
    public void m2491f(p030c0.C0826m r2) {
            r1 = this;
            c0.m r0 = r1.f4487a
            if (r0 == r2) goto Lf
            r1.f4487a = r2
            c0.n r0 = r2.f4473m
            if (r0 == r1) goto Lf
            r2.f4473m = r1
            r1.m2491f(r2)
        Lf:
            return
    }
}
