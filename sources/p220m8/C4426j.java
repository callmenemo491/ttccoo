package p220m8;

/* renamed from: m8.j */
/* loaded from: classes.dex */
public class C4426j {

    /* renamed from: a */
    public final android.text.TextPaint f18075a;

    /* renamed from: b */
    public final p124h7.AbstractC2951xf f18076b;

    /* renamed from: c */
    public float f18077c;

    /* renamed from: d */
    public boolean f18078d;

    /* renamed from: e */
    public java.lang.ref.WeakReference<p220m8.C4426j.b> f18079e;

    /* renamed from: f */
    public p288q8.C5600d f18080f;

    /* renamed from: m8.j$a */
    public class a extends p124h7.AbstractC2951xf {

        /* renamed from: b */
        public final /* synthetic */ p220m8.C4426j f18081b;

        public a(p220m8.C4426j r1) {
                r0 = this;
                r0.f18081b = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // p124h7.AbstractC2951xf
        /* renamed from: a */
        public void mo3339a(int r2) {
                r1 = this;
                m8.j r2 = r1.f18081b
                r0 = 1
                r2.f18078d = r0
                java.lang.ref.WeakReference<m8.j$b> r2 = r2.f18079e
                java.lang.Object r2 = r2.get()
                m8.j$b r2 = (p220m8.C4426j.b) r2
                if (r2 == 0) goto L12
                r2.mo3378a()
            L12:
                return
        }

        @Override // p124h7.AbstractC2951xf
        /* renamed from: b */
        public void mo3340b(android.graphics.Typeface r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L3
                return
            L3:
                m8.j r1 = r0.f18081b
                r2 = 1
                r1.f18078d = r2
                java.lang.ref.WeakReference<m8.j$b> r1 = r1.f18079e
                java.lang.Object r1 = r1.get()
                m8.j$b r1 = (p220m8.C4426j.b) r1
                if (r1 == 0) goto L15
                r1.mo3378a()
            L15:
                return
        }
    }

    /* renamed from: m8.j$b */
    public interface b {
        /* renamed from: a */
        void mo3378a();

        int[] getState();

        boolean onStateChange(int[] r1);
    }

    public C4426j(p220m8.C4426j.b r3) {
            r2 = this;
            r2.<init>()
            android.text.TextPaint r0 = new android.text.TextPaint
            r1 = 1
            r0.<init>(r1)
            r2.f18075a = r0
            m8.j$a r0 = new m8.j$a
            r0.<init>(r2)
            r2.f18076b = r0
            r2.f18078d = r1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r2.f18079e = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f18079e = r0
            return
    }

    /* renamed from: a */
    public float m9872a(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.f18078d
            if (r0 != 0) goto L7
            float r4 = r3.f18077c
            return r4
        L7:
            r0 = 0
            if (r4 != 0) goto Lc
            r4 = 0
            goto L16
        Lc:
            android.text.TextPaint r1 = r3.f18075a
            int r2 = r4.length()
            float r4 = r1.measureText(r4, r0, r2)
        L16:
            r3.f18077c = r4
            r3.f18078d = r0
            return r4
    }

    /* renamed from: b */
    public void m9873b(p288q8.C5600d r3, android.content.Context r4) {
            r2 = this;
            q8.d r0 = r2.f18080f
            if (r0 == r3) goto L3f
            r2.f18080f = r3
            if (r3 == 0) goto L2b
            android.text.TextPaint r0 = r2.f18075a
            h7.xf r1 = r2.f18076b
            r3.m11886f(r4, r0, r1)
            java.lang.ref.WeakReference<m8.j$b> r0 = r2.f18079e
            java.lang.Object r0 = r0.get()
            m8.j$b r0 = (p220m8.C4426j.b) r0
            if (r0 == 0) goto L21
            android.text.TextPaint r1 = r2.f18075a
            int[] r0 = r0.getState()
            r1.drawableState = r0
        L21:
            android.text.TextPaint r0 = r2.f18075a
            h7.xf r1 = r2.f18076b
            r3.m11885e(r4, r0, r1)
            r3 = 1
            r2.f18078d = r3
        L2b:
            java.lang.ref.WeakReference<m8.j$b> r3 = r2.f18079e
            java.lang.Object r3 = r3.get()
            m8.j$b r3 = (p220m8.C4426j.b) r3
            if (r3 == 0) goto L3f
            r3.mo3378a()
            int[] r4 = r3.getState()
            r3.onStateChange(r4)
        L3f:
            return
    }
}
