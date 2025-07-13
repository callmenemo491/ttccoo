package androidx.fragment.app;

/* renamed from: androidx.fragment.app.g */
/* loaded from: classes.dex */
public class C0381g implements p158j0.C3380b.a {

    /* renamed from: a */
    public final /* synthetic */ android.view.View f2169a;

    /* renamed from: b */
    public final /* synthetic */ android.view.ViewGroup f2170b;

    /* renamed from: c */
    public final /* synthetic */ androidx.fragment.app.C0371c.b f2171c;

    public C0381g(androidx.fragment.app.C0371c r1, android.view.View r2, android.view.ViewGroup r3, androidx.fragment.app.C0371c.b r4) {
            r0 = this;
            r0.f2169a = r2
            r0.f2170b = r3
            r0.f2171c = r4
            r0.<init>()
            return
    }

    @Override // p158j0.C3380b.a
    /* renamed from: a */
    public void mo1106a() {
            r2 = this;
            android.view.View r0 = r2.f2169a
            r0.clearAnimation()
            android.view.ViewGroup r0 = r2.f2170b
            android.view.View r1 = r2.f2169a
            r0.endViewTransition(r1)
            androidx.fragment.app.c$b r0 = r2.f2171c
            r0.m1114a()
            return
    }
}
