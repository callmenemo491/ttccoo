package p092f8;

/* renamed from: f8.d */
/* loaded from: classes.dex */
public interface InterfaceC2082d {

    /* renamed from: f8.d$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: f8.d$b */
    public static class b implements android.animation.TypeEvaluator<p092f8.InterfaceC2082d.e> {

        /* renamed from: b */
        public static final android.animation.TypeEvaluator<p092f8.InterfaceC2082d.e> f9496b = null;

        /* renamed from: a */
        public final p092f8.InterfaceC2082d.e f9497a;

        static {
                f8.d$b r0 = new f8.d$b
                r0.<init>()
                p092f8.InterfaceC2082d.b.f9496b = r0
                return
        }

        public b() {
                r2 = this;
                r2.<init>()
                f8.d$e r0 = new f8.d$e
                r1 = 0
                r0.<init>(r1)
                r2.f9497a = r0
                return
        }

        @Override // android.animation.TypeEvaluator
        public p092f8.InterfaceC2082d.e evaluate(float r5, p092f8.InterfaceC2082d.e r6, p092f8.InterfaceC2082d.e r7) {
                r4 = this;
                f8.d$e r6 = (p092f8.InterfaceC2082d.e) r6
                f8.d$e r7 = (p092f8.InterfaceC2082d.e) r7
                f8.d$e r0 = r4.f9497a
                float r1 = r6.f9500a
                float r2 = r7.f9500a
                float r1 = p185k7.C3828h5.m8610y(r1, r2, r5)
                float r2 = r6.f9501b
                float r3 = r7.f9501b
                float r2 = p185k7.C3828h5.m8610y(r2, r3, r5)
                float r6 = r6.f9502c
                float r7 = r7.f9502c
                float r5 = p185k7.C3828h5.m8610y(r6, r7, r5)
                r0.f9500a = r1
                r0.f9501b = r2
                r0.f9502c = r5
                f8.d$e r5 = r4.f9497a
                return r5
        }
    }

    /* renamed from: f8.d$c */
    public static class c extends android.util.Property<p092f8.InterfaceC2082d, p092f8.InterfaceC2082d.e> {

        /* renamed from: a */
        public static final android.util.Property<p092f8.InterfaceC2082d, p092f8.InterfaceC2082d.e> f9498a = null;

        static {
                f8.d$c r0 = new f8.d$c
                java.lang.String r1 = "circularReveal"
                r0.<init>(r1)
                p092f8.InterfaceC2082d.c.f9498a = r0
                return
        }

        public c(java.lang.String r2) {
                r1 = this;
                java.lang.Class<f8.d$e> r0 = p092f8.InterfaceC2082d.e.class
                r1.<init>(r0, r2)
                return
        }

        @Override // android.util.Property
        public p092f8.InterfaceC2082d.e get(p092f8.InterfaceC2082d r1) {
                r0 = this;
                f8.d r1 = (p092f8.InterfaceC2082d) r1
                f8.d$e r1 = r1.getRevealInfo()
                return r1
        }

        @Override // android.util.Property
        public void set(p092f8.InterfaceC2082d r1, p092f8.InterfaceC2082d.e r2) {
                r0 = this;
                f8.d r1 = (p092f8.InterfaceC2082d) r1
                f8.d$e r2 = (p092f8.InterfaceC2082d.e) r2
                r1.setRevealInfo(r2)
                return
        }
    }

    /* renamed from: f8.d$d */
    public static class d extends android.util.Property<p092f8.InterfaceC2082d, java.lang.Integer> {

        /* renamed from: a */
        public static final android.util.Property<p092f8.InterfaceC2082d, java.lang.Integer> f9499a = null;

        static {
                f8.d$d r0 = new f8.d$d
                java.lang.String r1 = "circularRevealScrimColor"
                r0.<init>(r1)
                p092f8.InterfaceC2082d.d.f9499a = r0
                return
        }

        public d(java.lang.String r2) {
                r1 = this;
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                r1.<init>(r0, r2)
                return
        }

        @Override // android.util.Property
        public java.lang.Integer get(p092f8.InterfaceC2082d r1) {
                r0 = this;
                f8.d r1 = (p092f8.InterfaceC2082d) r1
                int r1 = r1.getCircularRevealScrimColor()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
        }

        @Override // android.util.Property
        public void set(p092f8.InterfaceC2082d r1, java.lang.Integer r2) {
                r0 = this;
                f8.d r1 = (p092f8.InterfaceC2082d) r1
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setCircularRevealScrimColor(r2)
                return
        }
    }

    /* renamed from: f8.d$e */
    public static class e {

        /* renamed from: a */
        public float f9500a;

        /* renamed from: b */
        public float f9501b;

        /* renamed from: c */
        public float f9502c;

        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        public e(float r1, float r2, float r3) {
                r0 = this;
                r0.<init>()
                r0.f9500a = r1
                r0.f9501b = r2
                r0.f9502c = r3
                return
        }

        public e(p092f8.InterfaceC2082d.a r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: a */
    void mo5504a();

    /* renamed from: b */
    void mo5505b();

    int getCircularRevealScrimColor();

    p092f8.InterfaceC2082d.e getRevealInfo();

    void setCircularRevealOverlayDrawable(android.graphics.drawable.Drawable r1);

    void setCircularRevealScrimColor(int r1);

    void setRevealInfo(p092f8.InterfaceC2082d.e r1);
}
