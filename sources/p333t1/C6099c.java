package p333t1;

/* renamed from: t1.c */
/* loaded from: classes.dex */
public class C6099c extends p333t1.AbstractC6121y {

    /* renamed from: t1.c$a */
    public class a extends p333t1.C6107k {

        /* renamed from: a */
        public final /* synthetic */ android.view.View f23559a;

        public a(p333t1.C6099c r1, android.view.View r2) {
                r0 = this;
                r0.f23559a = r2
                r0.<init>()
                return
        }

        @Override // p333t1.AbstractC6104h.d
        /* renamed from: a */
        public void mo12591a(p333t1.AbstractC6104h r4) {
                r3 = this;
                android.view.View r0 = r3.f23559a
                t1.w r1 = p333t1.C6113q.f23625a
                r2 = 1065353216(0x3f800000, float:1.0)
                r1.mo12644e(r0, r2)
                android.view.View r0 = r3.f23559a
                r1.mo12641a(r0)
                r4.mo12630z(r3)
                return
        }
    }

    /* renamed from: t1.c$b */
    public static class b extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        public final android.view.View f23560a;

        /* renamed from: b */
        public boolean f23561b;

        public b(android.view.View r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f23561b = r0
                r1.f23560a = r2
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                android.view.View r3 = r2.f23560a
                t1.w r0 = p333t1.C6113q.f23625a
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.mo12644e(r3, r1)
                boolean r3 = r2.f23561b
                if (r3 == 0) goto L14
                android.view.View r3 = r2.f23560a
                r0 = 0
                r1 = 0
                r3.setLayerType(r0, r1)
            L14:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r3) {
                r2 = this;
                android.view.View r3 = r2.f23560a
                java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
                boolean r3 = p227n0.C4661t.c.m10560h(r3)
                if (r3 == 0) goto L1c
                android.view.View r3 = r2.f23560a
                int r3 = r3.getLayerType()
                if (r3 != 0) goto L1c
                r3 = 1
                r2.f23561b = r3
                android.view.View r3 = r2.f23560a
                r0 = 2
                r1 = 0
                r3.setLayerType(r0, r1)
            L1c:
                return
        }
    }

    public C6099c(int r2) {
            r1 = this;
            r1.<init>()
            r0 = r2 & (-4)
            if (r0 != 0) goto La
            r1.f23641v0 = r2
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only MODE_IN and MODE_OUT flags are allowed"
            r2.<init>(r0)
            throw r2
    }

    @Override // p333t1.AbstractC6121y
    /* renamed from: O */
    public android.animation.Animator mo12595O(android.view.ViewGroup r1, android.view.View r2, p333t1.C6111o r3, p333t1.C6111o r4) {
            r0 = this;
            t1.w r1 = p333t1.C6113q.f23625a
            r1.mo12643c(r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.f23621a
            java.lang.String r3 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r3)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L16
            float r1 = r1.floatValue()
            goto L18
        L16:
            r1 = 1065353216(0x3f800000, float:1.0)
        L18:
            r3 = 0
            android.animation.Animator r1 = r0.m12596P(r2, r1, r3)
            return r1
    }

    /* renamed from: P */
    public final android.animation.Animator m12596P(android.view.View r3, float r4, float r5) {
            r2 = this;
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            t1.w r0 = p333t1.C6113q.f23625a
            r0.mo12644e(r3, r4)
            android.util.Property<android.view.View, java.lang.Float> r4 = p333t1.C6113q.f23626b
            r0 = 1
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r3, r4, r0)
            t1.c$b r5 = new t1.c$b
            r5.<init>(r3)
            r4.addListener(r5)
            t1.c$a r5 = new t1.c$a
            r5.<init>(r2, r3)
            r2.mo12616a(r5)
            return r4
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: g */
    public void mo9876g(p333t1.C6111o r3) {
            r2 = this;
            r2.m12649M(r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f23621a
            android.view.View r3 = r3.f23622b
            float r3 = p333t1.C6113q.m12639a(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.String r1 = "android:fade:transitionAlpha"
            r0.put(r1, r3)
            return
    }
}
