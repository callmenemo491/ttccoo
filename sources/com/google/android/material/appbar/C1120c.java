package com.google.android.material.appbar;

/* renamed from: com.google.android.material.appbar.c */
/* loaded from: classes.dex */
public class C1120c implements p242o0.InterfaceC4870d {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout f5781a;

    /* renamed from: b */
    public final /* synthetic */ boolean f5782b;

    public C1120c(com.google.android.material.appbar.AppBarLayout.BaseBehavior r1, com.google.android.material.appbar.AppBarLayout r2, boolean r3) {
            r0 = this;
            r0.f5781a = r2
            r0.f5782b = r3
            r0.<init>()
            return
    }

    @Override // p242o0.InterfaceC4870d
    /* renamed from: a */
    public boolean mo36a(android.view.View r1, p242o0.InterfaceC4870d.a r2) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout r1 = r0.f5781a
            boolean r2 = r0.f5782b
            r1.setExpanded(r2)
            r1 = 1
            return r1
    }
}
