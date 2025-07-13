package com.google.android.material.floatingactionbutton;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: classes.dex */
public class C1191b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f6171a;

    /* renamed from: b */
    public final /* synthetic */ boolean f6172b;

    /* renamed from: c */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.C1193d.f f6173c;

    /* renamed from: d */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.C1193d f6174d;

    public C1191b(com.google.android.material.floatingactionbutton.C1193d r1, boolean r2, com.google.android.material.floatingactionbutton.C1193d.f r3) {
            r0 = this;
            r0.f6174d = r1
            r0.f6172b = r2
            r0.f6173c = r3
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            r1 = 1
            r0.f6171a = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            com.google.android.material.floatingactionbutton.d r3 = r2.f6174d
            r0 = 0
            r3.f6199o = r0
            r0 = 0
            r3.f6194j = r0
            boolean r0 = r2.f6171a
            if (r0 != 0) goto L26
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r3.f6203s
            boolean r0 = r2.f6172b
            if (r0 == 0) goto L15
            r1 = 8
            goto L16
        L15:
            r1 = 4
        L16:
            r3.m9888b(r1, r0)
            com.google.android.material.floatingactionbutton.d$f r3 = r2.f6173c
            if (r3 == 0) goto L26
            com.google.android.material.floatingactionbutton.a r3 = (com.google.android.material.floatingactionbutton.C1190a) r3
            com.google.android.material.floatingactionbutton.FloatingActionButton$a r0 = r3.f6169a
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r3.f6170b
            r0.mo3468a(r3)
        L26:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r4) {
            r3 = this;
            com.google.android.material.floatingactionbutton.d r0 = r3.f6174d
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r0.f6203s
            boolean r1 = r3.f6172b
            r2 = 0
            r0.m9888b(r2, r1)
            com.google.android.material.floatingactionbutton.d r0 = r3.f6174d
            r1 = 1
            r0.f6199o = r1
            r0.f6194j = r4
            r3.f6171a = r2
            return
    }
}
