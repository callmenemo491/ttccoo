package p177k;

/* renamed from: k.g */
/* loaded from: classes.dex */
public class C3623g {

    /* renamed from: a */
    public final java.util.ArrayList<p227n0.C4664w> f15994a;

    /* renamed from: b */
    public long f15995b;

    /* renamed from: c */
    public android.view.animation.Interpolator f15996c;

    /* renamed from: d */
    public p227n0.InterfaceC4665x f15997d;

    /* renamed from: e */
    public boolean f15998e;

    /* renamed from: f */
    public final p227n0.C4666y f15999f;

    /* renamed from: k.g$a */
    public class a extends p227n0.C4666y {

        /* renamed from: a */
        public boolean f16000a;

        /* renamed from: b */
        public int f16001b;

        /* renamed from: c */
        public final /* synthetic */ p177k.C3623g f16002c;

        public a(p177k.C3623g r1) {
                r0 = this;
                r0.f16002c = r1
                r0.<init>()
                r1 = 0
                r0.f16000a = r1
                r0.f16001b = r1
                return
        }

        @Override // p227n0.InterfaceC4665x
        /* renamed from: b */
        public void mo654b(android.view.View r2) {
                r1 = this;
                int r2 = r1.f16001b
                int r2 = r2 + 1
                r1.f16001b = r2
                k.g r0 = r1.f16002c
                java.util.ArrayList<n0.w> r0 = r0.f15994a
                int r0 = r0.size()
                if (r2 != r0) goto L23
                k.g r2 = r1.f16002c
                n0.x r2 = r2.f15997d
                if (r2 == 0) goto L1a
                r0 = 0
                r2.mo654b(r0)
            L1a:
                r2 = 0
                r1.f16001b = r2
                r1.f16000a = r2
                k.g r0 = r1.f16002c
                r0.f15998e = r2
            L23:
                return
        }

        @Override // p227n0.C4666y, p227n0.InterfaceC4665x
        /* renamed from: c */
        public void mo655c(android.view.View r2) {
                r1 = this;
                boolean r2 = r1.f16000a
                if (r2 == 0) goto L5
                return
            L5:
                r2 = 1
                r1.f16000a = r2
                k.g r2 = r1.f16002c
                n0.x r2 = r2.f15997d
                if (r2 == 0) goto L12
                r0 = 0
                r2.mo655c(r0)
            L12:
                return
        }
    }

    public C3623g() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f15995b = r0
            k.g$a r0 = new k.g$a
            r0.<init>(r2)
            r2.f15999f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f15994a = r0
            return
    }

    /* renamed from: a */
    public void m8069a() {
            r2 = this;
            boolean r0 = r2.f15998e
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList<n0.w> r0 = r2.f15994a
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            n0.w r1 = (p227n0.C4664w) r1
            r1.m10669b()
            goto Lb
        L1b:
            r0 = 0
            r2.f15998e = r0
            return
    }

    /* renamed from: b */
    public void m8070b() {
            r7 = this;
            boolean r0 = r7.f15998e
            if (r0 == 0) goto L5
            return
        L5:
            java.util.ArrayList<n0.w> r0 = r7.f15994a
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r0.next()
            n0.w r1 = (p227n0.C4664w) r1
            long r2 = r7.f15995b
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L22
            r1.m10670c(r2)
        L22:
            android.view.animation.Interpolator r2 = r7.f15996c
            if (r2 == 0) goto L37
            java.lang.ref.WeakReference<android.view.View> r3 = r1.f18590a
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L37
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r3.setInterpolator(r2)
        L37:
            n0.x r2 = r7.f15997d
            if (r2 == 0) goto L40
            n0.y r2 = r7.f15999f
            r1.m10671d(r2)
        L40:
            java.lang.ref.WeakReference<android.view.View> r1 = r1.f18590a
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto Lb
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.start()
            goto Lb
        L52:
            r0 = 1
            r7.f15998e = r0
            return
    }
}
