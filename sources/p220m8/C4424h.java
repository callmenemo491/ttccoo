package p220m8;

/* renamed from: m8.h */
/* loaded from: classes.dex */
public final class C4424h {

    /* renamed from: a */
    public final java.util.ArrayList<p220m8.C4424h.b> f18052a;

    /* renamed from: b */
    public p220m8.C4424h.b f18053b;

    /* renamed from: c */
    public android.animation.ValueAnimator f18054c;

    /* renamed from: d */
    public final android.animation.Animator.AnimatorListener f18055d;

    /* renamed from: m8.h$a */
    public class a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ p220m8.C4424h f18056a;

        public a(p220m8.C4424h r1) {
                r0 = this;
                r0.f18056a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                m8.h r0 = r2.f18056a
                android.animation.ValueAnimator r1 = r0.f18054c
                if (r1 != r3) goto L9
                r3 = 0
                r0.f18054c = r3
            L9:
                return
        }
    }

    /* renamed from: m8.h$b */
    public static class b {

        /* renamed from: a */
        public final int[] f18057a;

        /* renamed from: b */
        public final android.animation.ValueAnimator f18058b;

        public b(int[] r1, android.animation.ValueAnimator r2) {
                r0 = this;
                r0.<init>()
                r0.f18057a = r1
                r0.f18058b = r2
                return
        }
    }

    public C4424h() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f18052a = r0
            r0 = 0
            r1.f18053b = r0
            r1.f18054c = r0
            m8.h$a r0 = new m8.h$a
            r0.<init>(r1)
            r1.f18055d = r0
            return
    }

    /* renamed from: a */
    public void m9870a(int[] r2, android.animation.ValueAnimator r3) {
            r1 = this;
            m8.h$b r0 = new m8.h$b
            r0.<init>(r2, r3)
            android.animation.Animator$AnimatorListener r2 = r1.f18055d
            r3.addListener(r2)
            java.util.ArrayList<m8.h$b> r2 = r1.f18052a
            r2.add(r0)
            return
    }
}
