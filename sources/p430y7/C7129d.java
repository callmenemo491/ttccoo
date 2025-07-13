package p430y7;

/* renamed from: y7.d */
/* loaded from: classes.dex */
public class C7129d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f27540a;

    /* renamed from: b */
    public final /* synthetic */ androidx.appcompat.widget.ActionMenuView f27541b;

    /* renamed from: c */
    public final /* synthetic */ int f27542c;

    /* renamed from: d */
    public final /* synthetic */ boolean f27543d;

    /* renamed from: e */
    public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar f27544e;

    public C7129d(com.google.android.material.bottomappbar.BottomAppBar r1, androidx.appcompat.widget.ActionMenuView r2, int r3, boolean r4) {
            r0 = this;
            r0.f27544e = r1
            r0.f27541b = r2
            r0.f27542c = r3
            r0.f27543d = r4
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            r1 = 1
            r0.f27540a = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r6) {
            r5 = this;
            boolean r6 = r5.f27540a
            if (r6 != 0) goto L35
            com.google.android.material.bottomappbar.BottomAppBar r6 = r5.f27544e
            int r0 = r6.f5808T0
            r1 = 0
            if (r0 == 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r0 == 0) goto L1c
            r6.f5808T0 = r1
            android.view.Menu r1 = r6.getMenu()
            r1.clear()
            r6.m636n(r0)
        L1c:
            com.google.android.material.bottomappbar.BottomAppBar r6 = r5.f27544e
            androidx.appcompat.widget.ActionMenuView r0 = r5.f27541b
            int r1 = r5.f27542c
            boolean r3 = r5.f27543d
            java.util.Objects.requireNonNull(r6)
            y7.e r4 = new y7.e
            r4.<init>(r6, r0, r1, r3)
            if (r2 == 0) goto L32
            r0.post(r4)
            goto L35
        L32:
            r4.run()
        L35:
            return
    }
}
