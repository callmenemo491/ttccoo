package p373v7;

/* renamed from: v7.a */
/* loaded from: classes.dex */
public class C6578a implements p227n0.InterfaceC4653l {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout f25732a;

    public C6578a(com.google.android.material.appbar.AppBarLayout r1) {
            r0 = this;
            r0.f25732a = r1
            r0.<init>()
            return
    }

    @Override // p227n0.InterfaceC4653l
    /* renamed from: a */
    public p227n0.C4642a0 mo984a(android.view.View r3, p227n0.C4642a0 r4) {
            r2 = this;
            com.google.android.material.appbar.AppBarLayout r3 = r2.f25732a
            java.util.Objects.requireNonNull(r3)
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.c.m10554b(r3)
            if (r0 == 0) goto Lf
            r0 = r4
            goto L10
        Lf:
            r0 = 0
        L10:
            n0.a0 r1 = r3.f5749g0
            boolean r1 = java.util.Objects.equals(r1, r0)
            if (r1 != 0) goto L20
            r3.f5749g0 = r0
            r3.m3246f()
            r3.requestLayout()
        L20:
            return r4
    }
}
