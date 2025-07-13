package p365v;

/* renamed from: v.d */
/* loaded from: classes.dex */
public class C6477d {

    /* renamed from: p */
    public static boolean f25079p = false;

    /* renamed from: q */
    public static int f25080q = 1000;

    /* renamed from: r */
    public static long f25081r;

    /* renamed from: a */
    public boolean f25082a;

    /* renamed from: b */
    public int f25083b;

    /* renamed from: c */
    public p365v.C6477d.a f25084c;

    /* renamed from: d */
    public int f25085d;

    /* renamed from: e */
    public int f25086e;

    /* renamed from: f */
    public p365v.C6475b[] f25087f;

    /* renamed from: g */
    public boolean f25088g;

    /* renamed from: h */
    public boolean[] f25089h;

    /* renamed from: i */
    public int f25090i;

    /* renamed from: j */
    public int f25091j;

    /* renamed from: k */
    public int f25092k;

    /* renamed from: l */
    public final p365v.C6476c f25093l;

    /* renamed from: m */
    public p365v.C6481h[] f25094m;

    /* renamed from: n */
    public int f25095n;

    /* renamed from: o */
    public p365v.C6477d.a f25096o;

    /* renamed from: v.d$a */
    public interface a {
        /* renamed from: a */
        p365v.C6481h mo13100a(p365v.C6477d r1, boolean[] r2);

        /* renamed from: b */
        void mo13101b(p365v.C6481h r1);

        void clear();

        boolean isEmpty();
    }

