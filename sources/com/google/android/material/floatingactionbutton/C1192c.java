package com.google.android.material.floatingactionbutton;

/* renamed from: com.google.android.material.floatingactionbutton.c */
/* loaded from: classes.dex */
public class C1192c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f6175a;

    /* renamed from: b */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.C1193d.f f6176b;

    /* renamed from: c */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.C1193d f6177c;

    public C1192c(com.google.android.material.floatingactionbutton.C1193d r1, boolean r2, com.google.android.material.floatingactionbutton.C1193d.f r3) {
            r0 = this;
            r0.f6177c = r1
            r0.f6175a = r2
            r0.f6176b = r3
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r2 = r1.f6177c
            r0 = 0
            r2.f6199o = r0
            r0 = 0
            r2.f6194j = r0
            com.google.android.material.floatingactionbutton.d$f r2 = r1.f6176b
            if (r2 == 0) goto L15
            com.google.android.material.floatingactionbutton.a r2 = (com.google.android.material.floatingactionbutton.C1190a) r2
            com.google.android.material.floatingactionbutton.FloatingActionButton$a r0 = r2.f6169a
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = r2.f6170b
            r0.mo3469b(r2)
        L15:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r4) {
            r3 = this;
            com.google.android.material.floatingactionbutton.d r0 = r3.f6177c
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r0.f6203s
            boolean r1 = r3.f6175a
            r2 = 0
            r0.m9888b(r2, r1)
            com.google.android.material.floatingactionbutton.d r0 = r3.f6177c
            r1 = 2
            r0.f6199o = r1
            r0.f6194j = r4
            return
    }
}
