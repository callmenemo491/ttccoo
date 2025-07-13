package com.google.android.material.transformation;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {

    /* renamed from: c */
    public final p354u7.C6357h f6568c;

    /* renamed from: d */
    public final p354u7.C6357h f6569d;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C1236a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f6570a;

        /* renamed from: b */
        public final /* synthetic */ android.view.View f6571b;

        public C1236a(com.google.android.material.transformation.FabTransformationScrimBehavior r1, boolean r2, android.view.View r3) {
                r0 = this;
                r0.f6570a = r2
                r0.f6571b = r3
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.f6570a
                if (r2 != 0) goto La
                android.view.View r2 = r1.f6571b
                r0 = 4
                r2.setVisibility(r0)
            La:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.f6570a
                if (r2 == 0) goto La
                android.view.View r2 = r1.f6571b
                r0 = 0
                r2.setVisibility(r0)
            La:
                return
        }
    }

    public FabTransformationScrimBehavior() {
            r5 = this;
            r5.<init>()
            u7.h r0 = new u7.h
            r1 = 75
            r3 = 150(0x96, double:7.4E-322)
            r0.<init>(r1, r3)
            r5.f6568c = r0
            u7.h r0 = new u7.h
            r1 = 0
            r0.<init>(r1, r3)
            r5.f6569d = r0
            return
    }

    public FabTransformationScrimBehavior(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            u7.h r5 = new u7.h
            r0 = 75
            r2 = 150(0x96, double:7.4E-322)
            r5.<init>(r0, r2)
            r4.f6568c = r5
            u7.h r5 = new u7.h
            r0 = 0
            r5.<init>(r0, r2)
            r4.f6569d = r5
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: b */
    public boolean mo986b(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
            r0 = this;
            boolean r1 = r3 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: r */
    public boolean mo1002r(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.MotionEvent r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: u */
    public android.animation.AnimatorSet mo3617u(android.view.View r5, android.view.View r6, boolean r7, boolean r8) {
            r4 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r7 == 0) goto Lf
            u7.h r0 = r4.f6568c
            goto L11
        Lf:
            u7.h r0 = r4.f6569d
        L11:
            r1 = 0
            r2 = 0
            r3 = 1
            if (r7 == 0) goto L28
            if (r8 != 0) goto L1b
            r6.setAlpha(r1)
        L1b:
            android.util.Property r8 = android.view.View.ALPHA
            float[] r1 = new float[r3]
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r6, r8, r1)
            goto L32
        L28:
            android.util.Property r8 = android.view.View.ALPHA
            float[] r3 = new float[r3]
            r3[r2] = r1
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r6, r8, r3)
        L32:
            r0.m13010a(r8)
            r5.add(r8)
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            p185k7.C3836i.m8628m(r8, r5)
            com.google.android.material.transformation.FabTransformationScrimBehavior$a r5 = new com.google.android.material.transformation.FabTransformationScrimBehavior$a
            r5.<init>(r4, r7, r6)
            r8.addListener(r5)
            return r8
    }
}
