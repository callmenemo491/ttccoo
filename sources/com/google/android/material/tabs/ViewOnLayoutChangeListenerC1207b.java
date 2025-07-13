package com.google.android.material.tabs;

/* renamed from: com.google.android.material.tabs.b */
/* loaded from: classes.dex */
public class ViewOnLayoutChangeListenerC1207b implements android.view.View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ android.view.View f6341a;

    /* renamed from: b */
    public final /* synthetic */ com.google.android.material.tabs.TabLayout.C1204h f6342b;

    public ViewOnLayoutChangeListenerC1207b(com.google.android.material.tabs.TabLayout.C1204h r1, android.view.View r2) {
            r0 = this;
            r0.f6342b = r1
            r0.f6341a = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            android.view.View r1 = r0.f6341a
            int r1 = r1.getVisibility()
            if (r1 != 0) goto Lf
            com.google.android.material.tabs.TabLayout$h r1 = r0.f6342b
            android.view.View r2 = r0.f6341a
            r1.m3533e(r2)
        Lf:
            return
    }
}
