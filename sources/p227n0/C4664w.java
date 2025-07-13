package p227n0;

/* renamed from: n0.w */
/* loaded from: classes.dex */
public final class C4664w {

    /* renamed from: a */
    public java.lang.ref.WeakReference<android.view.View> f18590a;

    /* renamed from: n0.w$a */
    public class a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ p227n0.InterfaceC4665x f18591a;

        /* renamed from: b */
        public final /* synthetic */ android.view.View f18592b;

        public a(p227n0.C4664w r1, p227n0.InterfaceC4665x r2, android.view.View r3) {
                r0 = this;
                r0.f18591a = r2
                r0.f18592b = r3
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                n0.x r2 = r1.f18591a
                android.view.View r0 = r1.f18592b
                r2.mo653a(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                n0.x r2 = r1.f18591a
                android.view.View r0 = r1.f18592b
                r2.mo654b(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                n0.x r2 = r1.f18591a
                android.view.View r0 = r1.f18592b
                r2.mo655c(r0)
                return
        }
    }

    /* renamed from: n0.w$b */
    public class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ p227n0.InterfaceC4667z f18593a;

        public b(p227n0.C4664w r1, p227n0.InterfaceC4667z r2, android.view.View r3) {
                r0 = this;
                r0.f18593a = r2
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r1) {
                r0 = this;
                n0.z r1 = r0.f18593a
                f.x$c r1 = (p083f.C1937x.c) r1
                f.x r1 = r1.f8473a
                androidx.appcompat.widget.ActionBarContainer r1 = r1.f8449d
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                r1.invalidate()
                return
        }
    }

    public C4664w(android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f18590a = r0
            return
    }

    /* renamed from: a */
    public p227n0.C4664w m10668a(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f18590a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.alpha(r2)
        L11:
            return r1
    }

    /* renamed from: b */
    public void m10669b() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f18590a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
        L11:
            return
    }

    /* renamed from: c */
    public p227n0.C4664w m10670c(long r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f18590a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setDuration(r2)
        L11:
            return r1
    }

    /* renamed from: d */
    public p227n0.C4664w m10671d(p227n0.InterfaceC4665x r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f18590a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto Ld
            r1.m10672e(r0, r2)
        Ld:
            return r1
    }

    /* renamed from: e */
    public final void m10672e(android.view.View r3, p227n0.InterfaceC4665x r4) {
            r2 = this;
            if (r4 == 0) goto Lf
            android.view.ViewPropertyAnimator r0 = r3.animate()
            n0.w$a r1 = new n0.w$a
            r1.<init>(r2, r4, r3)
            r0.setListener(r1)
            goto L17
        Lf:
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r4 = 0
            r3.setListener(r4)
        L17:
            return
    }

    /* renamed from: f */
    public p227n0.C4664w m10673f(p227n0.InterfaceC4667z r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.f18590a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L19
            r1 = 0
            if (r3 == 0) goto L12
            n0.w$b r1 = new n0.w$b
            r1.<init>(r2, r3, r0)
        L12:
            android.view.ViewPropertyAnimator r3 = r0.animate()
            r3.setUpdateListener(r1)
        L19:
            return r2
    }

    /* renamed from: g */
    public p227n0.C4664w m10674g(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f18590a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationY(r2)
        L11:
            return r1
    }
}
