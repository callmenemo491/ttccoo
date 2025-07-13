package p365v;

/* renamed from: v.b */
/* loaded from: classes.dex */
public class C6475b implements p365v.C6477d.a {

    /* renamed from: a */
    public p365v.C6481h f25070a;

    /* renamed from: b */
    public float f25071b;

    /* renamed from: c */
    public java.util.ArrayList<p365v.C6481h> f25072c;

    /* renamed from: d */
    public p365v.C6475b.a f25073d;

    /* renamed from: e */
    public boolean f25074e;

    /* renamed from: v.b$a */
    public interface a {
        /* renamed from: a */
        float mo13089a(int r1);

        /* renamed from: b */
        float mo13090b(p365v.C6475b r1, boolean r2);

        /* renamed from: c */
        void mo13091c(p365v.C6481h r1, float r2);

        void clear();

        /* renamed from: d */
        int mo13092d();

        /* renamed from: e */
        float mo13093e(p365v.C6481h r1, boolean r2);

        /* renamed from: f */
        void mo13094f(p365v.C6481h r1, float r2, boolean r3);

        /* renamed from: g */
        float mo13095g(p365v.C6481h r1);

        /* renamed from: h */
        p365v.C6481h mo13096h(int r1);

        /* renamed from: i */
        boolean mo13097i(p365v.C6481h r1);

        /* renamed from: j */
        void mo13098j(float r1);

        /* renamed from: k */
        void mo13099k();
    }