    public C6477d() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f25082a = r0
            r3.f25083b = r0
            r1 = 32
            r3.f25085d = r1
            r3.f25086e = r1
            r2 = 0
            r3.f25087f = r2
            r3.f25088g = r0
            boolean[] r2 = new boolean[r1]
            r3.f25089h = r2
            r2 = 1
            r3.f25090i = r2
            r3.f25091j = r0
            r3.f25092k = r1
            int r2 = p365v.C6477d.f25080q
            v.h[] r2 = new p365v.C6481h[r2]
            r3.f25094m = r2
            r3.f25095n = r0
            v.b[] r1 = new p365v.C6475b[r1]
            r3.f25087f = r1
            r3.m13142t()
            v.c r1 = new v.c
            r1.<init>(r0)
            r3.f25093l = r1
            v.f r0 = new v.f
            r0.<init>(r1)
            r3.f25084c = r0
            v.b r0 = new v.b
            r0.<init>(r1)
            r3.f25096o = r0
            return
    }

    /* renamed from: a */
    public final p365v.C6481h m13123a(int r3, java.lang.String r4) {
            r2 = this;
            v.c r4 = r2.f25093l
            v.e r4 = r4.f25077a0
            v.e r4 = (p365v.C6478e) r4
            java.lang.Object r4 = r4.mo6231b()
            v.h r4 = (p365v.C6481h) r4
            if (r4 != 0) goto L14
            v.h r4 = new v.h
            r4.<init>(r3)
            goto L17
        L14:
            r4.m13157c()
        L17:
            r4.f25115i = r3
            int r3 = r2.f25095n
            int r0 = p365v.C6477d.f25080q
            if (r3 < r0) goto L2d
            int r0 = r0 * 2
            p365v.C6477d.f25080q = r0
            v.h[] r3 = r2.f25094m
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            v.h[] r3 = (p365v.C6481h[]) r3
            r2.f25094m = r3
        L2d:
            v.h[] r3 = r2.f25094m
            int r0 = r2.f25095n
            int r1 = r0 + 1
            r2.f25095n = r1
            r3[r0] = r4
            return r4
    }

    /* renamed from: b */
    public void m13124b(p365v.C6481h r7, p365v.C6481h r8, int r9, float r10, p365v.C6481h r11, p365v.C6481h r12, int r13, int r14) {
            r6 = this;
            v.b r0 = r6.m13135m()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r8 != r11) goto L1b
            v.b$a r9 = r0.f25073d
            r9.mo13091c(r7, r1)
            v.b$a r7 = r0.f25073d
            r7.mo13091c(r12, r1)
            v.b$a r7 = r0.f25073d
            r9 = -1073741824(0xffffffffc0000000, float:-2.0)
            r7.mo13091c(r8, r9)
            goto L8e
        L1b:
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 != 0) goto L3e
            v.b$a r10 = r0.f25073d
            r10.mo13091c(r7, r1)
            v.b$a r7 = r0.f25073d
            r7.mo13091c(r8, r3)
            v.b$a r7 = r0.f25073d
            r7.mo13091c(r11, r3)
            v.b$a r7 = r0.f25073d
            r7.mo13091c(r12, r1)
            if (r9 > 0) goto L3b
            if (r13 <= 0) goto L8e
        L3b:
            int r7 = -r9
            int r7 = r7 + r13
            goto L5e
        L3e:
            r2 = 0
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 > 0) goto L4f
            v.b$a r10 = r0.f25073d
            r10.mo13091c(r7, r3)
            v.b$a r7 = r0.f25073d
            r7.mo13091c(r8, r1)
            float r7 = (float) r9
            goto L5f
        L4f:
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 < 0) goto L62
            v.b$a r7 = r0.f25073d
            r7.mo13091c(r12, r3)
            v.b$a r7 = r0.f25073d
            r7.mo13091c(r11, r1)
            int r7 = -r13
        L5e:
            float r7 = (float) r7
        L5f:
            r0.f25071b = r7
            goto L8e
        L62:
            v.b$a r2 = r0.f25073d
            float r4 = r1 - r10
            float r5 = r4 * r1
            r2.mo13091c(r7, r5)
            v.b$a r7 = r0.f25073d
            float r2 = r4 * r3
            r7.mo13091c(r8, r2)
            v.b$a r7 = r0.f25073d
            float r3 = r3 * r10
            r7.mo13091c(r11, r3)
            v.b$a r7 = r0.f25073d
            float r1 = r1 * r10
            r7.mo13091c(r12, r1)
            if (r9 > 0) goto L84
            if (r13 <= 0) goto L8e
        L84:
            int r7 = -r9
            float r7 = (float) r7
            float r7 = r7 * r4
            float r8 = (float) r13
            float r8 = r8 * r10
            float r8 = r8 + r7
            r0.f25071b = r8
        L8e:
            r7 = 8
            if (r14 == r7) goto L95
            r0.m13102c(r6, r14)
        L95:
            r6.m13125c(r0)
            return
    }

    /* renamed from: c */
    public void m13125c(p365v.C6475b r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f25091j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f25092k
            if (r2 >= r4) goto L13
            int r2 = r0.f25090i
            int r2 = r2 + r3
            int r4 = r0.f25086e
            if (r2 < r4) goto L16
        L13:
            r16.m13138p()
        L16:
            boolean r2 = r1.f25074e
            if (r2 != 0) goto L1b1
            v.b[] r2 = r0.f25087f
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L21
            goto L83
        L21:
            r2 = 0
        L22:
            if (r2 != 0) goto L73
            v.b$a r6 = r1.f25073d
            int r6 = r6.mo13092d()
            r7 = 0
        L2b:
            if (r7 >= r6) goto L44
            v.b$a r8 = r1.f25073d
            v.h r8 = r8.mo13096h(r7)
            int r9 = r8.f25109c
            if (r9 != r5) goto L3c
            boolean r9 = r8.f25112f
            if (r9 != 0) goto L3c
            goto L41
        L3c:
            java.util.ArrayList<v.h> r9 = r1.f25072c
            r9.add(r8)
        L41:
            int r7 = r7 + 1
            goto L2b
        L44:
            java.util.ArrayList<v.h> r6 = r1.f25072c
            int r6 = r6.size()
            if (r6 <= 0) goto L71
            r7 = 0
        L4d:
            if (r7 >= r6) goto L6b
            java.util.ArrayList<v.h> r8 = r1.f25072c
            java.lang.Object r8 = r8.get(r7)
            v.h r8 = (p365v.C6481h) r8
            boolean r9 = r8.f25112f
            if (r9 == 0) goto L5f
            r1.m13110k(r0, r8, r3)
            goto L68
        L5f:
            v.b[] r9 = r0.f25087f
            int r8 = r8.f25109c
            r8 = r9[r8]
            r1.mo13111l(r0, r8, r3)
        L68:
            int r7 = r7 + 1
            goto L4d
        L6b:
            java.util.ArrayList<v.h> r6 = r1.f25072c
            r6.clear()
            goto L22
        L71:
            r2 = 1
            goto L22
        L73:
            v.h r2 = r1.f25070a
            if (r2 == 0) goto L83
            v.b$a r2 = r1.f25073d
            int r2 = r2.mo13092d()
            if (r2 != 0) goto L83
            r1.f25074e = r3
            r0.f25082a = r3
        L83:
            boolean r2 = r17.isEmpty()
            if (r2 == 0) goto L8a
            return
        L8a:
            float r2 = r1.f25071b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L9c
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f25071b = r2
            v.b$a r2 = r1.f25073d
            r2.mo13099k()
        L9c:
            v.b$a r2 = r1.f25073d
            int r2 = r2.mo13092d()
            r7 = 0
            r9 = r7
            r10 = r9
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        Laa:
            if (r8 >= r2) goto Lf9
            v.b$a r15 = r1.f25073d
            float r15 = r15.mo13089a(r8)
            v.b$a r4 = r1.f25073d
            v.h r4 = r4.mo13096h(r8)
            int r5 = r4.f25115i
            if (r5 != r3) goto Ld6
            if (r9 != 0) goto Lbf
            goto Lc3
        Lbf:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto Lca
        Lc3:
            boolean r12 = r1.m13107h(r4)
            r9 = r4
            r11 = r15
            goto Lf5
        Lca:
            if (r12 != 0) goto Lf5
            boolean r5 = r1.m13107h(r4)
            if (r5 == 0) goto Lf5
            r9 = r4
            r11 = r15
            r12 = 1
            goto Lf5
        Ld6:
            if (r9 != 0) goto Lf5
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto Lf5
            if (r10 != 0) goto Ldf
            goto Le3
        Ldf:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto Lea
        Le3:
            boolean r14 = r1.m13107h(r4)
            r10 = r4
            r13 = r15
            goto Lf5
        Lea:
            if (r14 != 0) goto Lf5
            boolean r5 = r1.m13107h(r4)
            if (r5 == 0) goto Lf5
            r10 = r4
            r13 = r15
            r14 = 1
        Lf5:
            int r8 = r8 + 1
            r5 = -1
            goto Laa
        Lf9:
            if (r9 == 0) goto Lfc
            goto Lfd
        Lfc:
            r9 = r10
        Lfd:
            if (r9 != 0) goto L101
            r2 = 1
            goto L105
        L101:
            r1.m13109j(r9)
            r2 = 0
        L105:
            v.b$a r4 = r1.f25073d
            int r4 = r4.mo13092d()
            if (r4 != 0) goto L10f
            r1.f25074e = r3
        L10f:
            if (r2 == 0) goto L19b
            int r2 = r0.f25090i
            int r2 = r2 + r3
            int r4 = r0.f25086e
            if (r2 < r4) goto L11b
            r16.m13138p()
        L11b:
            r2 = 3
            v.h r2 = r0.m13123a(r2, r7)
            int r4 = r0.f25083b
            int r4 = r4 + r3
            r0.f25083b = r4
            int r5 = r0.f25090i
            int r5 = r5 + r3
            r0.f25090i = r5
            r2.f25108b = r4
            v.c r5 = r0.f25093l
            java.lang.Object r5 = r5.f25078b0
            v.h[] r5 = (p365v.C6481h[]) r5
            r5[r4] = r2
            r1.f25070a = r2
            int r4 = r0.f25091j
            r16.m13131i(r17)
            int r5 = r0.f25091j
            int r4 = r4 + r3
            if (r5 != r4) goto L19b
            v.d$a r4 = r0.f25096o
            v.b r4 = (p365v.C6475b) r4
            java.util.Objects.requireNonNull(r4)
            r4.f25070a = r7
            v.b$a r5 = r4.f25073d
            r5.clear()
            r5 = 0
        L14f:
            v.b$a r8 = r1.f25073d
            int r8 = r8.mo13092d()
            if (r5 >= r8) goto L16b
            v.b$a r8 = r1.f25073d
            v.h r8 = r8.mo13096h(r5)
            v.b$a r9 = r1.f25073d
            float r9 = r9.mo13089a(r5)
            v.b$a r10 = r4.f25073d
            r10.mo13094f(r8, r9, r3)
            int r5 = r5 + 1
            goto L14f
        L16b:
            v.d$a r4 = r0.f25096o
            r0.m13141s(r4)
            int r4 = r2.f25109c
            r5 = -1
            if (r4 != r5) goto L199
            v.h r4 = r1.f25070a
            if (r4 != r2) goto L182
            v.h r2 = r1.m13108i(r7, r2)
            if (r2 == 0) goto L182
            r1.m13109j(r2)
        L182:
            boolean r2 = r1.f25074e
            if (r2 != 0) goto L18b
            v.h r2 = r1.f25070a
            r2.m13159e(r0, r1)
        L18b:
            v.c r2 = r0.f25093l
            v.e r2 = r2.f25076Z
            v.e r2 = (p365v.C6478e) r2
            r2.mo6230a(r1)
            int r2 = r0.f25091j
            int r2 = r2 - r3
            r0.f25091j = r2
        L199:
            r2 = 1
            goto L19c
        L19b:
            r2 = 0
        L19c:
            v.h r4 = r1.f25070a
            if (r4 == 0) goto L1ab
            int r4 = r4.f25115i
            if (r4 == r3) goto L1ac
            float r4 = r1.f25071b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L1ab
            goto L1ac
        L1ab:
            r3 = 0
        L1ac:
            if (r3 != 0) goto L1af
            return
        L1af:
            r4 = r2
            goto L1b2
        L1b1:
            r4 = 0
        L1b2:
            if (r4 != 0) goto L1b7
            r16.m13131i(r17)
        L1b7:
            return
    }

    /* renamed from: d */
    public p365v.C6475b m13126d(p365v.C6481h r5, p365v.C6481h r6, int r7, int r8) {
            r4 = this;
            r0 = 8
            if (r8 != r0) goto L16
            boolean r1 = r6.f25112f
            if (r1 == 0) goto L16
            int r1 = r5.f25109c
            r2 = -1
            if (r1 != r2) goto L16
            float r6 = r6.f25111e
            float r7 = (float) r7
            float r6 = r6 + r7
            r5.m13158d(r4, r6)
            r5 = 0
            return r5
        L16:
            v.b r1 = r4.m13135m()
            r2 = 0
            if (r7 == 0) goto L25
            if (r7 >= 0) goto L22
            int r7 = r7 * (-1)
            r2 = 1
        L22:
            float r7 = (float) r7
            r1.f25071b = r7
        L25:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 != 0) goto L36
            v.b$a r2 = r1.f25073d
            r2.mo13091c(r5, r7)
            v.b$a r5 = r1.f25073d
            r5.mo13091c(r6, r3)
            goto L40
        L36:
            v.b$a r2 = r1.f25073d
            r2.mo13091c(r5, r3)
            v.b$a r5 = r1.f25073d
            r5.mo13091c(r6, r7)
        L40:
            if (r8 == r0) goto L45
            r1.m13102c(r4, r8)
        L45:
            r4.m13125c(r1)
            return r1
    }

    /* renamed from: e */
    public void m13127e(p365v.C6481h r5, int r6) {
            r4 = this;
            int r0 = r5.f25109c
            r1 = -1
            r2 = 1
            if (r0 != r1) goto L1c
            float r6 = (float) r6
            r5.m13158d(r4, r6)
            r5 = 0
        Lb:
            int r6 = r4.f25083b
            int r6 = r6 + r2
            if (r5 >= r6) goto L1b
            v.c r6 = r4.f25093l
            java.lang.Object r6 = r6.f25078b0
            v.h[] r6 = (p365v.C6481h[]) r6
            r6 = r6[r5]
            int r5 = r5 + 1
            goto Lb
        L1b:
            return
        L1c:
            if (r0 == r1) goto L50
            v.b[] r3 = r4.f25087f
            r0 = r3[r0]
            boolean r3 = r0.f25074e
            if (r3 == 0) goto L2a
        L26:
            float r5 = (float) r6
            r0.f25071b = r5
            goto L60
        L2a:
            v.b$a r3 = r0.f25073d
            int r3 = r3.mo13092d()
            if (r3 != 0) goto L35
            r0.f25074e = r2
            goto L26
        L35:
            v.b r0 = r4.m13135m()
            if (r6 >= 0) goto L45
            int r6 = r6 * (-1)
            float r6 = (float) r6
            r0.f25071b = r6
            v.b$a r6 = r0.f25073d
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L4c
        L45:
            float r6 = (float) r6
            r0.f25071b = r6
            v.b$a r6 = r0.f25073d
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L4c:
            r6.mo13091c(r5, r1)
            goto L5d
        L50:
            v.b r0 = r4.m13135m()
            r0.f25070a = r5
            float r6 = (float) r6
            r5.f25111e = r6
            r0.f25071b = r6
            r0.f25074e = r2
        L5d:
            r4.m13125c(r0)
        L60:
            return
    }

    /* renamed from: f */
    public void m13128f(p365v.C6481h r4, p365v.C6481h r5, int r6, int r7) {
            r3 = this;
            v.b r0 = r3.m13135m()
            v.h r1 = r3.m13136n()
            r2 = 0
            r1.f25110d = r2
            r0.m13104e(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L28
            v.b$a r4 = r0.f25073d
            float r4 = r4.mo13095g(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r5 = 0
            v.h r5 = r3.m13133k(r7, r5)
            v.b$a r6 = r0.f25073d
            float r4 = (float) r4
            r6.mo13091c(r5, r4)
        L28:
            r3.m13125c(r0)
            return
    }

    /* renamed from: g */
    public void m13129g(p365v.C6481h r4, p365v.C6481h r5, int r6, int r7) {
            r3 = this;
            v.b r0 = r3.m13135m()
            v.h r1 = r3.m13136n()
            r2 = 0
            r1.f25110d = r2
            r0.m13105f(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L28
            v.b$a r4 = r0.f25073d
            float r4 = r4.mo13095g(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r5 = 0
            v.h r5 = r3.m13133k(r7, r5)
            v.b$a r6 = r0.f25073d
            float r4 = (float) r4
            r6.mo13091c(r5, r4)
        L28:
            r3.m13125c(r0)
            return
    }

    /* renamed from: h */
    public void m13130h(p365v.C6481h r8, p365v.C6481h r9, p365v.C6481h r10, p365v.C6481h r11, float r12, int r13) {
            r7 = this;
            v.b r6 = r7.m13135m()
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.m13103d(r1, r2, r3, r4, r5)
            r8 = 8
            if (r13 == r8) goto L14
            r6.m13102c(r7, r13)
        L14:
            r7.m13125c(r6)
            return
    }

    /* renamed from: i */
    public final void m13131i(p365v.C6475b r8) {
            r7 = this;
            boolean r0 = r8.f25074e
            if (r0 == 0) goto Lc
            v.h r0 = r8.f25070a
            float r8 = r8.f25071b
            r0.m13158d(r7, r8)
            goto L1d
        Lc:
            v.b[] r0 = r7.f25087f
            int r1 = r7.f25091j
            r0[r1] = r8
            v.h r0 = r8.f25070a
            r0.f25109c = r1
            int r1 = r1 + 1
            r7.f25091j = r1
            r0.m13159e(r7, r8)
        L1d:
            boolean r8 = r7.f25082a
            if (r8 == 0) goto L8b
            r8 = 0
            r0 = 0
        L23:
            int r1 = r7.f25091j
            if (r0 >= r1) goto L89
            v.b[] r1 = r7.f25087f
            r1 = r1[r0]
            if (r1 != 0) goto L34
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "WTF"
            r1.println(r2)
        L34:
            v.b[] r1 = r7.f25087f
            r2 = r1[r0]
            if (r2 == 0) goto L86
            r2 = r1[r0]
            boolean r2 = r2.f25074e
            if (r2 == 0) goto L86
            r1 = r1[r0]
            v.h r2 = r1.f25070a
            float r3 = r1.f25071b
            r2.m13158d(r7, r3)
            v.c r2 = r7.f25093l
            v.e r2 = r2.f25076Z
            v.e r2 = (p365v.C6478e) r2
            r2.mo6230a(r1)
            v.b[] r1 = r7.f25087f
            r2 = 0
            r1[r0] = r2
            int r1 = r0 + 1
            r3 = r1
        L5a:
            int r4 = r7.f25091j
            if (r1 >= r4) goto L7a
            v.b[] r3 = r7.f25087f
            int r4 = r1 + (-1)
            r5 = r3[r1]
            r3[r4] = r5
            r5 = r3[r4]
            v.h r5 = r5.f25070a
            int r5 = r5.f25109c
            if (r5 != r1) goto L74
            r3 = r3[r4]
            v.h r3 = r3.f25070a
            r3.f25109c = r4
        L74:
            int r3 = r1 + 1
            r6 = r3
            r3 = r1
            r1 = r6
            goto L5a
        L7a:
            if (r3 >= r4) goto L80
            v.b[] r1 = r7.f25087f
            r1[r3] = r2
        L80:
            int r4 = r4 + (-1)
            r7.f25091j = r4
            int r0 = r0 + (-1)
        L86:
            int r0 = r0 + 1
            goto L23
        L89:
            r7.f25082a = r8
        L8b:
            return
    }

    /* renamed from: j */
    public final void m13132j() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.f25091j
            if (r0 >= r1) goto L12
            v.b[] r1 = r3.f25087f
            r1 = r1[r0]
            v.h r2 = r1.f25070a
            float r1 = r1.f25071b
            r2.f25111e = r1
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }

    /* renamed from: k */
    public p365v.C6481h m13133k(int r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.f25090i
            int r0 = r0 + 1
            int r1 = r2.f25086e
            if (r0 < r1) goto Lb
            r2.m13138p()
        Lb:
            r0 = 4
            v.h r4 = r2.m13123a(r0, r4)
            int r0 = r2.f25083b
            int r0 = r0 + 1
            r2.f25083b = r0
            int r1 = r2.f25090i
            int r1 = r1 + 1
            r2.f25090i = r1
            r4.f25108b = r0
            r4.f25110d = r3
            v.c r3 = r2.f25093l
            java.lang.Object r3 = r3.f25078b0
            v.h[] r3 = (p365v.C6481h[]) r3
            r3[r0] = r4
            v.d$a r3 = r2.f25084c
            r3.mo13101b(r4)
            return r4
    }

    /* renamed from: l */
    public p365v.C6481h m13134l(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.f25090i
            r2 = 1
            int r1 = r1 + r2
            int r3 = r4.f25086e
            if (r1 < r3) goto Lf
            r4.m13138p()
        Lf:
            boolean r1 = r5 instanceof p381w.C6763d
            if (r1 == 0) goto L4d
            w.d r5 = (p381w.C6763d) r5
            v.h r0 = r5.f26094i
            if (r0 != 0) goto L1f
            r5.m13688k()
            v.h r5 = r5.f26094i
            r0 = r5
        L1f:
            int r5 = r0.f25108b
            r1 = -1
            if (r5 == r1) goto L32
            int r3 = r4.f25083b
            if (r5 > r3) goto L32
            v.c r3 = r4.f25093l
            java.lang.Object r3 = r3.f25078b0
            v.h[] r3 = (p365v.C6481h[]) r3
            r3 = r3[r5]
            if (r3 != 0) goto L4d
        L32:
            if (r5 == r1) goto L37
            r0.m13157c()
        L37:
            int r5 = r4.f25083b
            int r5 = r5 + r2
            r4.f25083b = r5
            int r1 = r4.f25090i
            int r1 = r1 + r2
            r4.f25090i = r1
            r0.f25108b = r5
            r0.f25115i = r2
            v.c r1 = r4.f25093l
            java.lang.Object r1 = r1.f25078b0
            v.h[] r1 = (p365v.C6481h[]) r1
            r1[r5] = r0
        L4d:
            return r0
    }

    /* renamed from: m */
    public p365v.C6475b m13135m() {
            r5 = this;
            v.c r0 = r5.f25093l
            v.e r0 = r0.f25076Z
            v.e r0 = (p365v.C6478e) r0
            java.lang.Object r0 = r0.mo6231b()
            v.b r0 = (p365v.C6475b) r0
            if (r0 != 0) goto L1d
            v.b r0 = new v.b
            v.c r1 = r5.f25093l
            r0.<init>(r1)
            long r1 = p365v.C6477d.f25081r
            r3 = 1
            long r1 = r1 + r3
            p365v.C6477d.f25081r = r1
            goto L2b
        L1d:
            r1 = 0
            r0.f25070a = r1
            v.b$a r1 = r0.f25073d
            r1.clear()
            r1 = 0
            r0.f25071b = r1
            r1 = 0
            r0.f25074e = r1
        L2b:
            int r1 = p365v.C6481h.f25106m
            int r1 = r1 + 1
            p365v.C6481h.f25106m = r1
            return r0
    }

    /* renamed from: n */
    public p365v.C6481h m13136n() {
            r3 = this;
            int r0 = r3.f25090i
            int r0 = r0 + 1
            int r1 = r3.f25086e
            if (r0 < r1) goto Lb
            r3.m13138p()
        Lb:
            r0 = 3
            r1 = 0
            v.h r0 = r3.m13123a(r0, r1)
            int r1 = r3.f25083b
            int r1 = r1 + 1
            r3.f25083b = r1
            int r2 = r3.f25090i
            int r2 = r2 + 1
            r3.f25090i = r2
            r0.f25108b = r1
            v.c r2 = r3.f25093l
            java.lang.Object r2 = r2.f25078b0
            v.h[] r2 = (p365v.C6481h[]) r2
            r2[r1] = r0
            return r0
    }

    /* renamed from: o */
    public int m13137o(java.lang.Object r2) {
            r1 = this;
            w.d r2 = (p381w.C6763d) r2
            v.h r2 = r2.f26094i
            if (r2 == 0) goto Ld
            float r2 = r2.f25111e
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
        Ld:
            r2 = 0
            return r2
    }

    /* renamed from: p */
    public final void m13138p() {
            r3 = this;
            int r0 = r3.f25085d
            int r0 = r0 * 2
            r3.f25085d = r0
            v.b[] r1 = r3.f25087f
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            v.b[] r0 = (p365v.C6475b[]) r0
            r3.f25087f = r0
            v.c r0 = r3.f25093l
            java.lang.Object r1 = r0.f25078b0
            v.h[] r1 = (p365v.C6481h[]) r1
            int r2 = r3.f25085d
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            v.h[] r1 = (p365v.C6481h[]) r1
            r0.f25078b0 = r1
            int r0 = r3.f25085d
            boolean[] r1 = new boolean[r0]
            r3.f25089h = r1
            r3.f25086e = r0
            r3.f25092k = r0
            return
    }

    /* renamed from: q */
    public void m13139q() {
            r3 = this;
            v.d$a r0 = r3.f25084c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            r3.m13132j()
            return
        Lc:
            boolean r0 = r3.f25088g
            if (r0 == 0) goto L2a
            r0 = 0
            r1 = 0
        L12:
            int r2 = r3.f25091j
            if (r1 >= r2) goto L22
            v.b[] r2 = r3.f25087f
            r2 = r2[r1]
            boolean r2 = r2.f25074e
            if (r2 != 0) goto L1f
            goto L23
        L1f:
            int r1 = r1 + 1
            goto L12
        L22:
            r0 = 1
        L23:
            if (r0 != 0) goto L26
            goto L2a
        L26:
            r3.m13132j()
            goto L2f
        L2a:
            v.d$a r0 = r3.f25084c
            r3.m13140r(r0)
        L2f:
            return
    }

    /* renamed from: r */
    public void m13140r(p365v.C6477d.a r19) {
            r18 = this;
            r0 = r18
            r2 = 0
        L3:
            int r3 = r0.f25091j
            r4 = 0
            r5 = 1
            if (r2 >= r3) goto L21
            v.b[] r3 = r0.f25087f
            r6 = r3[r2]
            v.h r6 = r6.f25070a
            int r6 = r6.f25115i
            if (r6 != r5) goto L14
            goto L1e
        L14:
            r3 = r3[r2]
            float r3 = r3.f25071b
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L1e
            r2 = 1
            goto L22
        L1e:
            int r2 = r2 + 1
            goto L3
        L21:
            r2 = 0
        L22:
            if (r2 == 0) goto Lb2
            r2 = 0
            r3 = 0
        L26:
            if (r2 != 0) goto Lb2
            int r3 = r3 + r5
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7 = -1
            r8 = 0
            r9 = -1
            r10 = -1
            r11 = 0
        L31:
            int r12 = r0.f25091j
            if (r8 >= r12) goto L89
            v.b[] r12 = r0.f25087f
            r12 = r12[r8]
            v.h r13 = r12.f25070a
            int r13 = r13.f25115i
            if (r13 != r5) goto L40
            goto L84
        L40:
            boolean r13 = r12.f25074e
            if (r13 == 0) goto L45
            goto L84
        L45:
            float r13 = r12.f25071b
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L84
            v.b$a r13 = r12.f25073d
            int r13 = r13.mo13092d()
            r14 = 0
        L52:
            if (r14 >= r13) goto L84
            v.b$a r15 = r12.f25073d
            v.h r15 = r15.mo13096h(r14)
            v.b$a r1 = r12.f25073d
            float r1 = r1.mo13095g(r15)
            int r16 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r16 > 0) goto L65
            goto L7f
        L65:
            r4 = 0
        L66:
            r5 = 9
            if (r4 >= r5) goto L7f
            float[] r5 = r15.f25113g
            r5 = r5[r4]
            float r5 = r5 / r1
            int r17 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r17 >= 0) goto L75
            if (r4 == r11) goto L77
        L75:
            if (r4 <= r11) goto L7c
        L77:
            int r10 = r15.f25108b
            r11 = r4
            r6 = r5
            r9 = r8
        L7c:
            int r4 = r4 + 1
            goto L66
        L7f:
            int r14 = r14 + 1
            r4 = 0
            r5 = 1
            goto L52
        L84:
            int r8 = r8 + 1
            r4 = 0
            r5 = 1
            goto L31
        L89:
            if (r9 == r7) goto La6
            v.b[] r1 = r0.f25087f
            r1 = r1[r9]
            v.h r4 = r1.f25070a
            r4.f25109c = r7
            v.c r4 = r0.f25093l
            java.lang.Object r4 = r4.f25078b0
            v.h[] r4 = (p365v.C6481h[]) r4
            r4 = r4[r10]
            r1.m13109j(r4)
            v.h r4 = r1.f25070a
            r4.f25109c = r9
            r4.m13159e(r0, r1)
            goto La7
        La6:
            r2 = 1
        La7:
            int r1 = r0.f25090i
            int r1 = r1 / 2
            if (r3 <= r1) goto Lae
            r2 = 1
        Lae:
            r4 = 0
            r5 = 1
            goto L26
        Lb2:
            r18.m13141s(r19)
            r18.m13132j()
            return
    }

    /* renamed from: s */
    public final int m13141s(p365v.C6477d.a r13) {
            r12 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r12.f25090i
            if (r1 >= r2) goto Ld
            boolean[] r2 = r12.f25089h
            r2[r1] = r0
            int r1 = r1 + 1
            goto L2
        Ld:
            r1 = 1
            r2 = 0
            r3 = 0
        L10:
            if (r2 != 0) goto L8e
            int r3 = r3 + 1
            int r4 = r12.f25090i
            int r4 = r4 * 2
            if (r3 < r4) goto L1b
            return r3
        L1b:
            r4 = r13
            v.b r4 = (p365v.C6475b) r4
            v.h r4 = r4.f25070a
            if (r4 == 0) goto L28
            boolean[] r5 = r12.f25089h
            int r4 = r4.f25108b
            r5[r4] = r1
        L28:
            boolean[] r4 = r12.f25089h
            v.h r4 = r13.mo13100a(r12, r4)
            if (r4 == 0) goto L3b
            boolean[] r5 = r12.f25089h
            int r6 = r4.f25108b
            boolean r7 = r5[r6]
            if (r7 == 0) goto L39
            return r3
        L39:
            r5[r6] = r1
        L3b:
            if (r4 == 0) goto L8c
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r6 = -1
            r7 = 0
            r8 = -1
        L43:
            int r9 = r12.f25091j
            if (r7 >= r9) goto L77
            v.b[] r9 = r12.f25087f
            r9 = r9[r7]
            v.h r10 = r9.f25070a
            int r10 = r10.f25115i
            if (r10 != r1) goto L52
            goto L74
        L52:
            boolean r10 = r9.f25074e
            if (r10 == 0) goto L57
            goto L74
        L57:
            v.b$a r10 = r9.f25073d
            boolean r10 = r10.mo13097i(r4)
            if (r10 == 0) goto L74
            v.b$a r10 = r9.f25073d
            float r10 = r10.mo13095g(r4)
            r11 = 0
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L74
            float r9 = r9.f25071b
            float r9 = -r9
            float r9 = r9 / r10
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L74
            r8 = r7
            r5 = r9
        L74:
            int r7 = r7 + 1
            goto L43
        L77:
            if (r8 <= r6) goto L10
            v.b[] r5 = r12.f25087f
            r5 = r5[r8]
            v.h r7 = r5.f25070a
            r7.f25109c = r6
            r5.m13109j(r4)
            v.h r4 = r5.f25070a
            r4.f25109c = r8
            r4.m13159e(r12, r5)
            goto L10
        L8c:
            r2 = 1
            goto L10
        L8e:
            return r3
    }

    /* renamed from: t */
    public final void m13142t() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.f25091j
            if (r0 >= r1) goto L1c
            v.b[] r1 = r3.f25087f
            r1 = r1[r0]
            if (r1 == 0) goto L14
            v.c r2 = r3.f25093l
            v.e r2 = r2.f25076Z
            v.e r2 = (p365v.C6478e) r2
            r2.mo6230a(r1)
        L14:
            v.b[] r1 = r3.f25087f
            r2 = 0
            r1[r0] = r2
            int r0 = r0 + 1
            goto L1
        L1c:
            return
    }

    /* renamed from: u */
    public void m13143u() {
            r9 = this;
            r0 = 0
            r1 = 0
        L2:
            v.c r2 = r9.f25093l
            java.lang.Object r3 = r2.f25078b0
            r4 = r3
            v.h[] r4 = (p365v.C6481h[]) r4
            int r4 = r4.length
            if (r1 >= r4) goto L18
            v.h[] r3 = (p365v.C6481h[]) r3
            r2 = r3[r1]
            if (r2 == 0) goto L15
            r2.m13157c()
        L15:
            int r1 = r1 + 1
            goto L2
        L18:
            v.e r1 = r2.f25077a0
            v.e r1 = (p365v.C6478e) r1
            v.h[] r2 = r9.f25094m
            int r3 = r9.f25095n
            java.util.Objects.requireNonNull(r1)
            int r4 = r2.length
            if (r3 <= r4) goto L27
            int r3 = r2.length
        L27:
            r4 = 0
        L28:
            if (r4 >= r3) goto L3c
            r5 = r2[r4]
            int r6 = r1.f25099c
            java.lang.Object[] r7 = r1.f25098b
            int r8 = r7.length
            if (r6 >= r8) goto L39
            r7[r6] = r5
            int r6 = r6 + 1
            r1.f25099c = r6
        L39:
            int r4 = r4 + 1
            goto L28
        L3c:
            r9.f25095n = r0
            v.c r1 = r9.f25093l
            java.lang.Object r1 = r1.f25078b0
            v.h[] r1 = (p365v.C6481h[]) r1
            r2 = 0
            java.util.Arrays.fill(r1, r2)
            r9.f25083b = r0
            v.d$a r1 = r9.f25084c
            r1.clear()
            r1 = 1
            r9.f25090i = r1
            r1 = 0
        L53:
            int r2 = r9.f25091j
            if (r1 >= r2) goto L65
            v.b[] r2 = r9.f25087f
            r3 = r2[r1]
            if (r3 == 0) goto L62
            r2 = r2[r1]
            java.util.Objects.requireNonNull(r2)
        L62:
            int r1 = r1 + 1
            goto L53
        L65:
            r9.m13142t()
            r9.f25091j = r0
            v.b r0 = new v.b
            v.c r1 = r9.f25093l
            r0.<init>(r1)
            r9.f25096o = r0
            return
    }
}
