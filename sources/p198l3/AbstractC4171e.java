package p198l3;

import p198l3.C4172f;

/* renamed from: l3.e */
/* loaded from: classes.dex */
public abstract class AbstractC4171e<T extends p198l3.C4172f> extends p198l3.AbstractC4168b<T> {

    /* renamed from: o */
    public java.util.List<T> f17279o;

    /* renamed from: p */
    public float f17280p;

    /* renamed from: q */
    public float f17281q;

    /* renamed from: r */
    public float f17282r;

    /* renamed from: s */
    public float f17283s;

    /* renamed from: l3.e$a */
    public enum a extends java.lang.Enum<p198l3.AbstractC4171e.a> {

        /* renamed from: Y */
        public static final p198l3.AbstractC4171e.a f17284Y = null;

        /* renamed from: Z */
        public static final p198l3.AbstractC4171e.a f17285Z = null;

        /* renamed from: a0 */
        public static final p198l3.AbstractC4171e.a f17286a0 = null;

        /* renamed from: b0 */
        public static final /* synthetic */ p198l3.AbstractC4171e.a[] f17287b0 = null;

        static {
                l3.e$a r0 = new l3.e$a
                java.lang.String r1 = "UP"
                r2 = 0
                r0.<init>(r1, r2)
                p198l3.AbstractC4171e.a.f17284Y = r0
                l3.e$a r1 = new l3.e$a
                java.lang.String r3 = "DOWN"
                r4 = 1
                r1.<init>(r3, r4)
                p198l3.AbstractC4171e.a.f17285Z = r1
                l3.e$a r3 = new l3.e$a
                java.lang.String r5 = "CLOSEST"
                r6 = 2
                r3.<init>(r5, r6)
                p198l3.AbstractC4171e.a.f17286a0 = r3
                r5 = 3
                l3.e$a[] r5 = new p198l3.AbstractC4171e.a[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                p198l3.AbstractC4171e.a.f17287b0 = r5
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static p198l3.AbstractC4171e.a valueOf(java.lang.String r1) {
                java.lang.Class<l3.e$a> r0 = p198l3.AbstractC4171e.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                l3.e$a r1 = (p198l3.AbstractC4171e.a) r1
                return r1
        }

        public static p198l3.AbstractC4171e.a[] values() {
                l3.e$a[] r0 = p198l3.AbstractC4171e.a.f17287b0
                java.lang.Object r0 = r0.clone()
                l3.e$a[] r0 = (p198l3.AbstractC4171e.a[]) r0
                return r0
        }
    }

    public AbstractC4171e(java.util.List<T> r3, java.lang.String r4) {
            r2 = this;
            r2.<init>(r4)
            r4 = 0
            r2.f17279o = r4
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2.f17280p = r4
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.f17281q = r0
            r2.f17282r = r4
            r2.f17283s = r0
            r2.f17279o = r3
            if (r3 != 0) goto L1f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f17279o = r3
        L1f:
            java.util.List<T extends l3.f> r3 = r2.f17279o
            if (r3 == 0) goto L6b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L2a
            goto L6b
        L2a:
            r2.f17280p = r4
            r2.f17281q = r0
            r2.f17282r = r4
            r2.f17283s = r0
            java.util.List<T extends l3.f> r3 = r2.f17279o
            java.util.Iterator r3 = r3.iterator()
        L38:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r3.next()
            l3.f r4 = (p198l3.C4172f) r4
            if (r4 != 0) goto L47
            goto L38
        L47:
            float r0 = r4.mo9267b()
            float r1 = r2.f17283s
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L57
            float r0 = r4.mo9267b()
            r2.f17283s = r0
        L57:
            float r0 = r4.mo9267b()
            float r1 = r2.f17282r
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L67
            float r0 = r4.mo9267b()
            r2.f17282r = r0
        L67:
            r2.m9258g0(r4)
            goto L38
        L6b:
            return
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: A */
    public float mo9254A() {
            r1 = this;
            float r0 = r1.f17281q
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: P */
    public int mo9255P() {
            r1 = this;
            java.util.List<T extends l3.f> r0 = r1.f17279o
            int r0 = r0.size()
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: X */
    public T mo9256X(int r2) {
            r1 = this;
            java.util.List<T extends l3.f> r0 = r1.f17279o
            java.lang.Object r2 = r0.get(r2)
            l3.f r2 = (p198l3.C4172f) r2
            return r2
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: g */
    public float mo9257g() {
            r1 = this;
            float r0 = r1.f17283s
            return r0
    }

    /* renamed from: g0 */
    public void m9258g0(T r3) {
            r2 = this;
            float r0 = r3.m9246a()
            float r1 = r2.f17281q
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L10
            float r0 = r3.m9246a()
            r2.f17281q = r0
        L10:
            float r0 = r3.m9246a()
            float r1 = r2.f17280p
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L20
            float r3 = r3.m9246a()
            r2.f17280p = r3
        L20:
            return
    }

    /* renamed from: h0 */
    public int m9259h0(float r11, float r12, p198l3.AbstractC4171e.a r13) {
            r10 = this;
            java.util.List<T extends l3.f> r0 = r10.f17279o
            r1 = -1
            if (r0 == 0) goto Le5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto Le5
        Ld:
            r0 = 0
            java.util.List<T extends l3.f> r2 = r10.f17279o
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L16:
            if (r0 >= r2) goto L59
            int r3 = r0 + r2
            int r3 = r3 / 2
            java.util.List<T extends l3.f> r4 = r10.f17279o
            java.lang.Object r4 = r4.get(r3)
            l3.f r4 = (p198l3.C4172f) r4
            float r4 = r4.mo9267b()
            float r4 = r4 - r11
            java.util.List<T extends l3.f> r5 = r10.f17279o
            int r6 = r3 + 1
            java.lang.Object r5 = r5.get(r6)
            l3.f r5 = (p198l3.C4172f) r5
            float r5 = r5.mo9267b()
            float r5 = r5 - r11
            float r7 = java.lang.Math.abs(r4)
            float r5 = java.lang.Math.abs(r5)
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 >= 0) goto L46
        L44:
            r0 = r6
            goto L16
        L46:
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4b
            goto L52
        L4b:
            double r4 = (double) r4
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L54
        L52:
            r2 = r3
            goto L16
        L54:
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 >= 0) goto L16
            goto L44
        L59:
            if (r2 == r1) goto Le4
            java.util.List<T extends l3.f> r0 = r10.f17279o
            java.lang.Object r0 = r0.get(r2)
            l3.f r0 = (p198l3.C4172f) r0
            float r0 = r0.mo9267b()
            l3.e$a r1 = p198l3.AbstractC4171e.a.f17284Y
            if (r13 != r1) goto L7c
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 >= 0) goto L88
            java.util.List<T extends l3.f> r11 = r10.f17279o
            int r11 = r11.size()
            int r11 = r11 + (-1)
            if (r2 >= r11) goto L88
            int r2 = r2 + 1
            goto L88
        L7c:
            l3.e$a r1 = p198l3.AbstractC4171e.a.f17285Z
            if (r13 != r1) goto L88
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 <= 0) goto L88
            if (r2 <= 0) goto L88
            int r2 = r2 + (-1)
        L88:
            boolean r11 = java.lang.Float.isNaN(r12)
            if (r11 != 0) goto Le4
        L8e:
            if (r2 <= 0) goto La5
            java.util.List<T extends l3.f> r11 = r10.f17279o
            int r13 = r2 + (-1)
            java.lang.Object r11 = r11.get(r13)
            l3.f r11 = (p198l3.C4172f) r11
            float r11 = r11.mo9267b()
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 != 0) goto La5
            int r2 = r2 + (-1)
            goto L8e
        La5:
            java.util.List<T extends l3.f> r11 = r10.f17279o
            java.lang.Object r11 = r11.get(r2)
            l3.f r11 = (p198l3.C4172f) r11
            float r11 = r11.m9246a()
        Lb1:
            r13 = r2
        Lb2:
            int r2 = r2 + 1
            java.util.List<T extends l3.f> r1 = r10.f17279o
            int r1 = r1.size()
            if (r2 < r1) goto Lbd
            goto Lcd
        Lbd:
            java.util.List<T extends l3.f> r1 = r10.f17279o
            java.lang.Object r1 = r1.get(r2)
            l3.f r1 = (p198l3.C4172f) r1
            float r3 = r1.mo9267b()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto Lcf
        Lcd:
            r2 = r13
            goto Le4
        Lcf:
            float r1 = r1.m9246a()
            float r1 = r1 - r12
            float r1 = java.lang.Math.abs(r1)
            float r3 = r11 - r12
            float r3 = java.lang.Math.abs(r3)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto Lb2
            r11 = r12
            goto Lb1
        Le4:
            return r2
        Le5:
            return r1
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: j */
    public float mo9260j() {
            r1 = this;
            float r0 = r1.f17280p
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: p */
    public T mo9261p(float r2, float r3) {
            r1 = this;
            l3.e$a r0 = p198l3.AbstractC4171e.a.f17286a0
            l3.f r2 = r1.mo9264u(r2, r3, r0)
            return r2
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: q */
    public void mo9262q(float r3, float r4) {
            r2 = this;
            java.util.List<T extends l3.f> r0 = r2.f17279o
            if (r0 == 0) goto L33
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L33
        Lb:
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2.f17280p = r0
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.f17281q = r0
            l3.e$a r0 = p198l3.AbstractC4171e.a.f17285Z
            r1 = 2143289344(0x7fc00000, float:NaN)
            int r3 = r2.m9259h0(r3, r1, r0)
            l3.e$a r0 = p198l3.AbstractC4171e.a.f17284Y
            int r4 = r2.m9259h0(r4, r1, r0)
        L23:
            if (r3 > r4) goto L33
            java.util.List<T extends l3.f> r0 = r2.f17279o
            java.lang.Object r0 = r0.get(r3)
            l3.f r0 = (p198l3.C4172f) r0
            r2.m9258g0(r0)
            int r3 = r3 + 1
            goto L23
        L33:
            return
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: t */
    public java.util.List<T> mo9263t(float r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<T extends l3.f> r1 = r6.f17279o
            int r1 = r1.size()
            int r1 = r1 + (-1)
            r2 = 0
        Le:
            if (r2 > r1) goto L69
            int r3 = r1 + r2
            int r3 = r3 / 2
            java.util.List<T extends l3.f> r4 = r6.f17279o
            java.lang.Object r4 = r4.get(r3)
            l3.f r4 = (p198l3.C4172f) r4
            float r5 = r4.mo9267b()
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 != 0) goto L59
        L24:
            if (r3 <= 0) goto L3b
            java.util.List<T extends l3.f> r1 = r6.f17279o
            int r2 = r3 + (-1)
            java.lang.Object r1 = r1.get(r2)
            l3.f r1 = (p198l3.C4172f) r1
            float r1 = r1.mo9267b()
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L3b
            int r3 = r3 + (-1)
            goto L24
        L3b:
            java.util.List<T extends l3.f> r1 = r6.f17279o
            int r1 = r1.size()
        L41:
            if (r3 >= r1) goto L69
            java.util.List<T extends l3.f> r2 = r6.f17279o
            java.lang.Object r2 = r2.get(r3)
            l3.f r2 = (p198l3.C4172f) r2
            float r4 = r2.mo9267b()
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L69
            r0.add(r2)
            int r3 = r3 + 1
            goto L41
        L59:
            float r4 = r4.mo9267b()
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L65
            int r3 = r3 + 1
            r2 = r3
            goto Le
        L65:
            int r3 = r3 + (-1)
            r1 = r3
            goto Le
        L69:
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "DataSet, label: "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r3 = r4.f17256c
            if (r3 != 0) goto L16
            java.lang.String r3 = ""
        L16:
            r2.append(r3)
            java.lang.String r3 = ", entries: "
            r2.append(r3)
            java.util.List<T extends l3.f> r3 = r4.f17279o
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = "\n"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 0
        L3b:
            java.util.List<T extends l3.f> r2 = r4.f17279o
            int r2 = r2.size()
            if (r1 >= r2) goto L66
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.List<T extends l3.f> r3 = r4.f17279o
            java.lang.Object r3 = r3.get(r1)
            l3.f r3 = (p198l3.C4172f) r3
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            int r1 = r1 + 1
            goto L3b
        L66:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: u */
    public T mo9264u(float r1, float r2, p198l3.AbstractC4171e.a r3) {
            r0 = this;
            int r1 = r0.m9259h0(r1, r2, r3)
            r2 = -1
            if (r1 <= r2) goto L10
            java.util.List<T extends l3.f> r2 = r0.f17279o
            java.lang.Object r1 = r2.get(r1)
            l3.f r1 = (p198l3.C4172f) r1
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: v */
    public int mo9265v(p198l3.C4172f r2) {
            r1 = this;
            java.util.List<T extends l3.f> r0 = r1.f17279o
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: y */
    public float mo9266y() {
            r1 = this;
            float r0 = r1.f17282r
            return r0
    }
}