    public C6475b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f25070a = r0
            r0 = 0
            r1.f25071b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f25072c = r0
            r0 = 0
            r1.f25074e = r0
            return
    }

    public C6475b(p365v.C6476c r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f25070a = r0
            r0 = 0
            r1.f25071b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f25072c = r0
            r0 = 0
            r1.f25074e = r0
            v.a r0 = new v.a
            r0.<init>(r1, r2)
            r1.f25073d = r0
            return
    }

    @Override // p365v.C6477d.a
    /* renamed from: a */
    public p365v.C6481h mo13100a(p365v.C6477d r1, boolean[] r2) {
            r0 = this;
            r1 = 0
            v.h r1 = r0.m13108i(r2, r1)
            return r1
    }

    @Override // p365v.C6477d.a
    /* renamed from: b */
    public void mo13101b(p365v.C6481h r3) {
            r2 = this;
            int r0 = r3.f25110d
            r1 = 1
            if (r0 != r1) goto L6
            goto L21
        L6:
            r1 = 2
            if (r0 != r1) goto Lc
            r0 = 1148846080(0x447a0000, float:1000.0)
            goto L23
        Lc:
            r1 = 3
            if (r0 != r1) goto L13
            r0 = 1232348160(0x49742400, float:1000000.0)
            goto L23
        L13:
            r1 = 4
            if (r0 != r1) goto L1a
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            goto L23
        L1a:
            r1 = 5
            if (r0 != r1) goto L21
            r0 = 1399379109(0x5368d4a5, float:1.0E12)
            goto L23
        L21:
            r0 = 1065353216(0x3f800000, float:1.0)
        L23:
            v.b$a r1 = r2.f25073d
            r1.mo13091c(r3, r0)
            return
    }

    /* renamed from: c */
    public p365v.C6475b m13102c(p365v.C6477d r4, int r5) {
            r3 = this;
            v.b$a r0 = r3.f25073d
            java.lang.String r1 = "ep"
            v.h r1 = r4.m13133k(r5, r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.mo13091c(r1, r2)
            v.b$a r0 = r3.f25073d
            java.lang.String r1 = "em"
            v.h r4 = r4.m13133k(r5, r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.mo13091c(r4, r5)
            return r3
    }

    @Override // p365v.C6477d.a
    public void clear() {
            r1 = this;
            v.b$a r0 = r1.f25073d
            r0.clear()
            r0 = 0
            r1.f25070a = r0
            r0 = 0
            r1.f25071b = r0
            return
    }

    /* renamed from: d */
    public p365v.C6475b m13103d(p365v.C6481h r3, p365v.C6481h r4, p365v.C6481h r5, p365v.C6481h r6, float r7) {
            r2 = this;
            v.b$a r0 = r2.f25073d
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.mo13091c(r3, r1)
            v.b$a r3 = r2.f25073d
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.mo13091c(r4, r0)
            v.b$a r3 = r2.f25073d
            r3.mo13091c(r5, r7)
            v.b$a r3 = r2.f25073d
            float r4 = -r7
            r3.mo13091c(r6, r4)
            return r2
    }

    /* renamed from: e */
    public p365v.C6475b m13104e(p365v.C6481h r3, p365v.C6481h r4, p365v.C6481h r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto Lb
            if (r6 >= 0) goto L8
            int r6 = r6 * (-1)
            r0 = 1
        L8:
            float r6 = (float) r6
            r2.f25071b = r6
        Lb:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L21
            v.b$a r0 = r2.f25073d
            r0.mo13091c(r3, r6)
            v.b$a r3 = r2.f25073d
            r3.mo13091c(r4, r1)
            v.b$a r3 = r2.f25073d
            r3.mo13091c(r5, r1)
            goto L30
        L21:
            v.b$a r0 = r2.f25073d
            r0.mo13091c(r3, r1)
            v.b$a r3 = r2.f25073d
            r3.mo13091c(r4, r6)
            v.b$a r3 = r2.f25073d
            r3.mo13091c(r5, r6)
        L30:
            return r2
    }

    /* renamed from: f */
    public p365v.C6475b m13105f(p365v.C6481h r3, p365v.C6481h r4, p365v.C6481h r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto Lb
            if (r6 >= 0) goto L8
            int r6 = r6 * (-1)
            r0 = 1
        L8:
            float r6 = (float) r6
            r2.f25071b = r6
        Lb:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L21
            v.b$a r0 = r2.f25073d
            r0.mo13091c(r3, r6)
            v.b$a r3 = r2.f25073d
            r3.mo13091c(r4, r1)
            v.b$a r3 = r2.f25073d
            r3.mo13091c(r5, r6)
            goto L30
        L21:
            v.b$a r0 = r2.f25073d
            r0.mo13091c(r3, r1)
            v.b$a r3 = r2.f25073d
            r3.mo13091c(r4, r6)
            v.b$a r3 = r2.f25073d
            r3.mo13091c(r5, r1)
        L30:
            return r2
    }

    /* renamed from: g */
    public p365v.C6475b m13106g(p365v.C6481h r3, p365v.C6481h r4, p365v.C6481h r5, p365v.C6481h r6, float r7) {
            r2 = this;
            v.b$a r0 = r2.f25073d
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.mo13091c(r5, r1)
            v.b$a r5 = r2.f25073d
            r5.mo13091c(r6, r1)
            v.b$a r5 = r2.f25073d
            r6 = -1090519040(0xffffffffbf000000, float:-0.5)
            r5.mo13091c(r3, r6)
            v.b$a r3 = r2.f25073d
            r3.mo13091c(r4, r6)
            float r3 = -r7
            r2.f25071b = r3
            return r2
    }

    /* renamed from: h */
    public final boolean m13107h(p365v.C6481h r2) {
            r1 = this;
            int r2 = r2.f25118l
            r0 = 1
            if (r2 > r0) goto L6
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: i */
    public final p365v.C6481h m13108i(boolean[] r10, p365v.C6481h r11) {
            r9 = this;
            v.b$a r0 = r9.f25073d
            int r0 = r0.mo13092d()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        La:
            if (r3 >= r0) goto L37
            v.b$a r5 = r9.f25073d
            float r5 = r5.mo13089a(r3)
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 >= 0) goto L34
            v.b$a r6 = r9.f25073d
            v.h r6 = r6.mo13096h(r3)
            if (r10 == 0) goto L24
            int r7 = r6.f25108b
            boolean r7 = r10[r7]
            if (r7 != 0) goto L34
        L24:
            if (r6 == r11) goto L34
            int r7 = r6.f25115i
            r8 = 3
            if (r7 == r8) goto L2e
            r8 = 4
            if (r7 != r8) goto L34
        L2e:
            int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r7 >= 0) goto L34
            r4 = r5
            r2 = r6
        L34:
            int r3 = r3 + 1
            goto La
        L37:
            return r2
    }

    @Override // p365v.C6477d.a
    public boolean isEmpty() {
            r2 = this;
            v.h r0 = r2.f25070a
            if (r0 != 0) goto L15
            float r0 = r2.f25071b
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L15
            v.b$a r0 = r2.f25073d
            int r0 = r0.mo13092d()
            if (r0 != 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    /* renamed from: j */
    public void m13109j(p365v.C6481h r4) {
            r3 = this;
            v.h r0 = r3.f25070a
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L13
            v.b$a r2 = r3.f25073d
            r2.mo13091c(r0, r1)
            v.h r0 = r3.f25070a
            r2 = -1
            r0.f25109c = r2
            r0 = 0
            r3.f25070a = r0
        L13:
            v.b$a r0 = r3.f25073d
            r2 = 1
            float r0 = r0.mo13093e(r4, r2)
            float r0 = r0 * r1
            r3.f25070a = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            return
        L25:
            float r4 = r3.f25071b
            float r4 = r4 / r0
            r3.f25071b = r4
            v.b$a r4 = r3.f25073d
            r4.mo13098j(r0)
            return
    }

    /* renamed from: k */
    public void m13110k(p365v.C6477d r4, p365v.C6481h r5, boolean r6) {
            r3 = this;
            boolean r0 = r5.f25112f
            if (r0 != 0) goto L5
            return
        L5:
            v.b$a r0 = r3.f25073d
            float r0 = r0.mo13095g(r5)
            float r1 = r3.f25071b
            float r2 = r5.f25111e
            float r2 = r2 * r0
            float r2 = r2 + r1
            r3.f25071b = r2
            v.b$a r0 = r3.f25073d
            r0.mo13093e(r5, r6)
            if (r6 == 0) goto L1e
            r5.m13156b(r3)
        L1e:
            v.b$a r5 = r3.f25073d
            int r5 = r5.mo13092d()
            if (r5 != 0) goto L2b
            r5 = 1
            r3.f25074e = r5
            r4.f25082a = r5
        L2b:
            return
    }

    /* renamed from: l */
    public void mo13111l(p365v.C6477d r4, p365v.C6475b r5, boolean r6) {
            r3 = this;
            v.b$a r0 = r3.f25073d
            float r0 = r0.mo13090b(r5, r6)
            float r1 = r3.f25071b
            float r2 = r5.f25071b
            float r2 = r2 * r0
            float r2 = r2 + r1
            r3.f25071b = r2
            if (r6 == 0) goto L16
            v.h r5 = r5.f25070a
            r5.m13156b(r3)
        L16:
            v.h r5 = r3.f25070a
            if (r5 == 0) goto L27
            v.b$a r5 = r3.f25073d
            int r5 = r5.mo13092d()
            if (r5 != 0) goto L27
            r5 = 1
            r3.f25074e = r5
            r4.f25082a = r5
        L27:
            return
    }

    public java.lang.String toString() {
            r9 = this;
            v.h r0 = r9.f25070a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L16
        L7:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            v.h r1 = r9.f25070a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = " = "
            java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            float r1 = r9.f25071b
            r2 = 0
            r3 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L33
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            float r1 = r9.f25071b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L34
        L33:
            r1 = 0
        L34:
            v.b$a r4 = r9.f25073d
            int r4 = r4.mo13092d()
        L3a:
            if (r3 >= r4) goto L9f
            v.b$a r5 = r9.f25073d
            v.h r5 = r5.mo13096h(r3)
            if (r5 != 0) goto L45
            goto L9c
        L45:
            v.b$a r6 = r9.f25073d
            float r6 = r6.mo13089a(r3)
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 != 0) goto L50
            goto L9c
        L50:
            java.lang.String r5 = r5.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L63
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7e
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = "- "
            goto L75
        L63:
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            if (r7 <= 0) goto L73
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L7e
        L73:
            java.lang.String r1 = " - "
        L75:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r6 = r6 * r8
        L7e:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L8a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L97
        L8a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
        L97:
            java.lang.String r0 = p346u.C6269n.m12888a(r1, r0, r5)
            r1 = 1
        L9c:
            int r3 = r3 + 1
            goto L3a
        L9f:
            if (r1 != 0) goto La7
            java.lang.String r1 = "0.0"
            java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
        La7:
            return r0
    }
}
