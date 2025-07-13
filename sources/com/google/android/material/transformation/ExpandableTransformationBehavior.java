package com.google.android.material.transformation;

@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends com.google.android.material.transformation.ExpandableBehavior {

    /* renamed from: b */
    public android.animation.AnimatorSet f6555b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    public class C1233a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.transformation.ExpandableTransformationBehavior f6556a;

        public C1233a(com.google.android.material.transformation.ExpandableTransformationBehavior r1) {
                r0 = this;
                r0.f6556a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.google.android.material.transformation.ExpandableTransformationBehavior r2 = r1.f6556a
                r0 = 0
                r2.f6555b = r0
                return
        }
    }

    public ExpandableTransformationBehavior() {
            r0 = this;
            r0.<init>()
            return
    }

    public ExpandableTransformationBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: t */
    public boolean mo3616t(android.view.View r4, android.view.View r5, boolean r6, boolean r7) {
            r3 = this;
            android.animation.AnimatorSet r0 = r3.f6555b
            r1 = 1
            if (r0 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            if (r2 == 0) goto Ld
            r0.cancel()
        Ld:
            android.animation.AnimatorSet r4 = r3.mo3617u(r4, r5, r6, r2)
            r3.f6555b = r4
            com.google.android.material.transformation.ExpandableTransformationBehavior$a r5 = new com.google.android.material.transformation.ExpandableTransformationBehavior$a
            r5.<init>(r3)
            r4.addListener(r5)
            android.animation.AnimatorSet r4 = r3.f6555b
            r4.start()
            if (r7 != 0) goto L27
            android.animation.AnimatorSet r4 = r3.f6555b
            r4.end()
        L27:
            return r1
    }

    /* renamed from: u */
    public abstract android.animation.AnimatorSet mo3617u(android.view.View r1, android.view.View r2, boolean r3, boolean r4);
}
