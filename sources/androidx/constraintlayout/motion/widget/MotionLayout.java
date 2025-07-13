package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class MotionLayout extends androidx.constraintlayout.widget.ConstraintLayout implements p227n0.InterfaceC4651j {

    /* renamed from: x1 */
    public static boolean f1521x1;

    /* renamed from: A0 */
    public java.util.HashMap<android.view.View, p346u.C6270o> f1522A0;

    /* renamed from: B0 */
    public long f1523B0;

    /* renamed from: C0 */
    public float f1524C0;

    /* renamed from: D0 */
    public float f1525D0;

    /* renamed from: E0 */
    public float f1526E0;

    /* renamed from: F0 */
    public long f1527F0;

    /* renamed from: G0 */
    public float f1528G0;

    /* renamed from: H0 */
    public boolean f1529H0;

    /* renamed from: I0 */
    public boolean f1530I0;

    /* renamed from: J0 */
    public androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0325h f1531J0;

    /* renamed from: K0 */
    public int f1532K0;

    /* renamed from: L0 */
    public androidx.constraintlayout.motion.widget.MotionLayout.C0320c f1533L0;

    /* renamed from: M0 */
    public boolean f1534M0;

    /* renamed from: N0 */
    public p331t.C6092g f1535N0;

    /* renamed from: O0 */
    public androidx.constraintlayout.motion.widget.MotionLayout.C0319b f1536O0;

    /* renamed from: P0 */
    public p346u.C6257b f1537P0;

    /* renamed from: Q0 */
    public int f1538Q0;

    /* renamed from: R0 */
    public int f1539R0;

    /* renamed from: S0 */
    public boolean f1540S0;

    /* renamed from: T0 */
    public float f1541T0;

    /* renamed from: U0 */
    public float f1542U0;

    /* renamed from: V0 */
    public long f1543V0;

    /* renamed from: W0 */
    public float f1544W0;

    /* renamed from: X0 */
    public boolean f1545X0;

    /* renamed from: Y0 */
    public java.util.ArrayList<androidx.constraintlayout.motion.widget.C0327a> f1546Y0;

    /* renamed from: Z0 */
    public java.util.ArrayList<androidx.constraintlayout.motion.widget.C0327a> f1547Z0;

    /* renamed from: a1 */
    public java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0325h> f1548a1;

    /* renamed from: b1 */
    public int f1549b1;

    /* renamed from: c1 */
    public long f1550c1;

    /* renamed from: d1 */
    public float f1551d1;

    /* renamed from: e1 */
    public int f1552e1;

    /* renamed from: f1 */
    public float f1553f1;

    /* renamed from: g1 */
    public boolean f1554g1;

    /* renamed from: h1 */
    public int f1555h1;

    /* renamed from: i1 */
    public int f1556i1;

    /* renamed from: j1 */
    public int f1557j1;

    /* renamed from: k1 */
    public int f1558k1;

    /* renamed from: l1 */
    public int f1559l1;

    /* renamed from: m1 */
    public int f1560m1;

    /* renamed from: n1 */
    public float f1561n1;

    /* renamed from: o1 */
    public p083f.C1933t f1562o1;

    /* renamed from: p1 */
    public boolean f1563p1;

    /* renamed from: q1 */
    public androidx.constraintlayout.motion.widget.MotionLayout.C0324g f1564q1;

    /* renamed from: r0 */
    public androidx.constraintlayout.motion.widget.C0328b f1565r0;

    /* renamed from: r1 */
    public androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i f1566r1;

    /* renamed from: s0 */
    public android.view.animation.Interpolator f1567s0;

    /* renamed from: s1 */
    public androidx.constraintlayout.motion.widget.MotionLayout.C0321d f1568s1;

    /* renamed from: t0 */
    public float f1569t0;

    /* renamed from: t1 */
    public boolean f1570t1;

    /* renamed from: u0 */
    public int f1571u0;

    /* renamed from: u1 */
    public android.graphics.RectF f1572u1;

    /* renamed from: v0 */
    public int f1573v0;

    /* renamed from: v1 */
    public android.view.View f1574v1;

    /* renamed from: w0 */
    public int f1575w0;

    /* renamed from: w1 */
    public java.util.ArrayList<java.lang.Integer> f1576w1;

    /* renamed from: x0 */
    public int f1577x0;

    /* renamed from: y0 */
    public int f1578y0;

    /* renamed from: z0 */
    public boolean f1579z0;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    public class RunnableC0318a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ android.view.View f1580Y;

        public RunnableC0318a(androidx.constraintlayout.motion.widget.MotionLayout r1, android.view.View r2) {
                r0 = this;
                r0.f1580Y = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.view.View r0 = r2.f1580Y
                r1 = 1
                r0.setNestedScrollingEnabled(r1)
                return
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    public class C0319b extends p346u.AbstractInterpolatorC6271p {

        /* renamed from: a */
        public float f1581a;

        /* renamed from: b */
        public float f1582b;

        /* renamed from: c */
        public float f1583c;

        /* renamed from: d */
        public final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout f1584d;

        public C0319b(androidx.constraintlayout.motion.widget.MotionLayout r1) {
                r0 = this;
                r0.f1584d = r1
                r0.<init>()
                r1 = 0
                r0.f1581a = r1
                r0.f1582b = r1
                return
        }

        @Override // p346u.AbstractInterpolatorC6271p
        /* renamed from: a */
        public float mo881a() {
                r1 = this;
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.f1584d
                float r0 = r0.f1569t0
                return r0
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float r6) {
                r5 = this;
                float r0 = r5.f1581a
                r1 = 1073741824(0x40000000, float:2.0)
                r2 = 0
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 <= 0) goto L27
                float r2 = r5.f1583c
                float r3 = r0 / r2
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r3 >= 0) goto L13
                float r6 = r0 / r2
            L13:
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r5.f1584d
                float r4 = r2 * r6
                float r4 = r0 - r4
                r3.f1569t0 = r4
                float r0 = r0 * r6
                float r2 = r2 * r6
                float r2 = r2 * r6
                float r2 = r2 / r1
                float r0 = r0 - r2
                float r6 = r5.f1582b
                float r0 = r0 + r6
                return r0
            L27:
                float r2 = -r0
                float r3 = r5.f1583c
                float r2 = r2 / r3
                int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r2 >= 0) goto L31
                float r6 = -r0
                float r6 = r6 / r3
            L31:
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r5.f1584d
                float r4 = r3 * r6
                float r4 = r4 + r0
                r2.f1569t0 = r4
                float r0 = r0 * r6
                float r3 = r3 * r6
                float r3 = r3 * r6
                float r3 = r3 / r1
                float r3 = r3 + r0
                float r6 = r5.f1582b
                float r3 = r3 + r6
                return r3
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    public class C0320c {

        /* renamed from: a */
        public float[] f1585a;

        /* renamed from: b */
        public int[] f1586b;

        /* renamed from: c */
        public float[] f1587c;

        /* renamed from: d */
        public android.graphics.Path f1588d;

        /* renamed from: e */
        public android.graphics.Paint f1589e;

        /* renamed from: f */
        public android.graphics.Paint f1590f;

        /* renamed from: g */
        public android.graphics.Paint f1591g;

        /* renamed from: h */
        public android.graphics.Paint f1592h;

        /* renamed from: i */
        public android.graphics.Paint f1593i;

        /* renamed from: j */
        public float[] f1594j;

        /* renamed from: k */
        public int f1595k;

        /* renamed from: l */
        public android.graphics.Rect f1596l;

        /* renamed from: m */
        public int f1597m;

        /* renamed from: n */
        public final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout f1598n;

        public C0320c(androidx.constraintlayout.motion.widget.MotionLayout r5) {
                r4 = this;
                r4.f1598n = r5
                r4.<init>()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r4.f1596l = r0
                r0 = 1
                r4.f1597m = r0
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>()
                r4.f1589e = r1
                r1.setAntiAlias(r0)
                android.graphics.Paint r1 = r4.f1589e
                r2 = -21965(0xffffffffffffaa33, float:NaN)
                r1.setColor(r2)
                android.graphics.Paint r1 = r4.f1589e
                r2 = 1073741824(0x40000000, float:2.0)
                r1.setStrokeWidth(r2)
                android.graphics.Paint r1 = r4.f1589e
                android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
                r1.setStyle(r3)
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>()
                r4.f1590f = r1
                r1.setAntiAlias(r0)
                android.graphics.Paint r1 = r4.f1590f
                r3 = -2067046(0xffffffffffe0759a, float:NaN)
                r1.setColor(r3)
                android.graphics.Paint r1 = r4.f1590f
                r1.setStrokeWidth(r2)
                android.graphics.Paint r1 = r4.f1590f
                android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
                r1.setStyle(r3)
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>()
                r4.f1591g = r1
                r1.setAntiAlias(r0)
                android.graphics.Paint r1 = r4.f1591g
                r3 = -13391360(0xffffffffff33aa00, float:-2.388145E38)
                r1.setColor(r3)
                android.graphics.Paint r1 = r4.f1591g
                r1.setStrokeWidth(r2)
                android.graphics.Paint r1 = r4.f1591g
                android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
                r1.setStyle(r2)
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>()
                r4.f1592h = r1
                r1.setAntiAlias(r0)
                android.graphics.Paint r1 = r4.f1592h
                r1.setColor(r3)
                android.graphics.Paint r1 = r4.f1592h
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                float r5 = r5.density
                r2 = 1094713344(0x41400000, float:12.0)
                float r5 = r5 * r2
                r1.setTextSize(r5)
                r5 = 8
                float[] r5 = new float[r5]
                r4.f1594j = r5
                android.graphics.Paint r5 = new android.graphics.Paint
                r5.<init>()
                r4.f1593i = r5
                r5.setAntiAlias(r0)
                android.graphics.DashPathEffect r5 = new android.graphics.DashPathEffect
                r0 = 2
                float[] r0 = new float[r0]
                r0 = {x00be: FILL_ARRAY_DATA , data: [1082130432, 1090519040} // fill-array
                r1 = 0
                r5.<init>(r0, r1)
                android.graphics.Paint r0 = r4.f1591g
                r0.setPathEffect(r5)
                r5 = 100
                float[] r5 = new float[r5]
                r4.f1587c = r5
                r5 = 50
                int[] r5 = new int[r5]
                r4.f1586b = r5
                return
        }

        /* renamed from: a */
        public void m882a(android.graphics.Canvas r22, int r23, int r24, p346u.C6270o r25) {
                r21 = this;
                r6 = r21
                r7 = r22
                r8 = r23
                r9 = r25
                r10 = 2
                r11 = 1
                r12 = 0
                r13 = 4
                if (r8 != r13) goto L2e
                r0 = 0
                r1 = 0
                r2 = 0
            L11:
                int r3 = r6.f1595k
                if (r0 >= r3) goto L24
                int[] r3 = r6.f1586b
                r4 = r3[r0]
                if (r4 != r11) goto L1c
                r1 = 1
            L1c:
                r3 = r3[r0]
                if (r3 != r10) goto L21
                r2 = 1
            L21:
                int r0 = r0 + 1
                goto L11
            L24:
                if (r1 == 0) goto L29
                r21.m885d(r22)
            L29:
                if (r2 == 0) goto L2e
                r21.m883b(r22)
            L2e:
                if (r8 != r10) goto L33
                r21.m885d(r22)
            L33:
                r14 = 3
                if (r8 != r14) goto L39
                r21.m883b(r22)
            L39:
                float[] r0 = r6.f1585a
                android.graphics.Paint r1 = r6.f1589e
                r7.drawLines(r0, r1)
                android.view.View r0 = r9.f24368a
                if (r0 == 0) goto L52
                int r0 = r0.getWidth()
                android.view.View r1 = r9.f24368a
                int r1 = r1.getHeight()
                r15 = r0
                r16 = r1
                goto L55
            L52:
                r15 = 0
                r16 = 0
            L55:
                r5 = 1
            L56:
                int r0 = r24 + (-1)
                if (r5 >= r0) goto L11d
                if (r8 != r13) goto L68
                int[] r0 = r6.f1586b
                int r1 = r5 + (-1)
                r0 = r0[r1]
                if (r0 != 0) goto L68
                r20 = r5
                goto L119
            L68:
                float[] r0 = r6.f1587c
                int r1 = r5 * 2
                r4 = r0[r1]
                int r1 = r1 + r11
                r3 = r0[r1]
                android.graphics.Path r0 = r6.f1588d
                r0.reset()
                android.graphics.Path r0 = r6.f1588d
                r1 = 1092616192(0x41200000, float:10.0)
                float r2 = r3 + r1
                r0.moveTo(r4, r2)
                android.graphics.Path r0 = r6.f1588d
                float r2 = r4 + r1
                r0.lineTo(r2, r3)
                android.graphics.Path r0 = r6.f1588d
                float r2 = r3 - r1
                r0.lineTo(r4, r2)
                android.graphics.Path r0 = r6.f1588d
                float r1 = r4 - r1
                r0.lineTo(r1, r3)
                android.graphics.Path r0 = r6.f1588d
                r0.close()
                int r0 = r5 + (-1)
                java.util.ArrayList<u.q> r1 = r9.f24386s
                java.lang.Object r1 = r1.get(r0)
                u.q r1 = (p346u.C6272q) r1
                r17 = 0
                if (r8 != r13) goto Le9
                int[] r1 = r6.f1586b
                r2 = r1[r0]
                if (r2 != r11) goto Lbb
                float r0 = r4 - r17
                float r1 = r3 - r17
                r6.m886e(r7, r0, r1)
            Lb4:
                r19 = r3
                r18 = r4
                r20 = r5
                goto Le1
            Lbb:
                r2 = r1[r0]
                if (r2 != r10) goto Lc7
                float r0 = r4 - r17
                float r1 = r3 - r17
                r6.m884c(r7, r0, r1)
                goto Lb4
            Lc7:
                r0 = r1[r0]
                if (r0 != r14) goto Lb4
                float r2 = r4 - r17
                float r18 = r3 - r17
                r0 = r21
                r1 = r22
                r19 = r3
                r3 = r18
                r18 = r4
                r4 = r15
                r20 = r5
                r5 = r16
                r0.m887f(r1, r2, r3, r4, r5)
            Le1:
                android.graphics.Path r0 = r6.f1588d
                android.graphics.Paint r1 = r6.f1593i
                r7.drawPath(r0, r1)
                goto Lef
            Le9:
                r19 = r3
                r18 = r4
                r20 = r5
            Lef:
                if (r8 != r10) goto Lf8
                float r4 = r18 - r17
                float r3 = r19 - r17
                r6.m886e(r7, r4, r3)
            Lf8:
                if (r8 != r14) goto L101
                float r4 = r18 - r17
                float r3 = r19 - r17
                r6.m884c(r7, r4, r3)
            L101:
                r0 = 6
                if (r8 != r0) goto L112
                float r2 = r18 - r17
                float r3 = r19 - r17
                r0 = r21
                r1 = r22
                r4 = r15
                r5 = r16
                r0.m887f(r1, r2, r3, r4, r5)
            L112:
                android.graphics.Path r0 = r6.f1588d
                android.graphics.Paint r1 = r6.f1593i
                r7.drawPath(r0, r1)
            L119:
                int r5 = r20 + 1
                goto L56
            L11d:
                float[] r0 = r6.f1585a
                int r1 = r0.length
                if (r1 <= r11) goto L13c
                r1 = r0[r12]
                r0 = r0[r11]
                android.graphics.Paint r2 = r6.f1590f
                r3 = 1090519040(0x41000000, float:8.0)
                r7.drawCircle(r1, r0, r3, r2)
                float[] r0 = r6.f1585a
                int r1 = r0.length
                int r1 = r1 - r10
                r1 = r0[r1]
                int r2 = r0.length
                int r2 = r2 - r11
                r0 = r0[r2]
                android.graphics.Paint r2 = r6.f1590f
                r7.drawCircle(r1, r0, r3, r2)
            L13c:
                return
        }

        /* renamed from: b */
        public final void m883b(android.graphics.Canvas r19) {
                r18 = this;
                r0 = r18
                float[] r1 = r0.f1585a
                r2 = 0
                r2 = r1[r2]
                r3 = 1
                r4 = r1[r3]
                int r5 = r1.length
                int r5 = r5 + (-2)
                r5 = r1[r5]
                int r6 = r1.length
                int r6 = r6 - r3
                r1 = r1[r6]
                float r7 = java.lang.Math.min(r2, r5)
                float r8 = java.lang.Math.max(r4, r1)
                float r9 = java.lang.Math.max(r2, r5)
                float r10 = java.lang.Math.max(r4, r1)
                android.graphics.Paint r11 = r0.f1591g
                r6 = r19
                r6.drawLine(r7, r8, r9, r10, r11)
                float r13 = java.lang.Math.min(r2, r5)
                float r14 = java.lang.Math.min(r4, r1)
                float r15 = java.lang.Math.min(r2, r5)
                float r16 = java.lang.Math.max(r4, r1)
                android.graphics.Paint r1 = r0.f1591g
                r12 = r19
                r17 = r1
                r12.drawLine(r13, r14, r15, r16, r17)
                return
        }

        /* renamed from: c */
        public final void m884c(android.graphics.Canvas r19, float r20, float r21) {
                r18 = this;
                r0 = r18
                r7 = r19
                float[] r1 = r0.f1585a
                r2 = 0
                r2 = r1[r2]
                r3 = 1
                r8 = r1[r3]
                int r4 = r1.length
                int r4 = r4 + (-2)
                r4 = r1[r4]
                int r5 = r1.length
                int r5 = r5 - r3
                r9 = r1[r5]
                float r1 = java.lang.Math.min(r2, r4)
                float r10 = java.lang.Math.max(r8, r9)
                float r3 = java.lang.Math.min(r2, r4)
                float r3 = r20 - r3
                float r5 = java.lang.Math.max(r8, r9)
                float r11 = r5 - r21
                java.lang.String r12 = ""
                java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r12)
                r13 = 1120403456(0x42c80000, float:100.0)
                float r6 = r3 * r13
                float r14 = r4 - r2
                float r14 = java.lang.Math.abs(r14)
                float r6 = r6 / r14
                double r14 = (double) r6
                r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                double r14 = r14 + r16
                int r6 = (int) r14
                float r6 = (float) r6
                float r6 = r6 / r13
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                android.graphics.Paint r6 = r0.f1592h
                r0.m888g(r5, r6)
                r14 = 1073741824(0x40000000, float:2.0)
                float r3 = r3 / r14
                android.graphics.Rect r6 = r0.f1596l
                int r6 = r6.width()
                int r6 = r6 / 2
                float r6 = (float) r6
                float r3 = r3 - r6
                float r3 = r3 + r1
                r1 = 1101004800(0x41a00000, float:20.0)
                float r1 = r21 - r1
                android.graphics.Paint r6 = r0.f1592h
                r7.drawText(r5, r3, r1, r6)
                float r4 = java.lang.Math.min(r2, r4)
                android.graphics.Paint r6 = r0.f1591g
                r1 = r19
                r2 = r20
                r3 = r21
                r5 = r21
                r1.drawLine(r2, r3, r4, r5, r6)
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r12)
                float r2 = r11 * r13
                float r3 = r9 - r8
                float r3 = java.lang.Math.abs(r3)
                float r2 = r2 / r3
                double r2 = (double) r2
                double r2 = r2 + r16
                int r2 = (int) r2
                float r2 = (float) r2
                float r2 = r2 / r13
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.graphics.Paint r2 = r0.f1592h
                r0.m888g(r1, r2)
                float r11 = r11 / r14
                android.graphics.Rect r2 = r0.f1596l
                int r2 = r2.height()
                int r2 = r2 / 2
                float r2 = (float) r2
                float r11 = r11 - r2
                r2 = 1084227584(0x40a00000, float:5.0)
                float r2 = r20 + r2
                float r10 = r10 - r11
                android.graphics.Paint r3 = r0.f1592h
                r7.drawText(r1, r2, r10, r3)
                float r5 = java.lang.Math.max(r8, r9)
                android.graphics.Paint r6 = r0.f1591g
                r1 = r19
                r2 = r20
                r3 = r21
                r4 = r20
                r1.drawLine(r2, r3, r4, r5, r6)
                return
        }

        /* renamed from: d */
        public final void m885d(android.graphics.Canvas r9) {
                r8 = this;
                float[] r0 = r8.f1585a
                r1 = 0
                r3 = r0[r1]
                r1 = 1
                r4 = r0[r1]
                int r2 = r0.length
                int r2 = r2 + (-2)
                r5 = r0[r2]
                int r2 = r0.length
                int r2 = r2 - r1
                r6 = r0[r2]
                android.graphics.Paint r7 = r8.f1591g
                r2 = r9
                r2.drawLine(r3, r4, r5, r6, r7)
                return
        }

        /* renamed from: e */
        public final void m886e(android.graphics.Canvas r14, float r15, float r16) {
                r13 = this;
                r0 = r13
                r2 = r15
                r3 = r16
                float[] r1 = r0.f1585a
                r4 = 0
                r4 = r1[r4]
                r5 = 1
                r6 = r1[r5]
                int r7 = r1.length
                int r7 = r7 + (-2)
                r7 = r1[r7]
                int r8 = r1.length
                int r8 = r8 - r5
                r1 = r1[r8]
                float r5 = r4 - r7
                double r8 = (double) r5
                float r5 = r6 - r1
                double r10 = (double) r5
                double r8 = java.lang.Math.hypot(r8, r10)
                float r5 = (float) r8
                float r8 = r2 - r4
                float r7 = r7 - r4
                float r8 = r8 * r7
                float r9 = r3 - r6
                float r1 = r1 - r6
                float r9 = r9 * r1
                float r9 = r9 + r8
                float r8 = r5 * r5
                float r9 = r9 / r8
                float r7 = r7 * r9
                float r4 = r4 + r7
                float r9 = r9 * r1
                float r6 = r6 + r9
                android.graphics.Path r9 = new android.graphics.Path
                r9.<init>()
                r9.moveTo(r15, r3)
                r9.lineTo(r4, r6)
                float r1 = r4 - r2
                double r7 = (double) r1
                float r1 = r6 - r3
                double r10 = (double) r1
                double r7 = java.lang.Math.hypot(r7, r10)
                float r1 = (float) r7
                java.lang.String r7 = ""
                java.lang.StringBuilder r7 = android.support.v4.media.C0144c.m256a(r7)
                r8 = 1120403456(0x42c80000, float:100.0)
                float r10 = r1 * r8
                float r10 = r10 / r5
                int r5 = (int) r10
                float r5 = (float) r5
                float r5 = r5 / r8
                r7.append(r5)
                java.lang.String r8 = r7.toString()
                android.graphics.Paint r5 = r0.f1592h
                r13.m888g(r8, r5)
                r5 = 1073741824(0x40000000, float:2.0)
                float r1 = r1 / r5
                android.graphics.Rect r5 = r0.f1596l
                int r5 = r5.width()
                int r5 = r5 / 2
                float r5 = (float) r5
                float r10 = r1 - r5
                android.graphics.Paint r12 = r0.f1592h
                r11 = -1046478848(0xffffffffc1a00000, float:-20.0)
                r7 = r14
                r7.drawTextOnPath(r8, r9, r10, r11, r12)
                android.graphics.Paint r7 = r0.f1591g
                r1 = r14
                r5 = r6
                r6 = r7
                r1.drawLine(r2, r3, r4, r5, r6)
                return
        }

        /* renamed from: f */
        public final void m887f(android.graphics.Canvas r16, float r17, float r18, int r19, int r20) {
                r15 = this;
                r0 = r15
                r7 = r16
                java.lang.String r8 = ""
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r8)
                int r2 = r19 / 2
                float r2 = (float) r2
                float r2 = r17 - r2
                r9 = 1120403456(0x42c80000, float:100.0)
                float r2 = r2 * r9
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f1598n
                int r3 = r3.getWidth()
                int r3 = r3 - r19
                float r3 = (float) r3
                float r2 = r2 / r3
                double r2 = (double) r2
                r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                double r2 = r2 + r10
                int r2 = (int) r2
                float r2 = (float) r2
                float r2 = r2 / r9
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.graphics.Paint r2 = r0.f1592h
                r15.m888g(r1, r2)
                r12 = 1073741824(0x40000000, float:2.0)
                float r2 = r17 / r12
                android.graphics.Rect r3 = r0.f1596l
                int r3 = r3.width()
                int r3 = r3 / 2
                float r3 = (float) r3
                float r2 = r2 - r3
                r13 = 0
                float r2 = r2 + r13
                r3 = 1101004800(0x41a00000, float:20.0)
                float r3 = r18 - r3
                android.graphics.Paint r4 = r0.f1592h
                r7.drawText(r1, r2, r3, r4)
                r14 = 1065353216(0x3f800000, float:1.0)
                float r4 = java.lang.Math.min(r13, r14)
                android.graphics.Paint r6 = r0.f1591g
                r1 = r16
                r2 = r17
                r3 = r18
                r5 = r18
                r1.drawLine(r2, r3, r4, r5, r6)
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r8)
                int r2 = r20 / 2
                float r2 = (float) r2
                float r2 = r18 - r2
                float r2 = r2 * r9
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f1598n
                int r3 = r3.getHeight()
                int r3 = r3 - r20
                float r3 = (float) r3
                float r2 = r2 / r3
                double r2 = (double) r2
                double r2 = r2 + r10
                int r2 = (int) r2
                float r2 = (float) r2
                float r2 = r2 / r9
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.graphics.Paint r2 = r0.f1592h
                r15.m888g(r1, r2)
                float r2 = r18 / r12
                android.graphics.Rect r3 = r0.f1596l
                int r3 = r3.height()
                int r3 = r3 / 2
                float r3 = (float) r3
                float r2 = r2 - r3
                r3 = 1084227584(0x40a00000, float:5.0)
                float r3 = r17 + r3
                float r2 = r13 - r2
                android.graphics.Paint r4 = r0.f1592h
                r7.drawText(r1, r3, r2, r4)
                float r5 = java.lang.Math.max(r13, r14)
                android.graphics.Paint r6 = r0.f1591g
                r1 = r16
                r2 = r17
                r3 = r18
                r4 = r17
                r1.drawLine(r2, r3, r4, r5, r6)
                return
        }

        /* renamed from: g */
        public void m888g(java.lang.String r4, android.graphics.Paint r5) {
                r3 = this;
                int r0 = r4.length()
                android.graphics.Rect r1 = r3.f1596l
                r2 = 0
                r5.getTextBounds(r4, r2, r0, r1)
                return
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    public class C0321d {

        /* renamed from: a */
        public p381w.C6766g f1599a;

        /* renamed from: b */
        public p381w.C6766g f1600b;

        /* renamed from: c */
        public androidx.constraintlayout.widget.C0333b f1601c;

        /* renamed from: d */
        public androidx.constraintlayout.widget.C0333b f1602d;

        /* renamed from: e */
        public int f1603e;

        /* renamed from: f */
        public int f1604f;

        /* renamed from: g */
        public final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout f1605g;

        public C0321d(androidx.constraintlayout.motion.widget.MotionLayout r1) {
                r0 = this;
                r0.f1605g = r1
                r0.<init>()
                w.g r1 = new w.g
                r1.<init>()
                r0.f1599a = r1
                w.g r1 = new w.g
                r1.<init>()
                r0.f1600b = r1
                r1 = 0
                r0.f1601c = r1
                r0.f1602d = r1
                return
        }

        /* renamed from: a */
        public void m889a() {
                r15 = this;
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r15.f1605g
                int r0 = r0.getChildCount()
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r15.f1605g
                java.util.HashMap<android.view.View, u.o> r1 = r1.f1522A0
                r1.clear()
                r1 = 0
                r2 = 0
            Lf:
                if (r2 >= r0) goto L26
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r15.f1605g
                android.view.View r3 = r3.getChildAt(r2)
                u.o r4 = new u.o
                r4.<init>(r3)
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r15.f1605g
                java.util.HashMap<android.view.View, u.o> r5 = r5.f1522A0
                r5.put(r3, r4)
                int r2 = r2 + 1
                goto Lf
            L26:
                if (r1 >= r0) goto L13f
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r15.f1605g
                android.view.View r2 = r2.getChildAt(r1)
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r15.f1605g
                java.util.HashMap<android.view.View, u.o> r3 = r3.f1522A0
                java.lang.Object r3 = r3.get(r2)
                u.o r3 = (p346u.C6270o) r3
                if (r3 != 0) goto L3c
                goto L13b
            L3c:
                androidx.constraintlayout.widget.b r4 = r15.f1601c
                java.lang.String r5 = ")"
                java.lang.String r6 = " ("
                java.lang.String r7 = "no widget for  "
                java.lang.String r8 = "MotionLayout"
                if (r4 == 0) goto Lc2
                w.g r4 = r15.f1599a
                w.f r4 = r15.m891c(r4, r2)
                if (r4 == 0) goto L8e
                androidx.constraintlayout.widget.b r9 = r15.f1601c
                u.q r10 = r3.f24371d
                r11 = 0
                r10.f24397a0 = r11
                r10.f24398b0 = r11
                r3.m12892d(r10)
                u.q r10 = r3.f24371d
                int r11 = r4.m13722v()
                float r11 = (float) r11
                int r12 = r4.m13723w()
                float r12 = (float) r12
                int r13 = r4.m13721u()
                float r13 = (float) r13
                int r14 = r4.m13715o()
                float r14 = (float) r14
                r10.m12897k(r11, r12, r13, r14)
                int r10 = r3.f24369b
                androidx.constraintlayout.widget.b$a r10 = r9.m950i(r10)
                u.q r11 = r3.f24371d
                r11.m12894e(r10)
                androidx.constraintlayout.widget.b$c r10 = r10.f1793c
                float r10 = r10.f1866f
                r3.f24377j = r10
                u.l r10 = r3.f24373f
                int r11 = r3.f24369b
                r10.m12886h(r4, r9, r11)
                goto Lc2
            L8e:
                androidx.constraintlayout.motion.widget.MotionLayout r4 = r15.f1605g
                int r4 = r4.f1532K0
                if (r4 == 0) goto Lc2
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r9 = p346u.C6256a.m12870a()
                r4.append(r9)
                r4.append(r7)
                java.lang.String r9 = p346u.C6256a.m12872c(r2)
                r4.append(r9)
                r4.append(r6)
                java.lang.Class r9 = r2.getClass()
                java.lang.String r9 = r9.getName()
                r4.append(r9)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                android.util.Log.e(r8, r4)
            Lc2:
                androidx.constraintlayout.widget.b r4 = r15.f1602d
                if (r4 == 0) goto L13b
                w.g r4 = r15.f1600b
                w.f r4 = r15.m891c(r4, r2)
                if (r4 == 0) goto L107
                androidx.constraintlayout.widget.b r2 = r15.f1602d
                u.q r5 = r3.f24372e
                r6 = 1065353216(0x3f800000, float:1.0)
                r5.f24397a0 = r6
                r5.f24398b0 = r6
                r3.m12892d(r5)
                u.q r5 = r3.f24372e
                int r6 = r4.m13722v()
                float r6 = (float) r6
                int r7 = r4.m13723w()
                float r7 = (float) r7
                int r8 = r4.m13721u()
                float r8 = (float) r8
                int r9 = r4.m13715o()
                float r9 = (float) r9
                r5.m12897k(r6, r7, r8, r9)
                u.q r5 = r3.f24372e
                int r6 = r3.f24369b
                androidx.constraintlayout.widget.b$a r6 = r2.m950i(r6)
                r5.m12894e(r6)
                u.l r5 = r3.f24374g
                int r3 = r3.f24369b
                r5.m12886h(r4, r2, r3)
                goto L13b
            L107:
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r15.f1605g
                int r3 = r3.f1532K0
                if (r3 == 0) goto L13b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = p346u.C6256a.m12870a()
                r3.append(r4)
                r3.append(r7)
                java.lang.String r4 = p346u.C6256a.m12872c(r2)
                r3.append(r4)
                r3.append(r6)
                java.lang.Class r2 = r2.getClass()
                java.lang.String r2 = r2.getName()
                r3.append(r2)
                r3.append(r5)
                java.lang.String r2 = r3.toString()
                android.util.Log.e(r8, r2)
            L13b:
                int r1 = r1 + 1
                goto L26
            L13f:
                return
        }

        /* renamed from: b */
        public void m890b(p381w.C6766g r6, p381w.C6766g r7) {
                r5 = this;
                java.util.ArrayList<w.f> r0 = r6.f26243H0
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r1.put(r6, r7)
                java.util.ArrayList<w.f> r2 = r7.f26243H0
                r2.clear()
                r7.mo13676i(r6, r1)
                java.util.Iterator r6 = r0.iterator()
            L16:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L68
                java.lang.Object r2 = r6.next()
                w.f r2 = (p381w.C6765f) r2
                boolean r3 = r2 instanceof p381w.C6760a
                if (r3 == 0) goto L2c
                w.a r3 = new w.a
                r3.<init>()
                goto L4f
            L2c:
                boolean r3 = r2 instanceof p381w.C6768i
                if (r3 == 0) goto L36
                w.i r3 = new w.i
                r3.<init>()
                goto L4f
            L36:
                boolean r3 = r2 instanceof p381w.C6767h
                if (r3 == 0) goto L40
                w.h r3 = new w.h
                r3.<init>()
                goto L4f
            L40:
                boolean r3 = r2 instanceof p381w.InterfaceC6769j
                if (r3 == 0) goto L4a
                w.k r3 = new w.k
                r3.<init>()
                goto L4f
            L4a:
                w.f r3 = new w.f
                r3.<init>()
            L4f:
                java.util.ArrayList<w.f> r4 = r7.f26243H0
                r4.add(r3)
                w.f r4 = r3.f26128R
                if (r4 == 0) goto L62
                w.n r4 = (p381w.C6773n) r4
                java.util.ArrayList<w.f> r4 = r4.f26243H0
                r4.remove(r3)
                r3.mo13693E()
            L62:
                r3.f26128R = r7
                r1.put(r2, r3)
                goto L16
            L68:
                java.util.Iterator r6 = r0.iterator()
            L6c:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L82
                java.lang.Object r7 = r6.next()
                w.f r7 = (p381w.C6765f) r7
                java.lang.Object r0 = r1.get(r7)
                w.f r0 = (p381w.C6765f) r0
                r0.mo13676i(r7, r1)
                goto L6c
            L82:
                return
        }

        /* renamed from: c */
        public p381w.C6765f m891c(p381w.C6766g r5, android.view.View r6) {
                r4 = this;
                java.lang.Object r0 = r5.f26152h0
                if (r0 != r6) goto L5
                return r5
            L5:
                java.util.ArrayList<w.f> r5 = r5.f26243H0
                int r0 = r5.size()
                r1 = 0
            Lc:
                if (r1 >= r0) goto L1c
                java.lang.Object r2 = r5.get(r1)
                w.f r2 = (p381w.C6765f) r2
                java.lang.Object r3 = r2.f26152h0
                if (r3 != r6) goto L19
                return r2
            L19:
                int r1 = r1 + 1
                goto Lc
            L1c:
                r5 = 0
                return r5
        }

        /* renamed from: d */
        public void m892d(androidx.constraintlayout.widget.C0333b r7, androidx.constraintlayout.widget.C0333b r8) {
                r6 = this;
                w.f$a r0 = p381w.C6765f.a.f26190Z
                r6.f1601c = r7
                r6.f1602d = r8
                w.g r1 = new w.g
                r1.<init>()
                r6.f1599a = r1
                w.g r1 = new w.g
                r1.<init>()
                r6.f1600b = r1
                w.g r1 = r6.f1599a
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r6.f1605g
                boolean r3 = androidx.constraintlayout.motion.widget.MotionLayout.f1521x1
                w.g r2 = r2.f1690c0
                x.b$b r2 = r2.f26196K0
                r1.m13737c0(r2)
                w.g r1 = r6.f1600b
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r6.f1605g
                w.g r2 = r2.f1690c0
                x.b$b r2 = r2.f26196K0
                r1.m13737c0(r2)
                w.g r1 = r6.f1599a
                java.util.ArrayList<w.f> r1 = r1.f26243H0
                r1.clear()
                w.g r1 = r6.f1600b
                java.util.ArrayList<w.f> r1 = r1.f26243H0
                r1.clear()
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r6.f1605g
                w.g r1 = r1.f1690c0
                w.g r2 = r6.f1599a
                r6.m890b(r1, r2)
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r6.f1605g
                w.g r1 = r1.f1690c0
                w.g r2 = r6.f1600b
                r6.m890b(r1, r2)
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r6.f1605g
                float r1 = r1.f1526E0
                double r1 = (double) r1
                r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L64
                if (r7 == 0) goto L5e
                w.g r1 = r6.f1599a
                r6.m894f(r1, r7)
            L5e:
                w.g r7 = r6.f1600b
                r6.m894f(r7, r8)
                goto L70
            L64:
                w.g r1 = r6.f1600b
                r6.m894f(r1, r8)
                if (r7 == 0) goto L70
                w.g r8 = r6.f1599a
                r6.m894f(r8, r7)
            L70:
                w.g r7 = r6.f1599a
                androidx.constraintlayout.motion.widget.MotionLayout r8 = r6.f1605g
                boolean r8 = r8.m928k()
                r7.f26197L0 = r8
                w.g r7 = r6.f1599a
                x.b r8 = r7.f26194I0
                r8.m13963c(r7)
                w.g r7 = r6.f1600b
                androidx.constraintlayout.motion.widget.MotionLayout r8 = r6.f1605g
                boolean r8 = r8.m928k()
                r7.f26197L0 = r8
                w.g r7 = r6.f1600b
                x.b r8 = r7.f26194I0
                r8.m13963c(r7)
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r6.f1605g
                android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                if (r7 == 0) goto Lbd
                int r8 = r7.width
                r1 = -2
                if (r8 != r1) goto Lac
                w.g r8 = r6.f1599a
                w.f$a[] r8 = r8.f26127Q
                r2 = 0
                r8[r2] = r0
                w.g r8 = r6.f1600b
                w.f$a[] r8 = r8.f26127Q
                r8[r2] = r0
            Lac:
                int r7 = r7.height
                if (r7 != r1) goto Lbd
                w.g r7 = r6.f1599a
                w.f$a[] r7 = r7.f26127Q
                r8 = 1
                r7[r8] = r0
                w.g r7 = r6.f1600b
                w.f$a[] r7 = r7.f26127Q
                r7[r8] = r0
            Lbd:
                return
        }

        /* renamed from: e */
        public void m893e() {
                r13 = this;
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.f1605g
                int r2 = r0.f1577x0
                int r3 = r0.f1578y0
                int r0 = android.view.View.MeasureSpec.getMode(r2)
                int r1 = android.view.View.MeasureSpec.getMode(r3)
                androidx.constraintlayout.motion.widget.MotionLayout r4 = r13.f1605g
                r4.f1559l1 = r0
                r4.f1560m1 = r1
                int r4 = r4.getOptimizationLevel()
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r13.f1605g
                int r6 = r5.f1573v0
                int r5 = r5.getStartState()
                if (r6 != r5) goto L35
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r13.f1605g
                w.g r6 = r13.f1600b
                r5.m930q(r6, r4, r2, r3)
                androidx.constraintlayout.widget.b r5 = r13.f1601c
                if (r5 == 0) goto L47
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r13.f1605g
                w.g r6 = r13.f1599a
                r5.m930q(r6, r4, r2, r3)
                goto L47
            L35:
                androidx.constraintlayout.widget.b r5 = r13.f1601c
                if (r5 == 0) goto L40
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r13.f1605g
                w.g r6 = r13.f1599a
                r5.m930q(r6, r4, r2, r3)
            L40:
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r13.f1605g
                w.g r6 = r13.f1600b
                r5.m930q(r6, r4, r2, r3)
            L47:
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r13.f1605g
                android.view.ViewParent r5 = r5.getParent()
                boolean r5 = r5 instanceof androidx.constraintlayout.motion.widget.MotionLayout
                r8 = 0
                r9 = 1
                if (r5 == 0) goto L5b
                r5 = 1073741824(0x40000000, float:2.0)
                if (r0 != r5) goto L5b
                if (r1 != r5) goto L5b
                r5 = 0
                goto L5c
            L5b:
                r5 = 1
            L5c:
                if (r5 == 0) goto Lcd
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r13.f1605g
                r5.f1559l1 = r0
                r5.f1560m1 = r1
                int r0 = r5.f1573v0
                int r1 = r5.getStartState()
                if (r0 != r1) goto L7f
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.f1605g
                w.g r1 = r13.f1600b
                r0.m930q(r1, r4, r2, r3)
                androidx.constraintlayout.widget.b r0 = r13.f1601c
                if (r0 == 0) goto L91
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.f1605g
                w.g r1 = r13.f1599a
                r0.m930q(r1, r4, r2, r3)
                goto L91
            L7f:
                androidx.constraintlayout.widget.b r0 = r13.f1601c
                if (r0 == 0) goto L8a
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.f1605g
                w.g r1 = r13.f1599a
                r0.m930q(r1, r4, r2, r3)
            L8a:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.f1605g
                w.g r1 = r13.f1600b
                r0.m930q(r1, r4, r2, r3)
            L91:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.f1605g
                w.g r1 = r13.f1599a
                int r1 = r1.m13721u()
                r0.f1555h1 = r1
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.f1605g
                w.g r1 = r13.f1599a
                int r1 = r1.m13715o()
                r0.f1556i1 = r1
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.f1605g
                w.g r1 = r13.f1600b
                int r1 = r1.m13721u()
                r0.f1557j1 = r1
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.f1605g
                w.g r1 = r13.f1600b
                int r1 = r1.m13715o()
                r0.f1558k1 = r1
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.f1605g
                int r1 = r0.f1555h1
                int r4 = r0.f1557j1
                if (r1 != r4) goto Lca
                int r1 = r0.f1556i1
                int r4 = r0.f1558k1
                if (r1 == r4) goto Lc8
                goto Lca
            Lc8:
                r1 = 0
                goto Lcb
            Lca:
                r1 = 1
            Lcb:
                r0.f1554g1 = r1
            Lcd:
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.f1605g
                int r0 = r1.f1555h1
                int r4 = r1.f1556i1
                int r5 = r1.f1559l1
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r5 == r6) goto Ldb
                if (r5 != 0) goto Le6
            Ldb:
                float r5 = (float) r0
                float r7 = r1.f1561n1
                int r10 = r1.f1557j1
                int r10 = r10 - r0
                float r0 = (float) r10
                float r7 = r7 * r0
                float r7 = r7 + r5
                int r0 = (int) r7
            Le6:
                int r5 = r1.f1560m1
                if (r5 == r6) goto Lec
                if (r5 != 0) goto Lf7
            Lec:
                float r5 = (float) r4
                float r6 = r1.f1561n1
                int r7 = r1.f1558k1
                int r7 = r7 - r4
                float r4 = (float) r7
                float r6 = r6 * r4
                float r6 = r6 + r5
                int r4 = (int) r6
            Lf7:
                r5 = r4
                w.g r4 = r13.f1599a
                boolean r6 = r4.f26206U0
                if (r6 != 0) goto L107
                w.g r6 = r13.f1600b
                boolean r6 = r6.f26206U0
                if (r6 == 0) goto L105
                goto L107
            L105:
                r6 = 0
                goto L108
            L107:
                r6 = 1
            L108:
                boolean r4 = r4.f26207V0
                if (r4 != 0) goto L115
                w.g r4 = r13.f1600b
                boolean r4 = r4.f26207V0
                if (r4 == 0) goto L113
                goto L115
            L113:
                r7 = 0
                goto L116
            L115:
                r7 = 1
            L116:
                r4 = r0
                r1.m929p(r2, r3, r4, r5, r6, r7)
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.f1605g
                int r1 = r0.getChildCount()
                androidx.constraintlayout.motion.widget.MotionLayout$d r2 = r0.f1568s1
                r2.m889a()
                r0.f1530I0 = r9
                int r2 = r0.getWidth()
                int r3 = r0.getHeight()
                androidx.constraintlayout.motion.widget.b r4 = r0.f1565r0
                androidx.constraintlayout.motion.widget.b$b r4 = r4.f1624c
                r5 = -1
                if (r4 == 0) goto L139
                int r4 = r4.f1656p
                goto L13a
            L139:
                r4 = -1
            L13a:
                if (r4 == r5) goto L152
                r5 = 0
            L13d:
                if (r5 >= r1) goto L152
                java.util.HashMap<android.view.View, u.o> r6 = r0.f1522A0
                android.view.View r7 = r0.getChildAt(r5)
                java.lang.Object r6 = r6.get(r7)
                u.o r6 = (p346u.C6270o) r6
                if (r6 == 0) goto L14f
                r6.f24393z = r4
            L14f:
                int r5 = r5 + 1
                goto L13d
            L152:
                r4 = 0
            L153:
                if (r4 >= r1) goto L172
                java.util.HashMap<android.view.View, u.o> r5 = r0.f1522A0
                android.view.View r6 = r0.getChildAt(r4)
                java.lang.Object r5 = r5.get(r6)
                u.o r5 = (p346u.C6270o) r5
                if (r5 == 0) goto L16f
                androidx.constraintlayout.motion.widget.b r6 = r0.f1565r0
                r6.m907g(r5)
                long r6 = r0.getNanoTime()
                r5.m12893e(r2, r3, r6)
            L16f:
                int r4 = r4 + 1
                goto L153
            L172:
                androidx.constraintlayout.motion.widget.b r2 = r0.f1565r0
                androidx.constraintlayout.motion.widget.b$b r2 = r2.f1624c
                r3 = 0
                if (r2 == 0) goto L17c
                float r2 = r2.f1649i
                goto L17d
            L17c:
                r2 = 0
            L17d:
                int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r3 == 0) goto L255
                double r3 = (double) r2
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 >= 0) goto L18a
                r3 = 1
                goto L18b
            L18a:
                r3 = 0
            L18b:
                float r2 = java.lang.Math.abs(r2)
                r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
                r6 = 0
                r7 = 2139095039(0x7f7fffff, float:3.4028235E38)
                r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            L19c:
                if (r6 >= r1) goto L1c9
                java.util.HashMap<android.view.View, u.o> r11 = r0.f1522A0
                android.view.View r12 = r0.getChildAt(r6)
                java.lang.Object r11 = r11.get(r12)
                u.o r11 = (p346u.C6270o) r11
                float r12 = r11.f24377j
                boolean r12 = java.lang.Float.isNaN(r12)
                if (r12 != 0) goto L1b3
                goto L1ca
            L1b3:
                u.q r11 = r11.f24372e
                float r12 = r11.f24399c0
                float r11 = r11.f24400d0
                if (r3 == 0) goto L1bd
                float r11 = r11 - r12
                goto L1be
            L1bd:
                float r11 = r11 + r12
            L1be:
                float r7 = java.lang.Math.min(r7, r11)
                float r10 = java.lang.Math.max(r10, r11)
                int r6 = r6 + 1
                goto L19c
            L1c9:
                r9 = 0
            L1ca:
                r6 = 1065353216(0x3f800000, float:1.0)
                if (r9 == 0) goto L229
                r7 = 0
            L1cf:
                if (r7 >= r1) goto L1f4
                java.util.HashMap<android.view.View, u.o> r9 = r0.f1522A0
                android.view.View r10 = r0.getChildAt(r7)
                java.lang.Object r9 = r9.get(r10)
                u.o r9 = (p346u.C6270o) r9
                float r10 = r9.f24377j
                boolean r10 = java.lang.Float.isNaN(r10)
                if (r10 != 0) goto L1f1
                float r10 = r9.f24377j
                float r5 = java.lang.Math.min(r5, r10)
                float r9 = r9.f24377j
                float r4 = java.lang.Math.max(r4, r9)
            L1f1:
                int r7 = r7 + 1
                goto L1cf
            L1f4:
                if (r8 >= r1) goto L255
                java.util.HashMap<android.view.View, u.o> r7 = r0.f1522A0
                android.view.View r9 = r0.getChildAt(r8)
                java.lang.Object r7 = r7.get(r9)
                u.o r7 = (p346u.C6270o) r7
                float r9 = r7.f24377j
                boolean r9 = java.lang.Float.isNaN(r9)
                if (r9 != 0) goto L226
                float r9 = r6 - r2
                float r9 = r6 / r9
                r7.f24379l = r9
                float r9 = r7.f24377j
                if (r3 == 0) goto L21c
                float r9 = r4 - r9
                float r10 = r4 - r5
                float r9 = r9 / r10
                float r9 = r9 * r2
                goto L222
            L21c:
                float r9 = r9 - r5
                float r9 = r9 * r2
                float r10 = r4 - r5
                float r9 = r9 / r10
            L222:
                float r9 = r2 - r9
                r7.f24378k = r9
            L226:
                int r8 = r8 + 1
                goto L1f4
            L229:
                if (r8 >= r1) goto L255
                java.util.HashMap<android.view.View, u.o> r4 = r0.f1522A0
                android.view.View r5 = r0.getChildAt(r8)
                java.lang.Object r4 = r4.get(r5)
                u.o r4 = (p346u.C6270o) r4
                u.q r5 = r4.f24372e
                float r9 = r5.f24399c0
                float r5 = r5.f24400d0
                if (r3 == 0) goto L241
                float r5 = r5 - r9
                goto L242
            L241:
                float r5 = r5 + r9
            L242:
                float r9 = r6 - r2
                float r9 = r6 / r9
                r4.f24379l = r9
                float r5 = r5 - r7
                float r5 = r5 * r2
                float r9 = r10 - r7
                float r5 = r5 / r9
                float r5 = r2 - r5
                r4.f24378k = r5
                int r8 = r8 + 1
                goto L229
            L255:
                return
        }

        /* renamed from: f */
        public final void m894f(p381w.C6766g r13, androidx.constraintlayout.widget.C0333b r14) {
                r12 = this;
                android.util.SparseArray r6 = new android.util.SparseArray
                r6.<init>()
                androidx.constraintlayout.widget.c$a r7 = new androidx.constraintlayout.widget.c$a
                r0 = -2
                r7.<init>(r0, r0)
                r6.clear()
                r8 = 0
                r6.put(r8, r13)
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r12.f1605g
                int r0 = r0.getId()
                r6.put(r0, r13)
                java.util.ArrayList<w.f> r0 = r13.f26243H0
                java.util.Iterator r0 = r0.iterator()
            L21:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L39
                java.lang.Object r1 = r0.next()
                w.f r1 = (p381w.C6765f) r1
                java.lang.Object r2 = r1.f26152h0
                android.view.View r2 = (android.view.View) r2
                int r2 = r2.getId()
                r6.put(r2, r1)
                goto L21
            L39:
                java.util.ArrayList<w.f> r0 = r13.f26243H0
                java.util.Iterator r9 = r0.iterator()
            L3f:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto Lfe
                java.lang.Object r0 = r9.next()
                r10 = r0
                w.f r10 = (p381w.C6765f) r10
                java.lang.Object r0 = r10.f26152h0
                r11 = r0
                android.view.View r11 = (android.view.View) r11
                int r0 = r11.getId()
                java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r1 = r14.f1790c
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                boolean r1 = r1.containsKey(r2)
                if (r1 == 0) goto L70
                java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r1 = r14.f1790c
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r0 = r1.get(r0)
                androidx.constraintlayout.widget.b$a r0 = (androidx.constraintlayout.widget.C0333b.a) r0
                r0.m954a(r7)
            L70:
                int r0 = r11.getId()
                androidx.constraintlayout.widget.b$a r0 = r14.m950i(r0)
                androidx.constraintlayout.widget.b$b r0 = r0.f1794d
                int r0 = r0.f1828c
                r10.m13704P(r0)
                int r0 = r11.getId()
                androidx.constraintlayout.widget.b$a r0 = r14.m950i(r0)
                androidx.constraintlayout.widget.b$b r0 = r0.f1794d
                int r0 = r0.f1830d
                r10.m13699K(r0)
                boolean r0 = r11 instanceof androidx.constraintlayout.widget.AbstractC0332a
                if (r0 == 0) goto Lc5
                r0 = r11
                androidx.constraintlayout.widget.a r0 = (androidx.constraintlayout.widget.AbstractC0332a) r0
                int r1 = r0.getId()
                java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r2 = r14.f1790c
                java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                boolean r2 = r2.containsKey(r3)
                if (r2 == 0) goto Lbb
                java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r2 = r14.f1790c
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r1 = r2.get(r1)
                androidx.constraintlayout.widget.b$a r1 = (androidx.constraintlayout.widget.C0333b.a) r1
                boolean r2 = r10 instanceof p381w.C6770k
                if (r2 == 0) goto Lbb
                r2 = r10
                w.k r2 = (p381w.C6770k) r2
                r0.mo919l(r1, r2, r7, r6)
            Lbb:
                boolean r0 = r11 instanceof androidx.constraintlayout.widget.Barrier
                if (r0 == 0) goto Lc5
                r0 = r11
                androidx.constraintlayout.widget.Barrier r0 = (androidx.constraintlayout.widget.Barrier) r0
                r0.m941n()
            Lc5:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r12.f1605g
                int r0 = r0.getLayoutDirection()
                r7.resolveLayoutDirection(r0)
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r12.f1605g
                r1 = 0
                boolean r2 = androidx.constraintlayout.motion.widget.MotionLayout.f1521x1
                r2 = r11
                r3 = r10
                r4 = r7
                r5 = r6
                r0.m922b(r1, r2, r3, r4, r5)
                int r0 = r11.getId()
                androidx.constraintlayout.widget.b$a r0 = r14.m950i(r0)
                androidx.constraintlayout.widget.b$d r0 = r0.f1792b
                int r0 = r0.f1870c
                r1 = 1
                if (r0 != r1) goto Lee
                int r0 = r11.getVisibility()
                goto Lfa
            Lee:
                int r0 = r11.getId()
                androidx.constraintlayout.widget.b$a r0 = r14.m950i(r0)
                androidx.constraintlayout.widget.b$d r0 = r0.f1792b
                int r0 = r0.f1869b
            Lfa:
                r10.f26156j0 = r0
                goto L3f
            Lfe:
                java.util.ArrayList<w.f> r13 = r13.f26243H0
                java.util.Iterator r13 = r13.iterator()
            L104:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L13b
                java.lang.Object r14 = r13.next()
                w.f r14 = (p381w.C6765f) r14
                boolean r0 = r14 instanceof p381w.C6772m
                if (r0 == 0) goto L104
                java.lang.Object r0 = r14.f26152h0
                androidx.constraintlayout.widget.a r0 = (androidx.constraintlayout.widget.AbstractC0332a) r0
                w.j r14 = (p381w.InterfaceC6769j) r14
                java.util.Objects.requireNonNull(r0)
                r14.mo13742b()
                r1 = 0
            L121:
                int r2 = r0.f1779b0
                if (r1 >= r2) goto L135
                int[] r2 = r0.f1778a0
                r2 = r2[r1]
                java.lang.Object r2 = r6.get(r2)
                w.f r2 = (p381w.C6765f) r2
                r14.mo13743c(r2)
                int r1 = r1 + 1
                goto L121
            L135:
                w.m r14 = (p381w.C6772m) r14
                r14.m13747T()
                goto L104
            L13b:
                return
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$e */
    public interface InterfaceC0322e {
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$f */
    public static class C0323f implements androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0322e {

        /* renamed from: b */
        public static androidx.constraintlayout.motion.widget.MotionLayout.C0323f f1606b;

        /* renamed from: a */
        public android.view.VelocityTracker f1607a;

        static {
                androidx.constraintlayout.motion.widget.MotionLayout$f r0 = new androidx.constraintlayout.motion.widget.MotionLayout$f
                r0.<init>()
                androidx.constraintlayout.motion.widget.MotionLayout.C0323f.f1606b = r0
                return
        }

        public C0323f() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    public class C0324g {

        /* renamed from: a */
        public float f1608a;

        /* renamed from: b */
        public float f1609b;

        /* renamed from: c */
        public int f1610c;

        /* renamed from: d */
        public int f1611d;

        /* renamed from: e */
        public final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout f1612e;

        public C0324g(androidx.constraintlayout.motion.widget.MotionLayout r1) {
                r0 = this;
                r0.f1612e = r1
                r0.<init>()
                r1 = 2143289344(0x7fc00000, float:NaN)
                r0.f1608a = r1
                r0.f1609b = r1
                r1 = -1
                r0.f1610c = r1
                r0.f1611d = r1
                return
        }

        /* renamed from: a */
        public void m895a() {
                r8 = this;
                androidx.constraintlayout.motion.widget.MotionLayout$i r0 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1614Z
                int r1 = r8.f1610c
                r2 = -1
                if (r1 != r2) goto Lb
                int r3 = r8.f1611d
                if (r3 == r2) goto Lfe
            Lb:
                if (r1 != r2) goto L16
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r8.f1612e
                int r3 = r8.f1611d
                r1.m871D(r3)
                goto Lf9
            L16:
                int r3 = r8.f1611d
                if (r3 != r2) goto Lf4
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r8.f1612e
                r3.setState(r0)
                r3.f1573v0 = r1
                r3.f1571u0 = r2
                r3.f1575w0 = r2
                y.b r4 = r3.f1698k0
                r5 = 0
                if (r4 == 0) goto Le1
                float r3 = (float) r2
                int r6 = r4.f27440b
                if (r6 != r1) goto L86
                if (r1 != r2) goto L39
                android.util.SparseArray<y.b$a> r1 = r4.f27442d
                r6 = 0
                java.lang.Object r1 = r1.valueAt(r6)
                goto L3f
            L39:
                android.util.SparseArray<y.b$a> r1 = r4.f27442d
                java.lang.Object r1 = r1.get(r6)
            L3f:
                y.b$a r1 = (p422y.C7092b.a) r1
                int r6 = r4.f27441c
                if (r6 == r2) goto L55
                java.util.ArrayList<y.b$b> r7 = r1.f27445b
                java.lang.Object r6 = r7.get(r6)
                y.b$b r6 = (p422y.C7092b.b) r6
                boolean r6 = r6.m14208a(r3, r3)
                if (r6 == 0) goto L55
                goto Lf9
            L55:
                int r3 = r1.m14207a(r3, r3)
                int r6 = r4.f27441c
                if (r6 != r3) goto L5f
                goto Lf9
            L5f:
                if (r3 != r2) goto L62
                goto L6c
            L62:
                java.util.ArrayList<y.b$b> r5 = r1.f27445b
                java.lang.Object r5 = r5.get(r3)
                y.b$b r5 = (p422y.C7092b.b) r5
                androidx.constraintlayout.widget.b r5 = r5.f27453f
            L6c:
                if (r3 != r2) goto L6f
                goto L79
            L6f:
                java.util.ArrayList<y.b$b> r1 = r1.f27445b
                java.lang.Object r1 = r1.get(r3)
                y.b$b r1 = (p422y.C7092b.b) r1
                int r1 = r1.f27452e
            L79:
                if (r5 != 0) goto L7d
                goto Lf9
            L7d:
                r4.f27441c = r3
                androidx.constraintlayout.widget.ConstraintLayout r1 = r4.f27439a
                r5.m943b(r1)
                goto Lf9
            L86:
                r4.f27440b = r1
                android.util.SparseArray<y.b$a> r5 = r4.f27442d
                java.lang.Object r5 = r5.get(r1)
                y.b$a r5 = (p422y.C7092b.a) r5
                int r6 = r5.m14207a(r3, r3)
                if (r6 != r2) goto L99
                androidx.constraintlayout.widget.b r7 = r5.f27447d
                goto La3
            L99:
                java.util.ArrayList<y.b$b> r7 = r5.f27445b
                java.lang.Object r7 = r7.get(r6)
                y.b$b r7 = (p422y.C7092b.b) r7
                androidx.constraintlayout.widget.b r7 = r7.f27453f
            La3:
                if (r6 != r2) goto La6
                goto Lb0
            La6:
                java.util.ArrayList<y.b$b> r5 = r5.f27445b
                java.lang.Object r5 = r5.get(r6)
                y.b$b r5 = (p422y.C7092b.b) r5
                int r5 = r5.f27452e
            Lb0:
                if (r7 != 0) goto Ld9
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "NO Constraint set found ! id="
                r4.append(r5)
                r4.append(r1)
                java.lang.String r1 = ", dim ="
                r4.append(r1)
                r4.append(r3)
                java.lang.String r1 = ", "
                r4.append(r1)
                r4.append(r3)
                java.lang.String r1 = r4.toString()
                java.lang.String r3 = "ConstraintLayoutStates"
                android.util.Log.v(r3, r1)
                goto Lf9
            Ld9:
                r4.f27441c = r6
                androidx.constraintlayout.widget.ConstraintLayout r1 = r4.f27439a
                r7.m943b(r1)
                goto Lf9
            Le1:
                androidx.constraintlayout.motion.widget.b r4 = r3.f1565r0
                if (r4 == 0) goto Lf9
                androidx.constraintlayout.widget.b r1 = r4.m902b(r1)
                r4 = 1
                r1.m944c(r3, r4)
                r3.setConstraintSet(r5)
                r3.requestLayout()
                goto Lf9
            Lf4:
                androidx.constraintlayout.motion.widget.MotionLayout r4 = r8.f1612e
                r4.m869B(r1, r3)
            Lf9:
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r8.f1612e
                r1.setState(r0)
            Lfe:
                float r0 = r8.f1609b
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 == 0) goto L117
                float r0 = r8.f1608a
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 == 0) goto L10f
                return
            L10f:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r8.f1612e
                float r1 = r8.f1608a
                r0.setProgress(r1)
                return
            L117:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r8.f1612e
                float r1 = r8.f1608a
                float r3 = r8.f1609b
                boolean r4 = r0.isAttachedToWindow()
                if (r4 != 0) goto L135
                androidx.constraintlayout.motion.widget.MotionLayout$g r4 = r0.f1564q1
                if (r4 != 0) goto L12e
                androidx.constraintlayout.motion.widget.MotionLayout$g r4 = new androidx.constraintlayout.motion.widget.MotionLayout$g
                r4.<init>(r0)
                r0.f1564q1 = r4
            L12e:
                androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r0.f1564q1
                r0.f1608a = r1
                r0.f1609b = r3
                goto L144
            L135:
                r0.setProgress(r1)
                androidx.constraintlayout.motion.widget.MotionLayout$i r1 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1615a0
                r0.setState(r1)
                r0.f1569t0 = r3
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.m873s(r1)
            L144:
                r0 = 2143289344(0x7fc00000, float:NaN)
                r8.f1608a = r0
                r8.f1609b = r0
                r8.f1610c = r2
                r8.f1611d = r2
                return
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$h */
    public interface InterfaceC0325h {
        /* renamed from: a */
        void mo896a(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, int r3, float r4);

        /* renamed from: b */
        void mo897b(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, int r3);

        /* renamed from: c */
        void mo898c(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, boolean r3, float r4);

        /* renamed from: d */
        void mo899d(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$i */
    public enum EnumC0326i extends java.lang.Enum<androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i> {

        /* renamed from: Y */
        public static final androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i f1613Y = null;

        /* renamed from: Z */
        public static final androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i f1614Z = null;

        /* renamed from: a0 */
        public static final androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i f1615a0 = null;

        /* renamed from: b0 */
        public static final androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i f1616b0 = null;

        /* renamed from: c0 */
        public static final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i[] f1617c0 = null;

        static {
                androidx.constraintlayout.motion.widget.MotionLayout$i r0 = new androidx.constraintlayout.motion.widget.MotionLayout$i
                java.lang.String r1 = "UNDEFINED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1613Y = r0
                androidx.constraintlayout.motion.widget.MotionLayout$i r1 = new androidx.constraintlayout.motion.widget.MotionLayout$i
                java.lang.String r3 = "SETUP"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1614Z = r1
                androidx.constraintlayout.motion.widget.MotionLayout$i r3 = new androidx.constraintlayout.motion.widget.MotionLayout$i
                java.lang.String r5 = "MOVING"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1615a0 = r3
                androidx.constraintlayout.motion.widget.MotionLayout$i r5 = new androidx.constraintlayout.motion.widget.MotionLayout$i
                java.lang.String r7 = "FINISHED"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1616b0 = r5
                r7 = 4
                androidx.constraintlayout.motion.widget.MotionLayout$i[] r7 = new androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1617c0 = r7
                return
        }

        EnumC0326i(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.motion.widget.MotionLayout$i> r0 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.motion.widget.MotionLayout$i r1 = (androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i) r1
                return r1
        }

        public static androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i[] values() {
                androidx.constraintlayout.motion.widget.MotionLayout$i[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1617c0
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.motion.widget.MotionLayout$i[] r0 = (androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i[]) r0
                return r0
        }
    }

    public MotionLayout(android.content.Context r12, android.util.AttributeSet r13) {
            r11 = this;
            r11.<init>(r12, r13)
            r12 = 0
            r11.f1569t0 = r12
            r0 = -1
            r11.f1571u0 = r0
            r11.f1573v0 = r0
            r11.f1575w0 = r0
            r1 = 0
            r11.f1577x0 = r1
            r11.f1578y0 = r1
            r2 = 1
            r11.f1579z0 = r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r11.f1522A0 = r3
            r3 = 0
            r11.f1523B0 = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r11.f1524C0 = r3
            r11.f1525D0 = r12
            r11.f1526E0 = r12
            r11.f1528G0 = r12
            r11.f1530I0 = r1
            r11.f1532K0 = r1
            r11.f1534M0 = r1
            t.g r3 = new t.g
            r3.<init>()
            r11.f1535N0 = r3
            androidx.constraintlayout.motion.widget.MotionLayout$b r3 = new androidx.constraintlayout.motion.widget.MotionLayout$b
            r3.<init>(r11)
            r11.f1536O0 = r3
            r11.f1540S0 = r1
            r11.f1545X0 = r1
            r3 = 0
            r11.f1546Y0 = r3
            r11.f1547Z0 = r3
            r11.f1548a1 = r3
            r11.f1549b1 = r1
            r4 = -1
            r11.f1550c1 = r4
            r11.f1551d1 = r12
            r11.f1552e1 = r1
            r11.f1553f1 = r12
            r11.f1554g1 = r1
            f.t r4 = new f.t
            r4.<init>(r2)
            r11.f1562o1 = r4
            r11.f1563p1 = r1
            androidx.constraintlayout.motion.widget.MotionLayout$i r4 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1613Y
            r11.f1566r1 = r4
            androidx.constraintlayout.motion.widget.MotionLayout$d r4 = new androidx.constraintlayout.motion.widget.MotionLayout$d
            r4.<init>(r11)
            r11.f1568s1 = r4
            r11.f1570t1 = r1
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r11.f1572u1 = r4
            r11.f1574v1 = r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r11.f1576w1 = r4
            boolean r4 = r11.isInEditMode()
            androidx.constraintlayout.motion.widget.MotionLayout.f1521x1 = r4
            java.lang.String r4 = "MotionLayout"
            if (r13 == 0) goto Lfa
            android.content.Context r5 = r11.getContext()
            int[] r6 = p422y.C7096f.f27467m
            android.content.res.TypedArray r13 = r5.obtainStyledAttributes(r13, r6)
            int r5 = r13.getIndexCount()
            r6 = 0
            r7 = 1
        L97:
            if (r6 >= r5) goto Lea
            int r8 = r13.getIndex(r6)
            r9 = 2
            if (r8 != r9) goto Lb0
            int r8 = r13.getResourceId(r8, r0)
            androidx.constraintlayout.motion.widget.b r9 = new androidx.constraintlayout.motion.widget.b
            android.content.Context r10 = r11.getContext()
            r9.<init>(r10, r11, r8)
            r11.f1565r0 = r9
            goto Le7
        Lb0:
            if (r8 != r2) goto Lb9
            int r8 = r13.getResourceId(r8, r0)
            r11.f1573v0 = r8
            goto Le7
        Lb9:
            r10 = 4
            if (r8 != r10) goto Lc5
            float r8 = r13.getFloat(r8, r12)
            r11.f1528G0 = r8
            r11.f1530I0 = r2
            goto Le7
        Lc5:
            if (r8 != 0) goto Lcc
            boolean r7 = r13.getBoolean(r8, r7)
            goto Le7
        Lcc:
            r10 = 5
            if (r8 != r10) goto Lde
            int r10 = r11.f1532K0
            if (r10 != 0) goto Le7
            boolean r8 = r13.getBoolean(r8, r1)
            if (r8 == 0) goto Lda
            goto Ldb
        Lda:
            r9 = 0
        Ldb:
            r11.f1532K0 = r9
            goto Le7
        Lde:
            r9 = 3
            if (r8 != r9) goto Le7
            int r8 = r13.getInt(r8, r1)
            r11.f1532K0 = r8
        Le7:
            int r6 = r6 + 1
            goto L97
        Lea:
            r13.recycle()
            androidx.constraintlayout.motion.widget.b r12 = r11.f1565r0
            if (r12 != 0) goto Lf6
            java.lang.String r12 = "WARNING NO app:layoutDescription tag"
            android.util.Log.e(r4, r12)
        Lf6:
            if (r7 != 0) goto Lfa
            r11.f1565r0 = r3
        Lfa:
            int r12 = r11.f1532K0
            if (r12 == 0) goto L347
            androidx.constraintlayout.motion.widget.b r12 = r11.f1565r0
            if (r12 != 0) goto L109
            java.lang.String r12 = "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\""
            android.util.Log.e(r4, r12)
            goto L347
        L109:
            int r12 = r12.m909i()
            androidx.constraintlayout.motion.widget.b r13 = r11.f1565r0
            int r2 = r13.m909i()
            androidx.constraintlayout.widget.b r13 = r13.m902b(r2)
            android.content.Context r2 = r11.getContext()
            java.lang.String r12 = p346u.C6256a.m12871b(r2, r12)
            int r2 = r11.getChildCount()
            r5 = 0
        L124:
            java.lang.String r6 = "CHECK: "
            if (r5 >= r2) goto L182
            android.view.View r7 = r11.getChildAt(r5)
            int r8 = r7.getId()
            if (r8 != r0) goto L14f
            java.lang.String r9 = " ALL VIEWS SHOULD HAVE ID's "
            java.lang.StringBuilder r9 = androidx.activity.result.C0196d.m449a(r6, r12, r9)
            java.lang.Class r10 = r7.getClass()
            java.lang.String r10 = r10.getName()
            r9.append(r10)
            java.lang.String r10 = " does not!"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r4, r9)
        L14f:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r9 = r13.f1790c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            boolean r9 = r9.containsKey(r10)
            if (r9 == 0) goto L168
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r9 = r13.f1790c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r9.get(r8)
            androidx.constraintlayout.widget.b$a r8 = (androidx.constraintlayout.widget.C0333b.a) r8
            goto L169
        L168:
            r8 = r3
        L169:
            if (r8 != 0) goto L17f
            java.lang.String r8 = " NO CONSTRAINTS for "
            java.lang.StringBuilder r6 = androidx.activity.result.C0196d.m449a(r6, r12, r8)
            java.lang.String r7 = p346u.C6256a.m12872c(r7)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r4, r6)
        L17f:
            int r5 = r5 + 1
            goto L124
        L182:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r2 = r13.f1790c
            java.util.Set r2 = r2.keySet()
            java.lang.Integer[] r3 = new java.lang.Integer[r1]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2
            int r3 = r2.length
            int[] r5 = new int[r3]
            r7 = 0
        L194:
            if (r7 >= r3) goto L1a1
            r8 = r2[r7]
            int r8 = r8.intValue()
            r5[r7] = r8
            int r7 = r7 + 1
            goto L194
        L1a1:
            if (r1 >= r3) goto L220
            r2 = r5[r1]
            android.content.Context r7 = r11.getContext()
            java.lang.String r7 = p346u.C6256a.m12871b(r7, r2)
            r8 = r5[r1]
            android.view.View r8 = r11.findViewById(r8)
            if (r8 != 0) goto L1cf
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r12)
            java.lang.String r9 = " NO View matches id "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r4, r8)
        L1cf:
            androidx.constraintlayout.widget.b$a r8 = r13.m950i(r2)
            androidx.constraintlayout.widget.b$b r8 = r8.f1794d
            int r8 = r8.f1830d
            java.lang.String r9 = ") no LAYOUT_HEIGHT"
            java.lang.String r10 = "("
            if (r8 != r0) goto L1f8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r12)
            r8.append(r10)
            r8.append(r7)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r4, r8)
        L1f8:
            androidx.constraintlayout.widget.b$a r2 = r13.m950i(r2)
            androidx.constraintlayout.widget.b$b r2 = r2.f1794d
            int r2 = r2.f1828c
            if (r2 != r0) goto L21d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r12)
            r2.append(r10)
            r2.append(r7)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r4, r2)
        L21d:
            int r1 = r1 + 1
            goto L1a1
        L220:
            android.util.SparseIntArray r12 = new android.util.SparseIntArray
            r12.<init>()
            android.util.SparseIntArray r13 = new android.util.SparseIntArray
            r13.<init>()
            androidx.constraintlayout.motion.widget.b r1 = r11.f1565r0
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r1 = r1.f1625d
            java.util.Iterator r1 = r1.iterator()
        L232:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L347
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.b$b r2 = (androidx.constraintlayout.motion.widget.C0328b.b) r2
            androidx.constraintlayout.motion.widget.b r3 = r11.f1565r0
            androidx.constraintlayout.motion.widget.b$b r3 = r3.f1624c
            if (r2 != r3) goto L249
            java.lang.String r3 = "CHECK: CURRENT"
            android.util.Log.v(r4, r3)
        L249:
            java.lang.String r3 = "CHECK: transition = "
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            android.content.Context r5 = r11.getContext()
            int r6 = r2.f1644d
            if (r6 != r0) goto L25a
            java.lang.String r6 = "null"
            goto L264
        L25a:
            android.content.res.Resources r6 = r5.getResources()
            int r7 = r2.f1644d
            java.lang.String r6 = r6.getResourceEntryName(r7)
        L264:
            int r7 = r2.f1643c
            if (r7 != r0) goto L26f
            java.lang.String r5 = " -> null"
            java.lang.String r5 = p064e.C1493g.m4049a(r6, r5)
            goto L286
        L26f:
            java.lang.String r7 = " -> "
            java.lang.StringBuilder r6 = android.support.v4.media.C0143b.m255a(r6, r7)
            android.content.res.Resources r5 = r5.getResources()
            int r7 = r2.f1643c
            java.lang.String r5 = r5.getResourceEntryName(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        L286:
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "CHECK: transition.setDuration = "
            r3.append(r5)
            int r5 = r2.f1648h
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r4, r3)
            int r3 = r2.f1644d
            int r5 = r2.f1643c
            if (r3 != r5) goto L2b1
            java.lang.String r3 = "CHECK: start and end constraint set should not be the same!"
            android.util.Log.e(r4, r3)
        L2b1:
            int r3 = r2.f1644d
            int r2 = r2.f1643c
            android.content.Context r5 = r11.getContext()
            java.lang.String r5 = p346u.C6256a.m12871b(r5, r3)
            android.content.Context r6 = r11.getContext()
            java.lang.String r6 = p346u.C6256a.m12871b(r6, r2)
            int r7 = r12.get(r3)
            java.lang.String r8 = "->"
            if (r7 != r2) goto L2e7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "CHECK: two transitions with the same start and end "
            r7.append(r9)
            r7.append(r5)
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            android.util.Log.e(r4, r7)
        L2e7:
            int r7 = r13.get(r2)
            if (r7 != r3) goto L307
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "CHECK: you can't have reverse transitions"
            r7.append(r9)
            r7.append(r5)
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.e(r4, r6)
        L307:
            r12.put(r3, r2)
            r13.put(r2, r3)
            androidx.constraintlayout.motion.widget.b r6 = r11.f1565r0
            androidx.constraintlayout.widget.b r3 = r6.m902b(r3)
            if (r3 != 0) goto L329
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = " no such constraintSetStart "
            r3.append(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r4, r3)
        L329:
            androidx.constraintlayout.motion.widget.b r3 = r11.f1565r0
            androidx.constraintlayout.widget.b r2 = r3.m902b(r2)
            if (r2 != 0) goto L232
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " no such constraintSetEnd "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r4, r2)
            goto L232
        L347:
            int r12 = r11.f1573v0
            if (r12 != r0) goto L365
            androidx.constraintlayout.motion.widget.b r12 = r11.f1565r0
            if (r12 == 0) goto L365
            int r12 = r12.m909i()
            r11.f1573v0 = r12
            androidx.constraintlayout.motion.widget.b r12 = r11.f1565r0
            int r12 = r12.m909i()
            r11.f1571u0 = r12
            androidx.constraintlayout.motion.widget.b r12 = r11.f1565r0
            int r12 = r12.m904d()
            r11.f1575w0 = r12
        L365:
            return
    }

    /* renamed from: A */
    public void m868A() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$d r0 = r1.f1568s1
            r0.m893e()
            r1.invalidate()
            return
    }

    /* renamed from: B */
    public void m869B(int r3, int r4) {
            r2 = this;
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto L18
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r2.f1564q1
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = new androidx.constraintlayout.motion.widget.MotionLayout$g
            r0.<init>(r2)
            r2.f1564q1 = r0
        L11:
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r2.f1564q1
            r0.f1610c = r3
            r0.f1611d = r4
            return
        L18:
            androidx.constraintlayout.motion.widget.b r0 = r2.f1565r0
            if (r0 == 0) goto L3d
            r2.f1571u0 = r3
            r2.f1575w0 = r4
            r0.m913m(r3, r4)
            androidx.constraintlayout.motion.widget.MotionLayout$d r0 = r2.f1568s1
            androidx.constraintlayout.motion.widget.b r1 = r2.f1565r0
            androidx.constraintlayout.widget.b r3 = r1.m902b(r3)
            androidx.constraintlayout.motion.widget.b r1 = r2.f1565r0
            androidx.constraintlayout.widget.b r4 = r1.m902b(r4)
            r0.m892d(r3, r4)
            r2.m868A()
            r3 = 0
            r2.f1526E0 = r3
            r2.m873s(r3)
        L3d:
            return
    }

    /* renamed from: C */
    public void m870C(int r13, float r14, float r15) {
            r12 = this;
            androidx.constraintlayout.motion.widget.b r0 = r12.f1565r0
            if (r0 != 0) goto L5
            return
        L5:
            float r0 = r12.f1526E0
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 != 0) goto Lc
            return
        Lc:
            r0 = 1
            r12.f1534M0 = r0
            long r1 = r12.getNanoTime()
            r12.f1523B0 = r1
            androidx.constraintlayout.motion.widget.b r1 = r12.f1565r0
            int r1 = r1.m903c()
            float r1 = (float) r1
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r1 / r2
            r12.f1524C0 = r7
            r12.f1528G0 = r14
            r12.f1530I0 = r0
            r1 = 2
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r13 == 0) goto Lab
            if (r13 == r0) goto Lab
            if (r13 == r1) goto Lab
            r1 = 4
            if (r13 == r1) goto L98
            r1 = 5
            if (r13 == r1) goto L39
            goto Ldc
        L39:
            float r13 = r12.f1526E0
            androidx.constraintlayout.motion.widget.b r1 = r12.f1565r0
            float r1 = r1.m908h()
            r5 = 1073741824(0x40000000, float:2.0)
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 <= 0) goto L57
            float r6 = r15 / r1
            float r7 = r15 * r6
            float r1 = r1 * r6
            float r1 = r1 * r6
            float r1 = r1 / r5
            float r7 = r7 - r1
            float r7 = r7 + r13
            int r13 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r13 <= 0) goto L67
            goto L68
        L57:
            float r3 = -r15
            float r3 = r3 / r1
            float r6 = r15 * r3
            float r1 = r1 * r3
            float r1 = r1 * r3
            float r1 = r1 / r5
            float r1 = r1 + r6
            float r1 = r1 + r13
            int r13 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r13 >= 0) goto L67
            goto L68
        L67:
            r0 = 0
        L68:
            if (r0 == 0) goto L75
            androidx.constraintlayout.motion.widget.MotionLayout$b r13 = r12.f1536O0
            float r14 = r12.f1526E0
            androidx.constraintlayout.motion.widget.b r0 = r12.f1565r0
            float r0 = r0.m908h()
            goto La2
        L75:
            t.g r5 = r12.f1535N0
            float r6 = r12.f1526E0
            float r9 = r12.f1524C0
            androidx.constraintlayout.motion.widget.b r13 = r12.f1565r0
            float r10 = r13.m908h()
            androidx.constraintlayout.motion.widget.b r13 = r12.f1565r0
            androidx.constraintlayout.motion.widget.b$b r13 = r13.f1624c
            if (r13 == 0) goto L8f
            androidx.constraintlayout.motion.widget.c r13 = r13.f1652l
            if (r13 == 0) goto L8f
            float r13 = r13.f1679p
            r11 = r13
            goto L90
        L8f:
            r11 = 0
        L90:
            r7 = r14
            r8 = r15
            r5.m12550b(r6, r7, r8, r9, r10, r11)
            r12.f1569t0 = r4
            goto Ld2
        L98:
            androidx.constraintlayout.motion.widget.MotionLayout$b r13 = r12.f1536O0
            float r14 = r12.f1526E0
            androidx.constraintlayout.motion.widget.b r0 = r12.f1565r0
            float r0 = r0.m908h()
        La2:
            r13.f1581a = r15
            r13.f1582b = r14
            r13.f1583c = r0
            androidx.constraintlayout.motion.widget.MotionLayout$b r13 = r12.f1536O0
            goto Lda
        Lab:
            if (r13 != r0) goto Laf
            r14 = 0
            goto Lb3
        Laf:
            if (r13 != r1) goto Lb3
            r14 = 1065353216(0x3f800000, float:1.0)
        Lb3:
            t.g r3 = r12.f1535N0
            float r13 = r12.f1526E0
            androidx.constraintlayout.motion.widget.b r0 = r12.f1565r0
            float r8 = r0.m908h()
            androidx.constraintlayout.motion.widget.b r0 = r12.f1565r0
            androidx.constraintlayout.motion.widget.b$b r0 = r0.f1624c
            if (r0 == 0) goto Lcb
            androidx.constraintlayout.motion.widget.c r0 = r0.f1652l
            if (r0 == 0) goto Lcb
            float r0 = r0.f1679p
            r9 = r0
            goto Lcc
        Lcb:
            r9 = 0
        Lcc:
            r4 = r13
            r5 = r14
            r6 = r15
            r3.m12550b(r4, r5, r6, r7, r8, r9)
        Ld2:
            int r13 = r12.f1573v0
            r12.f1528G0 = r14
            r12.f1573v0 = r13
            t.g r13 = r12.f1535N0
        Lda:
            r12.f1567s0 = r13
        Ldc:
            r12.f1529H0 = r2
            long r13 = r12.getNanoTime()
            r12.f1523B0 = r13
            r12.invalidate()
            return
    }

    /* renamed from: D */
    public void m871D(int r14) {
            r13 = this;
            boolean r0 = r13.isAttachedToWindow()
            if (r0 != 0) goto L16
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r13.f1564q1
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = new androidx.constraintlayout.motion.widget.MotionLayout$g
            r0.<init>(r13)
            r13.f1564q1 = r0
        L11:
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r13.f1564q1
            r0.f1611d = r14
            return
        L16:
            androidx.constraintlayout.motion.widget.b r0 = r13.f1565r0
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L7e
            y.g r0 = r0.f1623b
            if (r0 == 0) goto L7e
            int r3 = r13.f1573v0
            float r4 = (float) r2
            android.util.SparseArray<y.g$a> r0 = r0.f27478b
            java.lang.Object r0 = r0.get(r14)
            y.g$a r0 = (p422y.C7097g.a) r0
            if (r0 != 0) goto L2f
            r3 = r14
            goto L7b
        L2f:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L5d
            if (r5 != 0) goto L38
            goto L5d
        L38:
            java.util.ArrayList<y.g$b> r5 = r0.f27480b
            java.util.Iterator r5 = r5.iterator()
            r6 = r1
        L3f:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L58
            java.lang.Object r7 = r5.next()
            y.g$b r7 = (p422y.C7097g.b) r7
            boolean r8 = r7.m14216a(r4, r4)
            if (r8 == 0) goto L3f
            int r6 = r7.f27486e
            if (r3 != r6) goto L56
            goto L7b
        L56:
            r6 = r7
            goto L3f
        L58:
            if (r6 == 0) goto L79
            int r3 = r6.f27486e
            goto L7b
        L5d:
            int r4 = r0.f27481c
            if (r4 != r3) goto L62
            goto L7b
        L62:
            java.util.ArrayList<y.g$b> r4 = r0.f27480b
            java.util.Iterator r4 = r4.iterator()
        L68:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L79
            java.lang.Object r5 = r4.next()
            y.g$b r5 = (p422y.C7097g.b) r5
            int r5 = r5.f27486e
            if (r3 != r5) goto L68
            goto L7b
        L79:
            int r3 = r0.f27481c
        L7b:
            if (r3 == r2) goto L7e
            r14 = r3
        L7e:
            int r0 = r13.f1573v0
            if (r0 != r14) goto L84
            goto L239
        L84:
            int r3 = r13.f1571u0
            r4 = 0
            if (r3 != r14) goto L8e
            r13.m873s(r4)
            goto L239
        L8e:
            int r3 = r13.f1575w0
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 != r14) goto L99
            r13.m873s(r5)
            goto L239
        L99:
            r13.f1575w0 = r14
            if (r0 == r2) goto Laa
            r13.m869B(r0, r14)
            r13.m873s(r5)
            r13.f1526E0 = r4
            r13.m873s(r5)
            goto L239
        Laa:
            r0 = 0
            r13.f1534M0 = r0
            r13.f1528G0 = r5
            r13.f1525D0 = r4
            r13.f1526E0 = r4
            long r6 = r13.getNanoTime()
            r13.f1527F0 = r6
            long r6 = r13.getNanoTime()
            r13.f1523B0 = r6
            r13.f1529H0 = r0
            r13.f1567s0 = r1
            androidx.constraintlayout.motion.widget.b r3 = r13.f1565r0
            int r3 = r3.m903c()
            float r3 = (float) r3
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r6
            r13.f1524C0 = r3
            r13.f1571u0 = r2
            androidx.constraintlayout.motion.widget.b r3 = r13.f1565r0
            int r6 = r13.f1575w0
            r3.m913m(r2, r6)
            androidx.constraintlayout.motion.widget.b r2 = r13.f1565r0
            r2.m909i()
            int r2 = r13.getChildCount()
            java.util.HashMap<android.view.View, u.o> r3 = r13.f1522A0
            r3.clear()
            r3 = 0
        Le7:
            if (r3 >= r2) goto Lfa
            android.view.View r6 = r13.getChildAt(r3)
            u.o r7 = new u.o
            r7.<init>(r6)
            java.util.HashMap<android.view.View, u.o> r8 = r13.f1522A0
            r8.put(r6, r7)
            int r3 = r3 + 1
            goto Le7
        Lfa:
            r3 = 1
            r13.f1530I0 = r3
            androidx.constraintlayout.motion.widget.MotionLayout$d r6 = r13.f1568s1
            androidx.constraintlayout.motion.widget.b r7 = r13.f1565r0
            androidx.constraintlayout.widget.b r14 = r7.m902b(r14)
            r6.m892d(r1, r14)
            r13.m868A()
            androidx.constraintlayout.motion.widget.MotionLayout$d r14 = r13.f1568s1
            r14.m889a()
            int r14 = r13.getChildCount()
            r1 = 0
        L115:
            if (r1 >= r14) goto L1ad
            android.view.View r6 = r13.getChildAt(r1)
            java.util.HashMap<android.view.View, u.o> r7 = r13.f1522A0
            java.lang.Object r7 = r7.get(r6)
            u.o r7 = (p346u.C6270o) r7
            if (r7 != 0) goto L127
            goto L1a9
        L127:
            u.q r8 = r7.f24371d
            r8.f24397a0 = r4
            r8.f24398b0 = r4
            float r9 = r6.getX()
            float r10 = r6.getY()
            int r11 = r6.getWidth()
            float r11 = (float) r11
            int r12 = r6.getHeight()
            float r12 = (float) r12
            r8.m12897k(r9, r10, r11, r12)
            u.l r7 = r7.f24373f
            java.util.Objects.requireNonNull(r7)
            r6.getX()
            r6.getY()
            r6.getWidth()
            r6.getHeight()
            int r8 = r6.getVisibility()
            r7.f24353a0 = r8
            int r8 = r6.getVisibility()
            if (r8 == 0) goto L161
            r8 = 0
            goto L165
        L161:
            float r8 = r6.getAlpha()
        L165:
            r7.f24351Y = r8
            float r8 = r6.getElevation()
            r7.f24354b0 = r8
            float r8 = r6.getRotation()
            r7.f24355c0 = r8
            float r8 = r6.getRotationX()
            r7.f24356d0 = r8
            float r8 = r6.getRotationY()
            r7.f24357e0 = r8
            float r8 = r6.getScaleX()
            r7.f24358f0 = r8
            float r8 = r6.getScaleY()
            r7.f24359g0 = r8
            float r8 = r6.getPivotX()
            r7.f24360h0 = r8
            float r8 = r6.getPivotY()
            r7.f24361i0 = r8
            float r8 = r6.getTranslationX()
            r7.f24362j0 = r8
            float r8 = r6.getTranslationY()
            r7.f24363k0 = r8
            float r6 = r6.getTranslationZ()
            r7.f24364l0 = r6
        L1a9:
            int r1 = r1 + 1
            goto L115
        L1ad:
            int r14 = r13.getWidth()
            int r1 = r13.getHeight()
            r6 = 0
        L1b6:
            if (r6 >= r2) goto L1d3
            java.util.HashMap<android.view.View, u.o> r7 = r13.f1522A0
            android.view.View r8 = r13.getChildAt(r6)
            java.lang.Object r7 = r7.get(r8)
            u.o r7 = (p346u.C6270o) r7
            androidx.constraintlayout.motion.widget.b r8 = r13.f1565r0
            r8.m907g(r7)
            long r8 = r13.getNanoTime()
            r7.m12893e(r14, r1, r8)
            int r6 = r6 + 1
            goto L1b6
        L1d3:
            androidx.constraintlayout.motion.widget.b r14 = r13.f1565r0
            androidx.constraintlayout.motion.widget.b$b r14 = r14.f1624c
            if (r14 == 0) goto L1dc
            float r14 = r14.f1649i
            goto L1dd
        L1dc:
            r14 = 0
        L1dd:
            int r1 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r1 == 0) goto L230
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r7 = 0
        L1e8:
            if (r7 >= r2) goto L208
            java.util.HashMap<android.view.View, u.o> r8 = r13.f1522A0
            android.view.View r9 = r13.getChildAt(r7)
            java.lang.Object r8 = r8.get(r9)
            u.o r8 = (p346u.C6270o) r8
            u.q r8 = r8.f24372e
            float r9 = r8.f24399c0
            float r8 = r8.f24400d0
            float r8 = r8 + r9
            float r1 = java.lang.Math.min(r1, r8)
            float r6 = java.lang.Math.max(r6, r8)
            int r7 = r7 + 1
            goto L1e8
        L208:
            if (r0 >= r2) goto L230
            java.util.HashMap<android.view.View, u.o> r7 = r13.f1522A0
            android.view.View r8 = r13.getChildAt(r0)
            java.lang.Object r7 = r7.get(r8)
            u.o r7 = (p346u.C6270o) r7
            u.q r8 = r7.f24372e
            float r9 = r8.f24399c0
            float r8 = r8.f24400d0
            float r10 = r5 - r14
            float r10 = r5 / r10
            r7.f24379l = r10
            float r9 = r9 + r8
            float r9 = r9 - r1
            float r9 = r9 * r14
            float r8 = r6 - r1
            float r9 = r9 / r8
            float r8 = r14 - r9
            r7.f24378k = r8
            int r0 = r0 + 1
            goto L208
        L230:
            r13.f1525D0 = r4
            r13.f1526E0 = r4
            r13.f1530I0 = r3
            r13.invalidate()
        L239:
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: c */
    public void mo554c(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas r28) {
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = 0
            r0.m874t(r2)
            super.dispatchDraw(r28)
            androidx.constraintlayout.motion.widget.b r3 = r0.f1565r0
            if (r3 != 0) goto L10
            return
        L10:
            int r3 = r0.f1532K0
            r4 = 1
            r3 = r3 & r4
            r5 = 1093664768(0x41300000, float:11.0)
            r6 = 1092616192(0x41200000, float:10.0)
            if (r3 != r4) goto Ld3
            boolean r3 = r27.isInEditMode()
            if (r3 != 0) goto Ld3
            int r3 = r0.f1549b1
            int r3 = r3 + r4
            r0.f1549b1 = r3
            long r7 = r27.getNanoTime()
            long r9 = r0.f1550c1
            r11 = -1
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L4f
            long r9 = r7 - r9
            r11 = 200000000(0xbebc200, double:9.8813129E-316)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 <= 0) goto L51
            int r3 = r0.f1549b1
            float r3 = (float) r3
            float r9 = (float) r9
            r10 = 814313567(0x3089705f, float:1.0E-9)
            float r9 = r9 * r10
            float r3 = r3 / r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r9
            int r3 = (int) r3
            float r3 = (float) r3
            float r3 = r3 / r9
            r0.f1551d1 = r3
            r0.f1549b1 = r2
        L4f:
            r0.f1550c1 = r7
        L51:
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r7 = 1109917696(0x42280000, float:42.0)
            r3.setTextSize(r7)
            float r7 = r27.getProgress()
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 * r8
            int r7 = (int) r7
            float r7 = (float) r7
            float r7 = r7 / r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            float r9 = r0.f1551d1
            r8.append(r9)
            java.lang.String r9 = " fps "
            r8.append(r9)
            int r9 = r0.f1571u0
            java.lang.String r9 = p346u.C6256a.m12873d(r0, r9)
            r8.append(r9)
            java.lang.String r9 = " -> "
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r8 = android.support.v4.media.C0144c.m256a(r8)
            int r9 = r0.f1575w0
            java.lang.String r9 = p346u.C6256a.m12873d(r0, r9)
            r8.append(r9)
            java.lang.String r9 = " (progress: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = " ) state="
            r8.append(r7)
            int r7 = r0.f1573v0
            r9 = -1
            if (r7 != r9) goto La9
            java.lang.String r7 = "undefined"
            goto Lad
        La9:
            java.lang.String r7 = p346u.C6256a.m12873d(r0, r7)
        Lad:
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r8)
            int r8 = r27.getHeight()
            int r8 = r8 + (-29)
            float r8 = (float) r8
            r1.drawText(r7, r5, r8, r3)
            r8 = -7864184(0xffffffffff880088, float:NaN)
            r3.setColor(r8)
            int r8 = r27.getHeight()
            int r8 = r8 + (-30)
            float r8 = (float) r8
            r1.drawText(r7, r6, r8, r3)
        Ld3:
            int r3 = r0.f1532K0
            if (r3 <= r4) goto L479
            androidx.constraintlayout.motion.widget.MotionLayout$c r3 = r0.f1533L0
            if (r3 != 0) goto Le2
            androidx.constraintlayout.motion.widget.MotionLayout$c r3 = new androidx.constraintlayout.motion.widget.MotionLayout$c
            r3.<init>(r0)
            r0.f1533L0 = r3
        Le2:
            androidx.constraintlayout.motion.widget.MotionLayout$c r3 = r0.f1533L0
            java.util.HashMap<android.view.View, u.o> r4 = r0.f1522A0
            androidx.constraintlayout.motion.widget.b r7 = r0.f1565r0
            int r7 = r7.m903c()
            int r8 = r0.f1532K0
            java.util.Objects.requireNonNull(r3)
            if (r4 == 0) goto L479
            int r9 = r4.size()
            if (r9 != 0) goto Lfb
            goto L479
        Lfb:
            r28.save()
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r3.f1598n
            boolean r9 = r9.isInEditMode()
            r10 = 2
            if (r9 != 0) goto L153
            r9 = r8 & 1
            if (r9 != r10) goto L153
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f1598n
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.f1598n
            int r11 = r11.f1575w0
            java.lang.String r10 = r10.getResourceName(r11)
            r9.append(r10)
            java.lang.String r10 = ":"
            r9.append(r10)
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f1598n
            float r10 = r10.getProgress()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f1598n
            int r10 = r10.getHeight()
            int r10 = r10 + (-30)
            float r10 = (float) r10
            android.graphics.Paint r11 = r3.f1592h
            r1.drawText(r9, r6, r10, r11)
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f1598n
            int r6 = r6.getHeight()
            int r6 = r6 + (-29)
            float r6 = (float) r6
            android.graphics.Paint r10 = r3.f1589e
            r1.drawText(r9, r5, r6, r10)
        L153:
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = r1
            r6 = r5
        L15d:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L476
            java.lang.Object r9 = r4.next()
            u.o r9 = (p346u.C6270o) r9
            u.q r10 = r9.f24371d
            int r10 = r10.f24396Z
            java.util.ArrayList<u.q> r11 = r9.f24386s
            java.util.Iterator r11 = r11.iterator()
        L173:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L186
            java.lang.Object r12 = r11.next()
            u.q r12 = (p346u.C6272q) r12
            int r12 = r12.f24396Z
            int r10 = java.lang.Math.max(r10, r12)
            goto L173
        L186:
            u.q r11 = r9.f24372e
            int r11 = r11.f24396Z
            int r10 = java.lang.Math.max(r10, r11)
            if (r8 <= 0) goto L193
            if (r10 != 0) goto L193
            r10 = 1
        L193:
            if (r10 != 0) goto L196
            goto L15d
        L196:
            float[] r11 = r3.f1587c
            int[] r12 = r3.f1586b
            if (r11 == 0) goto L1ee
            t.b[] r13 = r9.f24375h
            r13 = r13[r2]
            double[] r13 = r13.mo12535f()
            if (r12 == 0) goto L1c6
            java.util.ArrayList<u.q> r14 = r9.f24386s
            java.util.Iterator r14 = r14.iterator()
            r15 = 0
        L1ad:
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L1c6
            java.lang.Object r16 = r14.next()
            r0 = r16
            u.q r0 = (p346u.C6272q) r0
            int r16 = r15 + 1
            int r0 = r0.f24406j0
            r12[r15] = r0
            r0 = r27
            r15 = r16
            goto L1ad
        L1c6:
            r0 = 0
            r12 = 0
        L1c8:
            int r14 = r13.length
            if (r0 >= r14) goto L1e9
            t.b[] r14 = r9.f24375h
            r2 = r14[r2]
            r14 = r13[r0]
            r16 = r4
            double[] r4 = r9.f24381n
            r2.mo12532c(r14, r4)
            u.q r2 = r9.f24371d
            int[] r4 = r9.f24380m
            double[] r14 = r9.f24381n
            r2.m12896h(r4, r14, r11, r12)
            int r12 = r12 + 2
            int r0 = r0 + 1
            r2 = 0
            r4 = r16
            goto L1c8
        L1e9:
            r16 = r4
            int r12 = r12 / 2
            goto L1f1
        L1ee:
            r16 = r4
            r12 = 0
        L1f1:
            r3.f1595k = r12
            r0 = 1
            if (r10 < r0) goto L467
            int r0 = r7 / 16
            float[] r2 = r3.f1585a
            if (r2 == 0) goto L201
            int r2 = r2.length
            int r4 = r0 * 2
            if (r2 == r4) goto L20e
        L201:
            int r2 = r0 * 2
            float[] r2 = new float[r2]
            r3.f1585a = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r3.f1588d = r2
        L20e:
            int r2 = r3.f1597m
            float r2 = (float) r2
            r5.translate(r2, r2)
            android.graphics.Paint r2 = r3.f1589e
            r4 = 1996488704(0x77000000, float:2.5961484E33)
            r2.setColor(r4)
            android.graphics.Paint r2 = r3.f1593i
            r2.setColor(r4)
            android.graphics.Paint r2 = r3.f1590f
            r2.setColor(r4)
            android.graphics.Paint r2 = r3.f1591g
            r2.setColor(r4)
            float[] r2 = r3.f1585a
            int r4 = r0 + (-1)
            float r4 = (float) r4
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 / r4
            java.util.HashMap<java.lang.String, u.r> r4 = r9.f24390w
            java.lang.String r11 = "translationX"
            if (r4 != 0) goto L23a
            r4 = 0
            goto L240
        L23a:
            java.lang.Object r4 = r4.get(r11)
            u.r r4 = (p346u.AbstractC6273r) r4
        L240:
            java.util.HashMap<java.lang.String, u.r> r12 = r9.f24390w
            java.lang.String r13 = "translationY"
            if (r12 != 0) goto L248
            r12 = 0
            goto L24e
        L248:
            java.lang.Object r12 = r12.get(r13)
            u.r r12 = (p346u.AbstractC6273r) r12
        L24e:
            java.util.HashMap<java.lang.String, u.f> r14 = r9.f24391x
            if (r14 != 0) goto L254
            r11 = 0
            goto L25a
        L254:
            java.lang.Object r11 = r14.get(r11)
            u.f r11 = (p346u.AbstractC6261f) r11
        L25a:
            java.util.HashMap<java.lang.String, u.f> r14 = r9.f24391x
            if (r14 != 0) goto L260
            r13 = 0
            goto L266
        L260:
            java.lang.Object r13 = r14.get(r13)
            u.f r13 = (p346u.AbstractC6261f) r13
        L266:
            r14 = 0
        L267:
            r17 = 0
            if (r14 >= r0) goto L357
            float r15 = (float) r14
            float r15 = r15 * r5
            r19 = r0
            float r0 = r9.f24379l
            r20 = 1065353216(0x3f800000, float:1.0)
            int r20 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r20 == 0) goto L294
            r20 = r5
            float r5 = r9.f24378k
            int r21 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r21 >= 0) goto L281
            r15 = 0
        L281:
            int r21 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r21 <= 0) goto L296
            r21 = r7
            r22 = r8
            double r7 = (double) r15
            r23 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r25 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r25 >= 0) goto L29a
            float r15 = r15 - r5
            float r15 = r15 * r0
            goto L29a
        L294:
            r20 = r5
        L296:
            r21 = r7
            r22 = r8
        L29a:
            double r7 = (double) r15
            u.q r0 = r9.f24371d
            t.c r0 = r0.f24395Y
            java.util.ArrayList<u.q> r5 = r9.f24386s
            java.util.Iterator r5 = r5.iterator()
            r18 = 2143289344(0x7fc00000, float:NaN)
        L2a7:
            boolean r23 = r5.hasNext()
            if (r23 == 0) goto L2d6
            java.lang.Object r23 = r5.next()
            r24 = r5
            r5 = r23
            u.q r5 = (p346u.C6272q) r5
            r25 = r7
            t.c r7 = r5.f24395Y
            if (r7 == 0) goto L2d1
            float r8 = r5.f24397a0
            int r23 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r23 >= 0) goto L2c7
            r0 = r7
            r17 = r8
            goto L2d1
        L2c7:
            boolean r7 = java.lang.Float.isNaN(r18)
            if (r7 == 0) goto L2d1
            float r5 = r5.f24397a0
            r18 = r5
        L2d1:
            r5 = r24
            r7 = r25
            goto L2a7
        L2d6:
            r25 = r7
            if (r0 == 0) goto L2f4
            boolean r5 = java.lang.Float.isNaN(r18)
            if (r5 == 0) goto L2e2
            r18 = 1065353216(0x3f800000, float:1.0)
        L2e2:
            float r5 = r15 - r17
            float r18 = r18 - r17
            float r5 = r5 / r18
            double r7 = (double) r5
            double r7 = r0.mo12543a(r7)
            float r0 = (float) r7
            float r0 = r0 * r18
            float r0 = r0 + r17
            double r7 = (double) r0
            goto L2f6
        L2f4:
            r7 = r25
        L2f6:
            t.b[] r0 = r9.f24375h
            r5 = 0
            r0 = r0[r5]
            double[] r5 = r9.f24381n
            r0.mo12532c(r7, r5)
            t.b r0 = r9.f24376i
            if (r0 == 0) goto L30c
            double[] r5 = r9.f24381n
            int r1 = r5.length
            if (r1 <= 0) goto L30c
            r0.mo12532c(r7, r5)
        L30c:
            u.q r0 = r9.f24371d
            int[] r1 = r9.f24380m
            double[] r5 = r9.f24381n
            int r7 = r14 * 2
            r0.m12896h(r1, r5, r2, r7)
            if (r11 == 0) goto L323
            r0 = r2[r7]
            float r1 = r11.m12878a(r15)
            float r1 = r1 + r0
            r2[r7] = r1
            goto L32e
        L323:
            if (r4 == 0) goto L32e
            r0 = r2[r7]
            float r1 = r4.m12899a(r15)
            float r1 = r1 + r0
            r2[r7] = r1
        L32e:
            if (r13 == 0) goto L33c
            int r7 = r7 + 1
            r0 = r2[r7]
            float r1 = r13.m12878a(r15)
            float r1 = r1 + r0
            r2[r7] = r1
            goto L349
        L33c:
            if (r12 == 0) goto L349
            int r7 = r7 + 1
            r0 = r2[r7]
            float r1 = r12.m12899a(r15)
            float r1 = r1 + r0
            r2[r7] = r1
        L349:
            int r14 = r14 + 1
            r1 = r28
            r0 = r19
            r5 = r20
            r7 = r21
            r8 = r22
            goto L267
        L357:
            r21 = r7
            r22 = r8
            int r0 = r3.f1595k
            r3.m882a(r6, r10, r0, r9)
            android.graphics.Paint r0 = r3.f1589e
            r1 = -21965(0xffffffffffffaa33, float:NaN)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.f1590f
            r1 = -2067046(0xffffffffffe0759a, float:NaN)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.f1593i
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.f1591g
            r1 = -13391360(0xffffffffff33aa00, float:-2.388145E38)
            r0.setColor(r1)
            int r0 = r3.f1597m
            int r0 = -r0
            float r0 = (float) r0
            r6.translate(r0, r0)
            int r0 = r3.f1595k
            r3.m882a(r6, r10, r0, r9)
            r0 = 5
            if (r10 != r0) goto L463
            android.graphics.Path r0 = r3.f1588d
            r0.reset()
            r0 = 0
        L391:
            r1 = 50
            if (r0 > r1) goto L439
            float r2 = (float) r0
            float r1 = (float) r1
            float r2 = r2 / r1
            float[] r1 = r3.f1594j
            r4 = 0
            float r2 = r9.m12889a(r2, r4)
            t.b[] r4 = r9.f24375h
            r5 = 0
            r4 = r4[r5]
            double r5 = (double) r2
            double[] r2 = r9.f24381n
            r4.mo12532c(r5, r2)
            u.q r2 = r9.f24371d
            int[] r4 = r9.f24380m
            double[] r5 = r9.f24381n
            float r6 = r2.f24399c0
            float r7 = r2.f24400d0
            float r8 = r2.f24401e0
            float r2 = r2.f24402f0
            r10 = 0
        L3b9:
            int r11 = r4.length
            r12 = 3
            r13 = 4
            if (r10 >= r11) goto L3d8
            r14 = r5[r10]
            float r11 = (float) r14
            r14 = r4[r10]
            r15 = 1
            if (r14 == r15) goto L3d4
            r15 = 2
            if (r14 == r15) goto L3d2
            if (r14 == r12) goto L3d0
            if (r14 == r13) goto L3ce
            goto L3d5
        L3ce:
            r2 = r11
            goto L3d5
        L3d0:
            r8 = r11
            goto L3d5
        L3d2:
            r7 = r11
            goto L3d5
        L3d4:
            r6 = r11
        L3d5:
            int r10 = r10 + 1
            goto L3b9
        L3d8:
            float r8 = r8 + r6
            float r2 = r2 + r7
            r4 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float.isNaN(r4)
            java.lang.Float.isNaN(r4)
            float r6 = r6 + r17
            float r7 = r7 + r17
            float r8 = r8 + r17
            float r2 = r2 + r17
            r5 = 0
            r1[r5] = r6
            r5 = 1
            r1[r5] = r7
            r5 = 2
            r1[r5] = r8
            r1[r12] = r7
            r1[r13] = r8
            r5 = 5
            r1[r5] = r2
            r5 = 6
            r1[r5] = r6
            r6 = 7
            r1[r6] = r2
            android.graphics.Path r1 = r3.f1588d
            float[] r2 = r3.f1594j
            r7 = 0
            r7 = r2[r7]
            r8 = 1
            r2 = r2[r8]
            r1.moveTo(r7, r2)
            android.graphics.Path r1 = r3.f1588d
            float[] r2 = r3.f1594j
            r7 = 2
            r7 = r2[r7]
            r2 = r2[r12]
            r1.lineTo(r7, r2)
            android.graphics.Path r1 = r3.f1588d
            float[] r2 = r3.f1594j
            r7 = r2[r13]
            r8 = 5
            r2 = r2[r8]
            r1.lineTo(r7, r2)
            android.graphics.Path r1 = r3.f1588d
            float[] r2 = r3.f1594j
            r5 = r2[r5]
            r2 = r2[r6]
            r1.lineTo(r5, r2)
            android.graphics.Path r1 = r3.f1588d
            r1.close()
            int r0 = r0 + 1
            goto L391
        L439:
            android.graphics.Paint r0 = r3.f1589e
            r1 = 1140850688(0x44000000, float:512.0)
            r0.setColor(r1)
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r28
            r1.translate(r0, r0)
            android.graphics.Path r0 = r3.f1588d
            android.graphics.Paint r2 = r3.f1589e
            r1.drawPath(r0, r2)
            r0 = -1073741824(0xffffffffc0000000, float:-2.0)
            r1.translate(r0, r0)
            android.graphics.Paint r0 = r3.f1589e
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r0.setColor(r2)
            android.graphics.Path r0 = r3.f1588d
            android.graphics.Paint r2 = r3.f1589e
            r1.drawPath(r0, r2)
            r6 = r1
            goto L465
        L463:
            r1 = r28
        L465:
            r5 = r6
            goto L46b
        L467:
            r21 = r7
            r22 = r8
        L46b:
            r2 = 0
            r0 = r27
            r4 = r16
            r7 = r21
            r8 = r22
            goto L15d
        L476:
            r28.restore()
        L479:
            return
    }

    public int[] getConstraintSetIds() {
            r5 = this;
            androidx.constraintlayout.motion.widget.b r0 = r5.f1565r0
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.util.SparseArray<androidx.constraintlayout.widget.b> r1 = r0.f1628g
            int r1 = r1.size()
            int[] r2 = new int[r1]
            r3 = 0
        Lf:
            if (r3 >= r1) goto L1c
            android.util.SparseArray<androidx.constraintlayout.widget.b> r4 = r0.f1628g
            int r4 = r4.keyAt(r3)
            r2[r3] = r4
            int r3 = r3 + 1
            goto Lf
        L1c:
            return r2
    }

    public int getCurrentState() {
            r1 = this;
            int r0 = r1.f1573v0
            return r0
    }

    public java.util.ArrayList<androidx.constraintlayout.motion.widget.C0328b.b> getDefinedTransitions() {
            r1 = this;
            androidx.constraintlayout.motion.widget.b r0 = r1.f1565r0
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r0 = r0.f1625d
            return r0
    }

    public p346u.C6257b getDesignTool() {
            r1 = this;
            u.b r0 = r1.f1537P0
            if (r0 != 0) goto Lb
            u.b r0 = new u.b
            r0.<init>(r1)
            r1.f1537P0 = r0
        Lb:
            u.b r0 = r1.f1537P0
            return r0
    }

    public int getEndState() {
            r1 = this;
            int r0 = r1.f1575w0
            return r0
    }

    public long getNanoTime() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            return r0
    }

    public float getProgress() {
            r1 = this;
            float r0 = r1.f1526E0
            return r0
    }

    public int getStartState() {
            r1 = this;
            int r0 = r1.f1571u0
            return r0
    }

    public float getTargetPosition() {
            r1 = this;
            float r0 = r1.f1528G0
            return r0
    }

    public android.os.Bundle getTransitionState() {
            r4 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r4.f1564q1
            if (r0 != 0) goto Lb
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = new androidx.constraintlayout.motion.widget.MotionLayout$g
            r0.<init>(r4)
            r4.f1564q1 = r0
        Lb:
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r4.f1564q1
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f1612e
            int r2 = r1.f1575w0
            r0.f1611d = r2
            int r2 = r1.f1571u0
            r0.f1610c = r2
            float r1 = r1.getVelocity()
            r0.f1609b = r1
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f1612e
            float r1 = r1.getProgress()
            r0.f1608a = r1
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r4.f1564q1
            java.util.Objects.requireNonNull(r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            float r2 = r0.f1608a
            java.lang.String r3 = "motion.progress"
            r1.putFloat(r3, r2)
            float r2 = r0.f1609b
            java.lang.String r3 = "motion.velocity"
            r1.putFloat(r3, r2)
            int r2 = r0.f1610c
            java.lang.String r3 = "motion.StartState"
            r1.putInt(r3, r2)
            int r0 = r0.f1611d
            java.lang.String r2 = "motion.EndState"
            r1.putInt(r2, r0)
            return r1
    }

    public long getTransitionTimeMs() {
            r2 = this;
            androidx.constraintlayout.motion.widget.b r0 = r2.f1565r0
            r1 = 1148846080(0x447a0000, float:1000.0)
            if (r0 == 0) goto Le
            int r0 = r0.m903c()
            float r0 = (float) r0
            float r0 = r0 / r1
            r2.f1524C0 = r0
        Le:
            float r0 = r2.f1524C0
            float r0 = r0 * r1
            long r0 = (long) r0
            return r0
    }

    public float getVelocity() {
            r1 = this;
            float r0 = r1.f1569t0
            return r0
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: i */
    public void mo560i(android.view.View r10, int r11) {
            r9 = this;
            androidx.constraintlayout.motion.widget.b r10 = r9.f1565r0
            if (r10 != 0) goto L5
            return
        L5:
            float r11 = r9.f1541T0
            float r0 = r9.f1544W0
            float r11 = r11 / r0
            float r1 = r9.f1542U0
            float r1 = r1 / r0
            androidx.constraintlayout.motion.widget.b$b r10 = r10.f1624c
            if (r10 == 0) goto L78
            androidx.constraintlayout.motion.widget.c r10 = r10.f1652l
            if (r10 == 0) goto L78
            r0 = 0
            r10.f1674k = r0
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r10.f1678o
            float r2 = r2.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r10.f1678o
            int r4 = r10.f1667d
            float r6 = r10.f1671h
            float r7 = r10.f1670g
            float[] r8 = r10.f1675l
            r5 = r2
            r3.m877w(r4, r5, r6, r7, r8)
            float r3 = r10.f1672i
            float[] r4 = r10.f1675l
            r5 = r4[r0]
            float r5 = r10.f1673j
            r6 = 1
            r7 = r4[r6]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 == 0) goto L42
            float r11 = r11 * r3
            r1 = r4[r0]
            float r11 = r11 / r1
            goto L48
        L42:
            float r1 = r1 * r5
            r11 = r4[r6]
            float r11 = r1 / r11
        L48:
            boolean r1 = java.lang.Float.isNaN(r11)
            if (r1 != 0) goto L53
            r1 = 1077936128(0x40400000, float:3.0)
            float r1 = r11 / r1
            float r2 = r2 + r1
        L53:
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 == 0) goto L78
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 == 0) goto L5f
            r3 = 1
            goto L60
        L5f:
            r3 = 0
        L60:
            int r4 = r10.f1666c
            r5 = 3
            if (r4 == r5) goto L66
            r0 = 1
        L66:
            r0 = r0 & r3
            if (r0 == 0) goto L78
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r10.f1678o
            double r2 = (double) r2
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L73
            goto L75
        L73:
            r7 = 1065353216(0x3f800000, float:1.0)
        L75:
            r10.m870C(r4, r7, r11)
        L78:
            return
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
            r1 = this;
            boolean r0 = super.isAttachedToWindow()
            return r0
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: j */
    public void mo561j(android.view.View r19, int r20, int r21, int[] r22, int r23) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            androidx.constraintlayout.motion.widget.b r4 = r0.f1565r0
            if (r4 == 0) goto L17c
            androidx.constraintlayout.motion.widget.b$b r4 = r4.f1624c
            if (r4 != 0) goto L12
            goto L17c
        L12:
            boolean r5 = r4.f1655o
            r6 = 1
            r5 = r5 ^ r6
            if (r5 != 0) goto L19
            return
        L19:
            r7 = -1
            if (r5 == 0) goto L2b
            androidx.constraintlayout.motion.widget.c r5 = r4.f1652l
            if (r5 == 0) goto L2b
            int r5 = r5.f1668e
            if (r5 == r7) goto L2b
            int r8 = r19.getId()
            if (r8 == r5) goto L2b
            return
        L2b:
            androidx.constraintlayout.motion.widget.b r5 = r0.f1565r0
            r8 = 0
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L52
            androidx.constraintlayout.motion.widget.b$b r5 = r5.f1624c
            if (r5 == 0) goto L3e
            androidx.constraintlayout.motion.widget.c r5 = r5.f1652l
            if (r5 == 0) goto L3e
            boolean r5 = r5.f1681r
            goto L3f
        L3e:
            r5 = 0
        L3f:
            if (r5 == 0) goto L52
            float r5 = r0.f1525D0
            int r11 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r11 == 0) goto L4b
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto L52
        L4b:
            boolean r5 = r1.canScrollVertically(r7)
            if (r5 == 0) goto L52
            return
        L52:
            androidx.constraintlayout.motion.widget.c r4 = r4.f1652l
            if (r4 == 0) goto Lc5
            androidx.constraintlayout.motion.widget.b r4 = r0.f1565r0
            androidx.constraintlayout.motion.widget.b$b r4 = r4.f1624c
            androidx.constraintlayout.motion.widget.c r4 = r4.f1652l
            int r5 = r4.f1683t
            r5 = r5 & r6
            if (r5 == 0) goto Lc5
            float r5 = (float) r2
            float r7 = (float) r3
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r4.f1678o
            float r14 = r11.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r4.f1678o
            int r13 = r4.f1667d
            float r15 = r4.f1671h
            float r11 = r4.f1670g
            float[] r10 = r4.f1675l
            r16 = r11
            r17 = r10
            r12.m877w(r13, r14, r15, r16, r17)
            float r10 = r4.f1672i
            r11 = 869711765(0x33d6bf95, float:1.0E-7)
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 == 0) goto L93
            float[] r4 = r4.f1675l
            r7 = r4[r9]
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L8d
            r4[r9] = r11
        L8d:
            float r5 = r5 * r10
            r4 = r4[r9]
            float r5 = r5 / r4
            goto La5
        L93:
            float[] r5 = r4.f1675l
            r10 = r5[r6]
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto L9d
            r5[r6] = r11
        L9d:
            float r4 = r4.f1673j
            float r7 = r7 * r4
            r4 = r5[r6]
            float r5 = r7 / r4
        La5:
            float r4 = r0.f1526E0
            int r7 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r7 > 0) goto Laf
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 < 0) goto Lb9
        Laf:
            r7 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 < 0) goto Lc5
            int r4 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r4 <= 0) goto Lc5
        Lb9:
            r1.setNestedScrollingEnabled(r9)
            androidx.constraintlayout.motion.widget.MotionLayout$a r2 = new androidx.constraintlayout.motion.widget.MotionLayout$a
            r2.<init>(r0, r1)
            r1.post(r2)
            return
        Lc5:
            float r1 = r0.f1525D0
            long r4 = r18.getNanoTime()
            float r7 = (float) r2
            r0.f1541T0 = r7
            float r10 = (float) r3
            r0.f1542U0 = r10
            long r11 = r0.f1543V0
            long r11 = r4 - r11
            double r11 = (double) r11
            r13 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            double r11 = r11 * r13
            float r11 = (float) r11
            r0.f1544W0 = r11
            r0.f1543V0 = r4
            androidx.constraintlayout.motion.widget.b r4 = r0.f1565r0
            androidx.constraintlayout.motion.widget.b$b r4 = r4.f1624c
            if (r4 == 0) goto L165
            androidx.constraintlayout.motion.widget.c r4 = r4.f1652l
            if (r4 == 0) goto L165
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r4.f1678o
            float r5 = r5.getProgress()
            boolean r11 = r4.f1674k
            if (r11 != 0) goto Lfd
            r4.f1674k = r6
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r4.f1678o
            r11.setProgress(r5)
        Lfd:
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r4.f1678o
            int r12 = r4.f1667d
            float r14 = r4.f1671h
            float r15 = r4.f1670g
            float[] r13 = r4.f1675l
            r16 = r13
            r13 = r5
            r11.m877w(r12, r13, r14, r15, r16)
            float r11 = r4.f1672i
            float[] r12 = r4.f1675l
            r13 = r12[r9]
            float r11 = r11 * r13
            float r13 = r4.f1673j
            r12 = r12[r6]
            float r13 = r13 * r12
            float r13 = r13 + r11
            float r11 = java.lang.Math.abs(r13)
            double r11 = (double) r11
            r13 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L133
            float[] r11 = r4.f1675l
            r12 = 1008981770(0x3c23d70a, float:0.01)
            r11[r9] = r12
            r11[r6] = r12
        L133:
            float r11 = r4.f1672i
            int r12 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r12 == 0) goto L141
            float r7 = r7 * r11
            float[] r10 = r4.f1675l
            r10 = r10[r9]
            float r7 = r7 / r10
            goto L14b
        L141:
            float r7 = r4.f1673j
            float r10 = r10 * r7
            float[] r7 = r4.f1675l
            r7 = r7[r6]
            float r7 = r10 / r7
        L14b:
            float r5 = r5 + r7
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r5, r7)
            float r5 = java.lang.Math.max(r5, r8)
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r4.f1678o
            float r7 = r7.getProgress()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L165
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r4.f1678o
            r4.setProgress(r5)
        L165:
            float r4 = r0.f1525D0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L16f
            r22[r9] = r2
            r22[r6] = r3
        L16f:
            r0.m874t(r9)
            r1 = r22[r9]
            if (r1 != 0) goto L17a
            r1 = r22[r6]
            if (r1 == 0) goto L17c
        L17a:
            r0.f1540S0 = r6
        L17c:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* renamed from: l */
    public void mo872l(int r1) {
            r0 = this;
            r1 = 0
            r0.f1698k0 = r1
            return
    }

    @Override // p227n0.InterfaceC4651j
    /* renamed from: m */
    public void mo564m(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            boolean r1 = r0.f1540S0
            r6 = 0
            if (r1 != 0) goto L9
            if (r2 != 0) goto L9
            if (r3 == 0) goto L14
        L9:
            r1 = r7[r6]
            int r1 = r1 + r4
            r7[r6] = r1
            r1 = 1
            r2 = r7[r1]
            int r2 = r2 + r5
            r7[r1] = r2
        L14:
            r0.f1540S0 = r6
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: n */
    public void mo565n(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: o */
    public boolean mo566o(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            androidx.constraintlayout.motion.widget.b r1 = r0.f1565r0
            if (r1 == 0) goto L15
            androidx.constraintlayout.motion.widget.b$b r1 = r1.f1624c
            if (r1 == 0) goto L15
            androidx.constraintlayout.motion.widget.c r1 = r1.f1652l
            if (r1 == 0) goto L15
            int r1 = r1.f1683t
            r1 = r1 & 2
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r19 = this;
            r0 = r19
            super.onAttachedToWindow()
            androidx.constraintlayout.motion.widget.b r1 = r0.f1565r0
            if (r1 == 0) goto L189
            int r2 = r0.f1573v0
            r3 = -1
            if (r2 == r3) goto L189
            androidx.constraintlayout.widget.b r1 = r1.m902b(r2)
            androidx.constraintlayout.motion.widget.b r2 = r0.f1565r0
            r4 = 0
            r5 = 0
        L16:
            android.util.SparseArray<androidx.constraintlayout.widget.b> r6 = r2.f1628g
            int r6 = r6.size()
            r7 = 1
            if (r5 >= r6) goto L56
            android.util.SparseArray<androidx.constraintlayout.widget.b> r6 = r2.f1628g
            int r6 = r6.keyAt(r5)
            android.util.SparseIntArray r8 = r2.f1630i
            int r8 = r8.get(r6)
            android.util.SparseIntArray r9 = r2.f1630i
            int r9 = r9.size()
        L31:
            if (r8 <= 0) goto L44
            if (r8 != r6) goto L36
            goto L3a
        L36:
            int r10 = r9 + (-1)
            if (r9 >= 0) goto L3c
        L3a:
            r8 = 1
            goto L45
        L3c:
            android.util.SparseIntArray r9 = r2.f1630i
            int r8 = r9.get(r8)
            r9 = r10
            goto L31
        L44:
            r8 = 0
        L45:
            if (r8 == 0) goto L50
            java.lang.String r2 = "MotionScene"
            java.lang.String r3 = "Cannot be derived from yourself"
            android.util.Log.e(r2, r3)
            goto L179
        L50:
            r2.m912l(r6)
            int r5 = r5 + 1
            goto L16
        L56:
            r5 = 0
        L57:
            android.util.SparseArray<androidx.constraintlayout.widget.b> r6 = r2.f1628g
            int r6 = r6.size()
            if (r5 >= r6) goto L179
            android.util.SparseArray<androidx.constraintlayout.widget.b> r6 = r2.f1628g
            java.lang.Object r6 = r6.valueAt(r5)
            androidx.constraintlayout.widget.b r6 = (androidx.constraintlayout.widget.C0333b) r6
            java.util.Objects.requireNonNull(r6)
            int r8 = r19.getChildCount()
            r9 = 0
        L6f:
            if (r9 >= r8) goto L175
            android.view.View r10 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r11 = (androidx.constraintlayout.widget.ConstraintLayout.C0330a) r11
            int r12 = r10.getId()
            boolean r13 = r6.f1789b
            if (r13 == 0) goto L8e
            if (r12 == r3) goto L86
            goto L8e
        L86:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r1.<init>(r2)
            throw r1
        L8e:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r13 = r6.f1790c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            boolean r13 = r13.containsKey(r14)
            if (r13 != 0) goto La8
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r13 = r6.f1790c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            androidx.constraintlayout.widget.b$a r15 = new androidx.constraintlayout.widget.b$a
            r15.<init>()
            r13.put(r14, r15)
        La8:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r13 = r6.f1790c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            java.lang.Object r13 = r13.get(r14)
            androidx.constraintlayout.widget.b$a r13 = (androidx.constraintlayout.widget.C0333b.a) r13
            androidx.constraintlayout.widget.b$b r14 = r13.f1794d
            boolean r14 = r14.f1826b
            if (r14 != 0) goto Led
            r13.m955b(r12, r11)
            boolean r11 = r10 instanceof androidx.constraintlayout.widget.AbstractC0332a
            if (r11 == 0) goto Le9
            androidx.constraintlayout.widget.b$b r11 = r13.f1794d
            r12 = r10
            androidx.constraintlayout.widget.a r12 = (androidx.constraintlayout.widget.AbstractC0332a) r12
            int[] r12 = r12.getReferencedIds()
            r11.f1833e0 = r12
            boolean r11 = r10 instanceof androidx.constraintlayout.widget.Barrier
            if (r11 == 0) goto Le9
            r11 = r10
            androidx.constraintlayout.widget.Barrier r11 = (androidx.constraintlayout.widget.Barrier) r11
            androidx.constraintlayout.widget.b$b r12 = r13.f1794d
            w.a r14 = r11.f1687k0
            boolean r14 = r14.f26063K0
            r12.f1843j0 = r14
            int r14 = r11.getType()
            r12.f1827b0 = r14
            androidx.constraintlayout.widget.b$b r12 = r13.f1794d
            int r11 = r11.getMargin()
            r12.f1829c0 = r11
        Le9:
            androidx.constraintlayout.widget.b$b r11 = r13.f1794d
            r11.f1826b = r7
        Led:
            androidx.constraintlayout.widget.b$d r11 = r13.f1792b
            boolean r12 = r11.f1868a
            if (r12 != 0) goto L105
            int r12 = r10.getVisibility()
            r11.f1869b = r12
            androidx.constraintlayout.widget.b$d r11 = r13.f1792b
            float r12 = r10.getAlpha()
            r11.f1871d = r12
            androidx.constraintlayout.widget.b$d r11 = r13.f1792b
            r11.f1868a = r7
        L105:
            androidx.constraintlayout.widget.b$e r11 = r13.f1795e
            boolean r12 = r11.f1874a
            if (r12 != 0) goto L171
            r11.f1874a = r7
            float r12 = r10.getRotation()
            r11.f1875b = r12
            androidx.constraintlayout.widget.b$e r11 = r13.f1795e
            float r12 = r10.getRotationX()
            r11.f1876c = r12
            androidx.constraintlayout.widget.b$e r11 = r13.f1795e
            float r12 = r10.getRotationY()
            r11.f1877d = r12
            androidx.constraintlayout.widget.b$e r11 = r13.f1795e
            float r12 = r10.getScaleX()
            r11.f1878e = r12
            androidx.constraintlayout.widget.b$e r11 = r13.f1795e
            float r12 = r10.getScaleY()
            r11.f1879f = r12
            float r11 = r10.getPivotX()
            float r12 = r10.getPivotY()
            double r14 = (double) r11
            r16 = 0
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 != 0) goto L147
            double r14 = (double) r12
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 == 0) goto L14d
        L147:
            androidx.constraintlayout.widget.b$e r14 = r13.f1795e
            r14.f1880g = r11
            r14.f1881h = r12
        L14d:
            androidx.constraintlayout.widget.b$e r11 = r13.f1795e
            float r12 = r10.getTranslationX()
            r11.f1882i = r12
            androidx.constraintlayout.widget.b$e r11 = r13.f1795e
            float r12 = r10.getTranslationY()
            r11.f1883j = r12
            androidx.constraintlayout.widget.b$e r11 = r13.f1795e
            float r12 = r10.getTranslationZ()
            r11.f1884k = r12
            androidx.constraintlayout.widget.b$e r11 = r13.f1795e
            boolean r12 = r11.f1885l
            if (r12 == 0) goto L171
            float r10 = r10.getElevation()
            r11.f1886m = r10
        L171:
            int r9 = r9 + 1
            goto L6f
        L175:
            int r5 = r5 + 1
            goto L57
        L179:
            if (r1 == 0) goto L185
            r1.m944c(r0, r7)
            r1 = 0
            r0.setConstraintSet(r1)
            r19.requestLayout()
        L185:
            int r1 = r0.f1573v0
            r0.f1571u0 = r1
        L189:
            r19.m879y()
            androidx.constraintlayout.motion.widget.MotionLayout$g r1 = r0.f1564q1
            if (r1 == 0) goto L194
            r1.m895a()
            goto L1b0
        L194:
            androidx.constraintlayout.motion.widget.b r1 = r0.f1565r0
            if (r1 == 0) goto L1b0
            androidx.constraintlayout.motion.widget.b$b r1 = r1.f1624c
            if (r1 == 0) goto L1b0
            int r1 = r1.f1654n
            r2 = 4
            if (r1 != r2) goto L1b0
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.m873s(r1)
            androidx.constraintlayout.motion.widget.MotionLayout$i r1 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1614Z
            r0.setState(r1)
            androidx.constraintlayout.motion.widget.MotionLayout$i r1 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1615a0
            r0.setState(r1)
        L1b0:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            androidx.constraintlayout.motion.widget.b r0 = r6.f1565r0
            r1 = 0
            if (r0 == 0) goto L8f
            boolean r2 = r6.f1579z0
            if (r2 != 0) goto Lb
            goto L8f
        Lb:
            androidx.constraintlayout.motion.widget.b$b r0 = r0.f1624c
            if (r0 == 0) goto L8f
            boolean r2 = r0.f1655o
            r2 = r2 ^ 1
            if (r2 == 0) goto L8f
            androidx.constraintlayout.motion.widget.c r0 = r0.f1652l
            if (r0 == 0) goto L8f
            int r2 = r7.getAction()
            if (r2 != 0) goto L39
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            android.graphics.RectF r2 = r0.m917a(r6, r2)
            if (r2 == 0) goto L39
            float r3 = r7.getX()
            float r4 = r7.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 != 0) goto L39
            return r1
        L39:
            int r0 = r0.f1668e
            r2 = -1
            if (r0 == r2) goto L8f
            android.view.View r2 = r6.f1574v1
            if (r2 == 0) goto L48
            int r2 = r2.getId()
            if (r2 == r0) goto L4e
        L48:
            android.view.View r0 = r6.findViewById(r0)
            r6.f1574v1 = r0
        L4e:
            android.view.View r0 = r6.f1574v1
            if (r0 == 0) goto L8f
            android.graphics.RectF r2 = r6.f1572u1
            int r0 = r0.getLeft()
            float r0 = (float) r0
            android.view.View r3 = r6.f1574v1
            int r3 = r3.getTop()
            float r3 = (float) r3
            android.view.View r4 = r6.f1574v1
            int r4 = r4.getRight()
            float r4 = (float) r4
            android.view.View r5 = r6.f1574v1
            int r5 = r5.getBottom()
            float r5 = (float) r5
            r2.set(r0, r3, r4, r5)
            android.graphics.RectF r0 = r6.f1572u1
            float r2 = r7.getX()
            float r3 = r7.getY()
            boolean r0 = r0.contains(r2, r3)
            if (r0 == 0) goto L8f
            android.view.View r0 = r6.f1574v1
            r2 = 0
            boolean r0 = r6.m878x(r2, r2, r0, r7)
            if (r0 != 0) goto L8f
            boolean r7 = r6.onTouchEvent(r7)
            return r7
        L8f:
            return r1
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            r0 = 1
            r3.f1563p1 = r0
            r1 = 0
            androidx.constraintlayout.motion.widget.b r2 = r3.f1565r0     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto Le
            super.onLayout(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25
            r3.f1563p1 = r1
            return
        Le:
            int r7 = r7 - r5
            int r8 = r8 - r6
            int r4 = r3.f1538Q0     // Catch: java.lang.Throwable -> L25
            if (r4 != r7) goto L18
            int r4 = r3.f1539R0     // Catch: java.lang.Throwable -> L25
            if (r4 == r8) goto L1e
        L18:
            r3.m868A()     // Catch: java.lang.Throwable -> L25
            r3.m874t(r0)     // Catch: java.lang.Throwable -> L25
        L1e:
            r3.f1538Q0 = r7     // Catch: java.lang.Throwable -> L25
            r3.f1539R0 = r8     // Catch: java.lang.Throwable -> L25
            r3.f1563p1 = r1
            return
        L25:
            r4 = move-exception
            r3.f1563p1 = r1
            throw r4
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int r18, int r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            androidx.constraintlayout.motion.widget.b r3 = r0.f1565r0
            if (r3 != 0) goto Le
            super.onMeasure(r18, r19)
            return
        Le:
            int r3 = r0.f1577x0
            r4 = 0
            r5 = 1
            if (r3 != r1) goto L1b
            int r3 = r0.f1578y0
            if (r3 == r2) goto L19
            goto L1b
        L19:
            r3 = 0
            goto L1c
        L1b:
            r3 = 1
        L1c:
            boolean r6 = r0.f1570t1
            if (r6 == 0) goto L29
            r0.f1570t1 = r4
            r17.m879y()
            r17.m880z()
            r3 = 1
        L29:
            boolean r6 = r0.f1695h0
            if (r6 == 0) goto L2e
            r3 = 1
        L2e:
            r0.f1577x0 = r1
            r0.f1578y0 = r2
            androidx.constraintlayout.motion.widget.b r6 = r0.f1565r0
            int r6 = r6.m909i()
            androidx.constraintlayout.motion.widget.b r7 = r0.f1565r0
            int r7 = r7.m904d()
            if (r3 != 0) goto L50
            androidx.constraintlayout.motion.widget.MotionLayout$d r3 = r0.f1568s1
            int r8 = r3.f1603e
            if (r6 != r8) goto L4d
            int r3 = r3.f1604f
            if (r7 == r3) goto L4b
            goto L4d
        L4b:
            r3 = 0
            goto L4e
        L4d:
            r3 = 1
        L4e:
            if (r3 == 0) goto L76
        L50:
            int r3 = r0.f1571u0
            r8 = -1
            if (r3 == r8) goto L76
            super.onMeasure(r18, r19)
            androidx.constraintlayout.motion.widget.MotionLayout$d r1 = r0.f1568s1
            androidx.constraintlayout.motion.widget.b r2 = r0.f1565r0
            androidx.constraintlayout.widget.b r2 = r2.m902b(r6)
            androidx.constraintlayout.motion.widget.b r3 = r0.f1565r0
            androidx.constraintlayout.widget.b r3 = r3.m902b(r7)
            r1.m892d(r2, r3)
            androidx.constraintlayout.motion.widget.MotionLayout$d r1 = r0.f1568s1
            r1.m893e()
            androidx.constraintlayout.motion.widget.MotionLayout$d r1 = r0.f1568s1
            r1.f1603e = r6
            r1.f1604f = r7
            r1 = 0
            goto L77
        L76:
            r1 = 1
        L77:
            boolean r2 = r0.f1554g1
            if (r2 != 0) goto L7d
            if (r1 == 0) goto Lce
        L7d:
            int r1 = r17.getPaddingTop()
            int r2 = r17.getPaddingBottom()
            int r2 = r2 + r1
            int r1 = r17.getPaddingLeft()
            int r3 = r17.getPaddingRight()
            int r3 = r3 + r1
            w.g r1 = r0.f1690c0
            int r1 = r1.m13721u()
            int r1 = r1 + r3
            w.g r3 = r0.f1690c0
            int r3 = r3.m13715o()
            int r3 = r3 + r2
            int r2 = r0.f1559l1
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r6) goto La5
            if (r2 != 0) goto Lb5
        La5:
            int r1 = r0.f1555h1
            float r2 = (float) r1
            float r7 = r0.f1561n1
            int r8 = r0.f1557j1
            int r8 = r8 - r1
            float r1 = (float) r8
            float r7 = r7 * r1
            float r7 = r7 + r2
            int r1 = (int) r7
            r17.requestLayout()
        Lb5:
            int r2 = r0.f1560m1
            if (r2 == r6) goto Lbb
            if (r2 != 0) goto Lcb
        Lbb:
            int r2 = r0.f1556i1
            float r3 = (float) r2
            float r6 = r0.f1561n1
            int r7 = r0.f1558k1
            int r7 = r7 - r2
            float r2 = (float) r7
            float r6 = r6 * r2
            float r6 = r6 + r3
            int r3 = (int) r6
            r17.requestLayout()
        Lcb:
            r0.setMeasuredDimension(r1, r3)
        Lce:
            float r1 = r0.f1528G0
            float r2 = r0.f1526E0
            float r1 = r1 - r2
            float r1 = java.lang.Math.signum(r1)
            long r2 = r17.getNanoTime()
            android.view.animation.Interpolator r6 = r0.f1567s0
            boolean r7 = r6 instanceof p331t.C6092g
            r8 = 814313567(0x3089705f, float:1.0E-9)
            r9 = 0
            if (r7 != 0) goto Lf2
            long r10 = r0.f1527F0
            long r10 = r2 - r10
            float r7 = (float) r10
            float r7 = r7 * r1
            float r7 = r7 * r8
            float r10 = r0.f1524C0
            float r7 = r7 / r10
            goto Lf3
        Lf2:
            r7 = 0
        Lf3:
            float r10 = r0.f1526E0
            float r10 = r10 + r7
            boolean r7 = r0.f1529H0
            if (r7 == 0) goto Lfc
            float r10 = r0.f1528G0
        Lfc:
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 <= 0) goto L106
            float r11 = r0.f1528G0
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L110
        L106:
            int r11 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r11 > 0) goto L113
            float r11 = r0.f1528G0
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 > 0) goto L113
        L110:
            float r10 = r0.f1528G0
            goto L114
        L113:
            r5 = 0
        L114:
            if (r6 == 0) goto L12b
            if (r5 != 0) goto L12b
            boolean r5 = r0.f1534M0
            if (r5 == 0) goto L127
            long r10 = r0.f1523B0
            long r2 = r2 - r10
            float r2 = (float) r2
            float r2 = r2 * r8
            float r10 = r6.getInterpolation(r2)
            goto L12b
        L127:
            float r10 = r6.getInterpolation(r10)
        L12b:
            if (r7 <= 0) goto L133
            float r2 = r0.f1528G0
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 >= 0) goto L13d
        L133:
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 > 0) goto L13f
            float r1 = r0.f1528G0
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L13f
        L13d:
            float r10 = r0.f1528G0
        L13f:
            r0.f1561n1 = r10
            int r1 = r17.getChildCount()
            long r2 = r17.getNanoTime()
        L149:
            if (r4 >= r1) goto L166
            android.view.View r12 = r0.getChildAt(r4)
            java.util.HashMap<android.view.View, u.o> r5 = r0.f1522A0
            java.lang.Object r5 = r5.get(r12)
            r11 = r5
            u.o r11 = (p346u.C6270o) r11
            if (r11 == 0) goto L163
            f.t r5 = r0.f1562o1
            r13 = r10
            r14 = r2
            r16 = r5
            r11.m12891c(r12, r13, r14, r16)
        L163:
            int r4 = r4 + 1
            goto L149
        L166:
            boolean r1 = r0.f1554g1
            if (r1 == 0) goto L16d
            r17.requestLayout()
        L16d:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.b r2 = r1.f1565r0
            if (r2 == 0) goto L15
            boolean r0 = r1.m928k()
            r2.f1637p = r0
            androidx.constraintlayout.motion.widget.b$b r2 = r2.f1624c
            if (r2 == 0) goto L15
            androidx.constraintlayout.motion.widget.c r2 = r2.f1652l
            if (r2 == 0) goto L15
            r2.m918b(r0)
        L15:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            androidx.constraintlayout.motion.widget.b r2 = r0.f1565r0
            if (r2 == 0) goto L424
            boolean r3 = r0.f1579z0
            if (r3 == 0) goto L424
            boolean r2 = r2.m914n()
            if (r2 == 0) goto L424
            androidx.constraintlayout.motion.widget.b r2 = r0.f1565r0
            androidx.constraintlayout.motion.widget.b$b r3 = r2.f1624c
            r4 = 1
            if (r3 == 0) goto L23
            boolean r3 = r3.f1655o
            r3 = r3 ^ r4
            if (r3 != 0) goto L23
            boolean r1 = super.onTouchEvent(r19)
            return r1
        L23:
            int r3 = r18.getCurrentState()
            java.util.Objects.requireNonNull(r2)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            androidx.constraintlayout.motion.widget.MotionLayout$e r6 = r2.f1636o
            if (r6 != 0) goto L42
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r2.f1622a
            java.util.Objects.requireNonNull(r6)
            androidx.constraintlayout.motion.widget.MotionLayout$f r6 = androidx.constraintlayout.motion.widget.MotionLayout.C0323f.f1606b
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r6.f1607a = r7
            r2.f1636o = r6
        L42:
            androidx.constraintlayout.motion.widget.MotionLayout$e r6 = r2.f1636o
            androidx.constraintlayout.motion.widget.MotionLayout$f r6 = (androidx.constraintlayout.motion.widget.MotionLayout.C0323f) r6
            android.view.VelocityTracker r6 = r6.f1607a
            if (r6 == 0) goto L4d
            r6.addMovement(r1)
        L4d:
            r6 = 2
            r8 = -1
            if (r3 == r8) goto L1f3
            int r11 = r19.getAction()
            if (r11 == 0) goto L167
            if (r11 == r6) goto L5b
            goto L1f3
        L5b:
            boolean r11 = r2.f1634m
            if (r11 == 0) goto L61
            goto L1f3
        L61:
            float r11 = r19.getRawY()
            float r12 = r2.f1639r
            float r11 = r11 - r12
            float r12 = r19.getRawX()
            float r13 = r2.f1638q
            float r12 = r12 - r13
            double r13 = (double) r12
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto L7b
            double r13 = (double) r11
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L422
        L7b:
            android.view.MotionEvent r13 = r2.f1633l
            if (r13 != 0) goto L81
            goto L422
        L81:
            if (r3 == r8) goto L12c
            y.g r14 = r2.f1623b
            if (r14 == 0) goto L8e
            int r14 = r14.m14214a(r3, r8, r8)
            if (r14 == r8) goto L8e
            goto L8f
        L8e:
            r14 = r3
        L8f:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r10 = r2.f1625d
            java.util.Iterator r10 = r10.iterator()
        L9a:
            boolean r17 = r10.hasNext()
            if (r17 == 0) goto Lb6
            java.lang.Object r17 = r10.next()
            r6 = r17
            androidx.constraintlayout.motion.widget.b$b r6 = (androidx.constraintlayout.motion.widget.C0328b.b) r6
            int r4 = r6.f1644d
            if (r4 == r14) goto Lb0
            int r4 = r6.f1643c
            if (r4 != r14) goto Lb3
        Lb0:
            r15.add(r6)
        Lb3:
            r4 = 1
            r6 = 2
            goto L9a
        Lb6:
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            java.util.Iterator r6 = r15.iterator()
            r10 = 0
            r14 = 0
        Lc1:
            boolean r15 = r6.hasNext()
            if (r15 == 0) goto L12e
            java.lang.Object r15 = r6.next()
            androidx.constraintlayout.motion.widget.b$b r15 = (androidx.constraintlayout.motion.widget.C0328b.b) r15
            boolean r7 = r15.f1655o
            if (r7 == 0) goto Ld2
            goto L12a
        Ld2:
            androidx.constraintlayout.motion.widget.c r7 = r15.f1652l
            if (r7 == 0) goto L12a
            boolean r8 = r2.f1637p
            r7.m918b(r8)
            androidx.constraintlayout.motion.widget.c r7 = r15.f1652l
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r2.f1622a
            android.graphics.RectF r7 = r7.m917a(r8, r4)
            if (r7 == 0) goto Lf4
            float r8 = r13.getX()
            float r9 = r13.getY()
            boolean r7 = r7.contains(r8, r9)
            if (r7 != 0) goto Lf4
            goto L12a
        Lf4:
            androidx.constraintlayout.motion.widget.c r7 = r15.f1652l
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r2.f1622a
            android.graphics.RectF r7 = r7.m917a(r8, r4)
            if (r7 == 0) goto L10d
            float r8 = r13.getX()
            float r9 = r13.getY()
            boolean r7 = r7.contains(r8, r9)
            if (r7 != 0) goto L10d
            goto L12a
        L10d:
            androidx.constraintlayout.motion.widget.c r7 = r15.f1652l
            float r8 = r7.f1672i
            float r8 = r8 * r12
            float r7 = r7.f1673j
            float r7 = r7 * r11
            float r7 = r7 + r8
            int r8 = r15.f1643c
            if (r8 != r3) goto L11f
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L122
        L11f:
            r8 = 1066192077(0x3f8ccccd, float:1.1)
        L122:
            float r7 = r7 * r8
            int r8 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r8 <= 0) goto L12a
            r10 = r7
            r14 = r15
        L12a:
            r8 = -1
            goto Lc1
        L12c:
            androidx.constraintlayout.motion.widget.b$b r14 = r2.f1624c
        L12e:
            if (r14 == 0) goto L1f3
            r0.setTransition(r14)
            androidx.constraintlayout.motion.widget.b$b r3 = r2.f1624c
            androidx.constraintlayout.motion.widget.c r3 = r3.f1652l
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r2.f1622a
            android.graphics.RectF r3 = r3.m917a(r4, r5)
            if (r3 == 0) goto L153
            android.view.MotionEvent r4 = r2.f1633l
            float r4 = r4.getX()
            android.view.MotionEvent r5 = r2.f1633l
            float r5 = r5.getY()
            boolean r3 = r3.contains(r4, r5)
            if (r3 != 0) goto L153
            r3 = 1
            goto L154
        L153:
            r3 = 0
        L154:
            r2.f1635n = r3
            androidx.constraintlayout.motion.widget.b$b r3 = r2.f1624c
            androidx.constraintlayout.motion.widget.c r3 = r3.f1652l
            float r4 = r2.f1638q
            float r5 = r2.f1639r
            r3.f1676m = r4
            r3.f1677n = r5
            r4 = 0
            r3.f1674k = r4
            goto L1f3
        L167:
            r4 = 0
            float r3 = r19.getRawX()
            r2.f1638q = r3
            float r3 = r19.getRawY()
            r2.f1639r = r3
            r2.f1633l = r1
            r2.f1634m = r4
            androidx.constraintlayout.motion.widget.b$b r1 = r2.f1624c
            androidx.constraintlayout.motion.widget.c r1 = r1.f1652l
            if (r1 == 0) goto L422
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.f1622a
            int r1 = r1.f1669f
            r4 = -1
            if (r1 != r4) goto L186
            goto L18c
        L186:
            android.view.View r1 = r3.findViewById(r1)
            if (r1 != 0) goto L18e
        L18c:
            r1 = 0
            goto L1a6
        L18e:
            int r3 = r1.getLeft()
            float r3 = (float) r3
            int r4 = r1.getTop()
            float r4 = (float) r4
            int r6 = r1.getRight()
            float r6 = (float) r6
            int r1 = r1.getBottom()
            float r1 = (float) r1
            r5.set(r3, r4, r6, r1)
            r1 = r5
        L1a6:
            if (r1 == 0) goto L1c2
            android.view.MotionEvent r3 = r2.f1633l
            float r3 = r3.getX()
            android.view.MotionEvent r4 = r2.f1633l
            float r4 = r4.getY()
            boolean r1 = r1.contains(r3, r4)
            if (r1 != 0) goto L1c2
            r1 = 0
            r2.f1633l = r1
            r1 = 1
            r2.f1634m = r1
            goto L422
        L1c2:
            androidx.constraintlayout.motion.widget.b$b r1 = r2.f1624c
            androidx.constraintlayout.motion.widget.c r1 = r1.f1652l
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.f1622a
            android.graphics.RectF r1 = r1.m917a(r3, r5)
            if (r1 == 0) goto L1e2
            android.view.MotionEvent r3 = r2.f1633l
            float r3 = r3.getX()
            android.view.MotionEvent r4 = r2.f1633l
            float r4 = r4.getY()
            boolean r1 = r1.contains(r3, r4)
            if (r1 != 0) goto L1e2
            r9 = 1
            goto L1e3
        L1e2:
            r9 = 0
        L1e3:
            r2.f1635n = r9
            androidx.constraintlayout.motion.widget.b$b r1 = r2.f1624c
            androidx.constraintlayout.motion.widget.c r1 = r1.f1652l
            float r3 = r2.f1638q
            float r2 = r2.f1639r
            r1.f1676m = r3
            r1.f1677n = r2
            goto L422
        L1f3:
            boolean r3 = r2.f1634m
            if (r3 == 0) goto L1f9
            goto L422
        L1f9:
            androidx.constraintlayout.motion.widget.b$b r3 = r2.f1624c
            if (r3 == 0) goto L3f3
            androidx.constraintlayout.motion.widget.c r3 = r3.f1652l
            if (r3 == 0) goto L3f3
            boolean r4 = r2.f1635n
            if (r4 != 0) goto L3f3
            androidx.constraintlayout.motion.widget.MotionLayout$e r4 = r2.f1636o
            androidx.constraintlayout.motion.widget.MotionLayout$i r5 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1616b0
            androidx.constraintlayout.motion.widget.MotionLayout$f r4 = (androidx.constraintlayout.motion.widget.MotionLayout.C0323f) r4
            android.view.VelocityTracker r6 = r4.f1607a
            if (r6 == 0) goto L212
            r6.addMovement(r1)
        L212:
            int r6 = r19.getAction()
            if (r6 == 0) goto L3e4
            r7 = 1000(0x3e8, float:1.401E-42)
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 1
            if (r6 == r9) goto L332
            r9 = 2
            if (r6 == r9) goto L224
            goto L3f3
        L224:
            float r5 = r19.getRawY()
            float r6 = r3.f1677n
            float r5 = r5 - r6
            float r6 = r19.getRawX()
            float r9 = r3.f1676m
            float r6 = r6 - r9
            float r9 = r3.f1672i
            float r9 = r9 * r6
            float r10 = r3.f1673j
            float r10 = r10 * r5
            float r10 = r10 + r9
            float r9 = java.lang.Math.abs(r10)
            float r10 = r3.f1684u
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L249
            boolean r9 = r3.f1674k
            if (r9 == 0) goto L3f3
        L249:
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r3.f1678o
            float r9 = r9.getProgress()
            boolean r10 = r3.f1674k
            if (r10 != 0) goto L25b
            r10 = 1
            r3.f1674k = r10
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f1678o
            r10.setProgress(r9)
        L25b:
            int r11 = r3.f1667d
            r10 = -1
            if (r11 == r10) goto L26f
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f1678o
            float r13 = r3.f1671h
            float r14 = r3.f1670g
            float[] r15 = r3.f1675l
            r12 = r9
            r10.m877w(r11, r12, r13, r14, r15)
            r12 = 0
            r13 = 1
            goto L290
        L26f:
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f1678o
            int r10 = r10.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.f1678o
            int r11 = r11.getHeight()
            int r10 = java.lang.Math.min(r10, r11)
            float r10 = (float) r10
            float[] r11 = r3.f1675l
            float r12 = r3.f1673j
            float r12 = r12 * r10
            r13 = 1
            r11[r13] = r12
            float r12 = r3.f1672i
            float r10 = r10 * r12
            r12 = 0
            r11[r12] = r10
        L290:
            float r10 = r3.f1672i
            float[] r11 = r3.f1675l
            r14 = r11[r12]
            float r10 = r10 * r14
            float r12 = r3.f1673j
            r11 = r11[r13]
            float r12 = r12 * r11
            float r12 = r12 + r10
            float r10 = r3.f1682s
            float r12 = r12 * r10
            float r10 = java.lang.Math.abs(r12)
            double r10 = (double) r10
            r12 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L2bd
            float[] r10 = r3.f1675l
            r11 = 1008981770(0x3c23d70a, float:0.01)
            r12 = 0
            r10[r12] = r11
            r13 = 1
            r10[r13] = r11
            goto L2bf
        L2bd:
            r12 = 0
            r13 = 1
        L2bf:
            float r10 = r3.f1672i
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 == 0) goto L2cc
            float[] r5 = r3.f1675l
            r5 = r5[r12]
            float r6 = r6 / r5
            goto L2d2
        L2cc:
            float[] r6 = r3.f1675l
            r6 = r6[r13]
            float r6 = r5 / r6
        L2d2:
            float r9 = r9 + r6
            float r5 = java.lang.Math.min(r9, r8)
            r6 = 0
            float r5 = java.lang.Math.max(r5, r6)
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f1678o
            float r6 = r6.getProgress()
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L31f
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f1678o
            r6.setProgress(r5)
            android.view.VelocityTracker r5 = r4.f1607a
            if (r5 == 0) goto L2f2
            r5.computeCurrentVelocity(r7)
        L2f2:
            android.view.VelocityTracker r5 = r4.f1607a
            if (r5 == 0) goto L2fb
            float r5 = r5.getXVelocity()
            goto L2fc
        L2fb:
            r5 = 0
        L2fc:
            android.view.VelocityTracker r4 = r4.f1607a
            if (r4 == 0) goto L305
            float r4 = r4.getYVelocity()
            goto L306
        L305:
            r4 = 0
        L306:
            float r6 = r3.f1672i
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L315
            float[] r4 = r3.f1675l
            r6 = 0
            r4 = r4[r6]
            float r5 = r5 / r4
            r10 = r5
            goto L31c
        L315:
            float[] r5 = r3.f1675l
            r6 = 1
            r5 = r5[r6]
            float r4 = r4 / r5
            r10 = r4
        L31c:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.f1678o
            goto L322
        L31f:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.f1678o
            r10 = 0
        L322:
            r4.f1569t0 = r10
            float r4 = r19.getRawX()
            r3.f1676m = r4
            float r4 = r19.getRawY()
            r3.f1677n = r4
            goto L3f3
        L332:
            r6 = 0
            r3.f1674k = r6
            android.view.VelocityTracker r6 = r4.f1607a
            if (r6 == 0) goto L33c
            r6.computeCurrentVelocity(r7)
        L33c:
            android.view.VelocityTracker r6 = r4.f1607a
            if (r6 == 0) goto L345
            float r6 = r6.getXVelocity()
            goto L346
        L345:
            r6 = 0
        L346:
            android.view.VelocityTracker r4 = r4.f1607a
            if (r4 == 0) goto L34f
            float r4 = r4.getYVelocity()
            goto L350
        L34f:
            r4 = 0
        L350:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.f1678o
            float r7 = r7.getProgress()
            int r10 = r3.f1667d
            r9 = -1
            if (r10 == r9) goto L36a
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r3.f1678o
            float r12 = r3.f1671h
            float r13 = r3.f1670g
            float[] r14 = r3.f1675l
            r11 = r7
            r9.m877w(r10, r11, r12, r13, r14)
            r11 = 0
            r12 = 1
            goto L38b
        L36a:
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r3.f1678o
            int r9 = r9.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f1678o
            int r10 = r10.getHeight()
            int r9 = java.lang.Math.min(r9, r10)
            float r9 = (float) r9
            float[] r10 = r3.f1675l
            float r11 = r3.f1673j
            float r11 = r11 * r9
            r12 = 1
            r10[r12] = r11
            float r11 = r3.f1672i
            float r9 = r9 * r11
            r11 = 0
            r10[r11] = r9
        L38b:
            float r9 = r3.f1672i
            float[] r10 = r3.f1675l
            r13 = r10[r11]
            r13 = r10[r12]
            r13 = 0
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L39c
            r4 = r10[r11]
            float r6 = r6 / r4
            goto L3a0
        L39c:
            r6 = r10[r12]
            float r6 = r4 / r6
        L3a0:
            boolean r4 = java.lang.Float.isNaN(r6)
            if (r4 != 0) goto L3ac
            r4 = 1077936128(0x40400000, float:3.0)
            float r4 = r6 / r4
            float r4 = r4 + r7
            goto L3ad
        L3ac:
            r4 = r7
        L3ad:
            r9 = 0
            int r10 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r10 == 0) goto L3d5
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 == 0) goto L3d5
            int r9 = r3.f1666c
            r10 = 3
            if (r9 == r10) goto L3d5
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f1678o
            double r11 = (double) r4
            r13 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 >= 0) goto L3c6
            r11 = 0
            goto L3c8
        L3c6:
            r11 = 1065353216(0x3f800000, float:1.0)
        L3c8:
            r10.m870C(r9, r11, r6)
            r6 = 0
            int r4 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r4 >= 0) goto L3de
            int r4 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r4 > 0) goto L3f3
            goto L3de
        L3d5:
            r6 = 0
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 >= 0) goto L3de
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 > 0) goto L3f3
        L3de:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.f1678o
            r3.setState(r5)
            goto L3f3
        L3e4:
            float r4 = r19.getRawX()
            r3.f1676m = r4
            float r4 = r19.getRawY()
            r3.f1677n = r4
            r4 = 0
            r3.f1674k = r4
        L3f3:
            float r3 = r19.getRawX()
            r2.f1638q = r3
            float r3 = r19.getRawY()
            r2.f1639r = r3
            int r1 = r19.getAction()
            r3 = 1
            if (r1 != r3) goto L422
            androidx.constraintlayout.motion.widget.MotionLayout$e r1 = r2.f1636o
            if (r1 == 0) goto L422
            androidx.constraintlayout.motion.widget.MotionLayout$f r1 = (androidx.constraintlayout.motion.widget.MotionLayout.C0323f) r1
            android.view.VelocityTracker r3 = r1.f1607a
            if (r3 == 0) goto L417
            r3.recycle()
            r3 = 0
            r1.f1607a = r3
            goto L418
        L417:
            r3 = 0
        L418:
            r2.f1636o = r3
            int r1 = r0.f1573v0
            r3 = -1
            if (r1 == r3) goto L422
            r2.m901a(r0, r1)
        L422:
            r1 = 1
            return r1
        L424:
            boolean r1 = super.onTouchEvent(r19)
            return r1
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(android.view.View r2) {
            r1 = this;
            super.onViewAdded(r2)
            boolean r0 = r2 instanceof androidx.constraintlayout.motion.widget.C0327a
            if (r0 == 0) goto L41
            androidx.constraintlayout.motion.widget.a r2 = (androidx.constraintlayout.motion.widget.C0327a) r2
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$h> r0 = r1.f1548a1
            if (r0 != 0) goto L14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1548a1 = r0
        L14:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$h> r0 = r1.f1548a1
            r0.add(r2)
            boolean r0 = r2.f1618i0
            if (r0 == 0) goto L2d
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a> r0 = r1.f1546Y0
            if (r0 != 0) goto L28
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1546Y0 = r0
        L28:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a> r0 = r1.f1546Y0
            r0.add(r2)
        L2d:
            boolean r0 = r2.f1619j0
            if (r0 == 0) goto L41
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a> r0 = r1.f1547Z0
            if (r0 != 0) goto L3c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1547Z0 = r0
        L3c:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a> r0 = r1.f1547Z0
            r0.add(r2)
        L41:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(android.view.View r2) {
            r1 = this;
            super.onViewRemoved(r2)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a> r0 = r1.f1546Y0
            if (r0 == 0) goto La
            r0.remove(r2)
        La:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a> r0 = r1.f1547Z0
            if (r0 == 0) goto L11
            r0.remove(r2)
        L11:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
            r2 = this;
            boolean r0 = r2.f1554g1
            if (r0 != 0) goto L16
            int r0 = r2.f1573v0
            r1 = -1
            if (r0 != r1) goto L16
            androidx.constraintlayout.motion.widget.b r0 = r2.f1565r0
            if (r0 == 0) goto L16
            androidx.constraintlayout.motion.widget.b$b r0 = r0.f1624c
            if (r0 == 0) goto L16
            int r0 = r0.f1657q
            if (r0 != 0) goto L16
            return
        L16:
            super.requestLayout()
            return
    }

    /* renamed from: s */
    public void m873s(float r5) {
            r4 = this;
            androidx.constraintlayout.motion.widget.b r0 = r4.f1565r0
            if (r0 != 0) goto L5
            return
        L5:
            float r1 = r4.f1526E0
            float r2 = r4.f1525D0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L13
            boolean r1 = r4.f1529H0
            if (r1 == 0) goto L13
            r4.f1526E0 = r2
        L13:
            float r1 = r4.f1526E0
            int r2 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r2 != 0) goto L1a
            return
        L1a:
            r2 = 0
            r4.f1534M0 = r2
            r4.f1528G0 = r5
            int r5 = r0.m903c()
            float r5 = (float) r5
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 / r0
            r4.f1524C0 = r5
            float r5 = r4.f1528G0
            r4.setProgress(r5)
            androidx.constraintlayout.motion.widget.b r5 = r4.f1565r0
            android.view.animation.Interpolator r5 = r5.m906f()
            r4.f1567s0 = r5
            r4.f1529H0 = r2
            long r2 = r4.getNanoTime()
            r4.f1523B0 = r2
            r5 = 1
            r4.f1530I0 = r5
            r4.f1525D0 = r1
            r4.f1526E0 = r1
            r4.invalidate()
            return
    }

    public void setDebugMode(int r1) {
            r0 = this;
            r0.f1532K0 = r1
            r0.invalidate()
            return
    }

    public void setInteractionEnabled(boolean r1) {
            r0 = this;
            r0.f1579z0 = r1
            return
    }

    public void setInterpolatedProgress(float r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.b r0 = r1.f1565r0
            if (r0 == 0) goto L19
            androidx.constraintlayout.motion.widget.MotionLayout$i r0 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1615a0
            r1.setState(r0)
            androidx.constraintlayout.motion.widget.b r0 = r1.f1565r0
            android.view.animation.Interpolator r0 = r0.m906f()
            if (r0 == 0) goto L19
            float r2 = r0.getInterpolation(r2)
            r1.setProgress(r2)
            return
        L19:
            r1.setProgress(r2)
            return
    }

    public void setOnHide(float r4) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a> r0 = r3.f1547Z0
            if (r0 == 0) goto L19
            int r0 = r0.size()
            r1 = 0
        L9:
            if (r1 >= r0) goto L19
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a> r2 = r3.f1547Z0
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.motion.widget.a r2 = (androidx.constraintlayout.motion.widget.C0327a) r2
            r2.setProgress(r4)
            int r1 = r1 + 1
            goto L9
        L19:
            return
    }

    public void setOnShow(float r4) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a> r0 = r3.f1546Y0
            if (r0 == 0) goto L19
            int r0 = r0.size()
            r1 = 0
        L9:
            if (r1 >= r0) goto L19
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a> r2 = r3.f1546Y0
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.motion.widget.a r2 = (androidx.constraintlayout.motion.widget.C0327a) r2
            r2.setProgress(r4)
            int r1 = r1 + 1
            goto L9
        L19:
            return
    }

    public void setProgress(float r7) {
            r6 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$i r0 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1616b0
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto Ld
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto L14
        Ld:
            java.lang.String r4 = "MotionLayout"
            java.lang.String r5 = "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"
            android.util.Log.w(r4, r5)
        L14:
            boolean r4 = r6.isAttachedToWindow()
            if (r4 != 0) goto L2a
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r6.f1564q1
            if (r0 != 0) goto L25
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = new androidx.constraintlayout.motion.widget.MotionLayout$g
            r0.<init>(r6)
            r6.f1564q1 = r0
        L25:
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r6.f1564q1
            r0.f1608a = r7
            return
        L2a:
            if (r3 > 0) goto L37
            int r2 = r6.f1571u0
            r6.f1573v0 = r2
            float r2 = r6.f1526E0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L4e
            goto L4b
        L37:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 < 0) goto L46
            int r1 = r6.f1575w0
            r6.f1573v0 = r1
            float r1 = r6.f1526E0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L4e
            goto L4b
        L46:
            r0 = -1
            r6.f1573v0 = r0
            androidx.constraintlayout.motion.widget.MotionLayout$i r0 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1615a0
        L4b:
            r6.setState(r0)
        L4e:
            androidx.constraintlayout.motion.widget.b r0 = r6.f1565r0
            if (r0 != 0) goto L53
            return
        L53:
            r0 = 1
            r6.f1529H0 = r0
            r6.f1528G0 = r7
            r6.f1525D0 = r7
            r1 = -1
            r6.f1527F0 = r1
            r6.f1523B0 = r1
            r7 = 0
            r6.f1567s0 = r7
            r6.f1530I0 = r0
            r6.invalidate()
            return
    }

    public void setScene(androidx.constraintlayout.motion.widget.C0328b r2) {
            r1 = this;
            r1.f1565r0 = r2
            boolean r0 = r1.m928k()
            r2.f1637p = r0
            androidx.constraintlayout.motion.widget.b$b r2 = r2.f1624c
            if (r2 == 0) goto L13
            androidx.constraintlayout.motion.widget.c r2 = r2.f1652l
            if (r2 == 0) goto L13
            r2.m918b(r0)
        L13:
            r1.m868A()
            return
    }

    public void setState(androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i r5) {
            r4 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$i r0 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1616b0
            if (r5 != r0) goto La
            int r1 = r4.f1573v0
            r2 = -1
            if (r1 != r2) goto La
            return
        La:
            androidx.constraintlayout.motion.widget.MotionLayout$i r1 = r4.f1566r1
            r4.f1566r1 = r5
            androidx.constraintlayout.motion.widget.MotionLayout$i r2 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1615a0
            if (r1 != r2) goto L17
            if (r5 != r2) goto L17
            r4.m875u()
        L17:
            int r1 = r1.ordinal()
            if (r1 == 0) goto L2a
            r3 = 1
            if (r1 == r3) goto L2a
            r2 = 2
            if (r1 == r2) goto L24
            goto L32
        L24:
            if (r5 != r0) goto L32
        L26:
            r4.m876v()
            goto L32
        L2a:
            if (r5 != r2) goto L2f
            r4.m875u()
        L2f:
            if (r5 != r0) goto L32
            goto L26
        L32:
            return
    }

    public void setTransition(int r6) {
            r5 = this;
            androidx.constraintlayout.motion.widget.b r0 = r5.f1565r0
            if (r0 == 0) goto La8
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r0 = r0.f1625d
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.b$b r1 = (androidx.constraintlayout.motion.widget.C0328b.b) r1
            int r2 = r1.f1641a
            if (r2 != r6) goto La
            goto L1c
        L1b:
            r1 = 0
        L1c:
            int r6 = r1.f1644d
            r5.f1571u0 = r6
            int r6 = r1.f1643c
            r5.f1575w0 = r6
            boolean r6 = r5.isAttachedToWindow()
            if (r6 != 0) goto L40
            androidx.constraintlayout.motion.widget.MotionLayout$g r6 = r5.f1564q1
            if (r6 != 0) goto L35
            androidx.constraintlayout.motion.widget.MotionLayout$g r6 = new androidx.constraintlayout.motion.widget.MotionLayout$g
            r6.<init>(r5)
            r5.f1564q1 = r6
        L35:
            androidx.constraintlayout.motion.widget.MotionLayout$g r6 = r5.f1564q1
            int r0 = r5.f1571u0
            r6.f1610c = r0
            int r0 = r5.f1575w0
            r6.f1611d = r0
            return
        L40:
            r6 = 2143289344(0x7fc00000, float:NaN)
            int r0 = r5.f1573v0
            int r2 = r5.f1571u0
            r3 = 0
            if (r0 != r2) goto L4b
            r6 = 0
            goto L51
        L4b:
            int r2 = r5.f1575w0
            if (r0 != r2) goto L51
            r6 = 1065353216(0x3f800000, float:1.0)
        L51:
            androidx.constraintlayout.motion.widget.b r0 = r5.f1565r0
            r0.f1624c = r1
            androidx.constraintlayout.motion.widget.c r1 = r1.f1652l
            if (r1 == 0) goto L5e
            boolean r0 = r0.f1637p
            r1.m918b(r0)
        L5e:
            androidx.constraintlayout.motion.widget.MotionLayout$d r0 = r5.f1568s1
            androidx.constraintlayout.motion.widget.b r1 = r5.f1565r0
            int r2 = r5.f1571u0
            androidx.constraintlayout.widget.b r1 = r1.m902b(r2)
            androidx.constraintlayout.motion.widget.b r2 = r5.f1565r0
            int r4 = r5.f1575w0
            androidx.constraintlayout.widget.b r2 = r2.m902b(r4)
            r0.m892d(r1, r2)
            r5.m868A()
            boolean r0 = java.lang.Float.isNaN(r6)
            if (r0 == 0) goto L7e
            r0 = 0
            goto L7f
        L7e:
            r0 = r6
        L7f:
            r5.f1526E0 = r0
            boolean r0 = java.lang.Float.isNaN(r6)
            if (r0 == 0) goto La5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = p346u.C6256a.m12870a()
            r6.append(r0)
            java.lang.String r0 = " transitionToStart "
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "MotionLayout"
            android.util.Log.v(r0, r6)
            r5.m873s(r3)
            goto La8
        La5:
            r5.setProgress(r6)
        La8:
            return
    }

    public void setTransition(androidx.constraintlayout.motion.widget.C0328b.b r4) {
            r3 = this;
            androidx.constraintlayout.motion.widget.b r0 = r3.f1565r0
            r0.f1624c = r4
            if (r4 == 0) goto Lf
            androidx.constraintlayout.motion.widget.c r1 = r4.f1652l
            if (r1 == 0) goto Lf
            boolean r0 = r0.f1637p
            r1.m918b(r0)
        Lf:
            androidx.constraintlayout.motion.widget.MotionLayout$i r0 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1614Z
            r3.setState(r0)
            int r0 = r3.f1573v0
            androidx.constraintlayout.motion.widget.b r1 = r3.f1565r0
            int r1 = r1.m904d()
            if (r0 != r1) goto L21
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L22
        L21:
            r0 = 0
        L22:
            r3.f1526E0 = r0
            r3.f1525D0 = r0
            r3.f1528G0 = r0
            int r4 = r4.f1658r
            r0 = 1
            r4 = r4 & r0
            if (r4 == 0) goto L2f
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r0 == 0) goto L35
            r0 = -1
            goto L39
        L35:
            long r0 = r3.getNanoTime()
        L39:
            r3.f1527F0 = r0
            androidx.constraintlayout.motion.widget.b r4 = r3.f1565r0
            int r4 = r4.m909i()
            androidx.constraintlayout.motion.widget.b r0 = r3.f1565r0
            int r0 = r0.m904d()
            int r1 = r3.f1571u0
            if (r4 != r1) goto L50
            int r1 = r3.f1575w0
            if (r0 != r1) goto L50
            return
        L50:
            r3.f1571u0 = r4
            r3.f1575w0 = r0
            androidx.constraintlayout.motion.widget.b r1 = r3.f1565r0
            r1.m913m(r4, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$d r4 = r3.f1568s1
            androidx.constraintlayout.motion.widget.b r0 = r3.f1565r0
            int r1 = r3.f1571u0
            androidx.constraintlayout.widget.b r0 = r0.m902b(r1)
            androidx.constraintlayout.motion.widget.b r1 = r3.f1565r0
            int r2 = r3.f1575w0
            androidx.constraintlayout.widget.b r1 = r1.m902b(r2)
            r4.m892d(r0, r1)
            androidx.constraintlayout.motion.widget.MotionLayout$d r4 = r3.f1568s1
            int r0 = r3.f1571u0
            int r1 = r3.f1575w0
            r4.f1603e = r0
            r4.f1604f = r1
            r4.m893e()
            r3.m868A()
            return
    }

    public void setTransitionDuration(int r3) {
            r2 = this;
            androidx.constraintlayout.motion.widget.b r0 = r2.f1565r0
            if (r0 != 0) goto Lc
            java.lang.String r3 = "MotionLayout"
            java.lang.String r0 = "MotionScene not defined"
            android.util.Log.e(r3, r0)
            return
        Lc:
            androidx.constraintlayout.motion.widget.b$b r1 = r0.f1624c
            if (r1 == 0) goto L13
            r1.f1648h = r3
            goto L15
        L13:
            r0.f1631j = r3
        L15:
            return
    }

    public void setTransitionListener(androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0325h r1) {
            r0 = this;
            r0.f1531J0 = r1
            return
    }

    public void setTransitionState(android.os.Bundle r3) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r2.f1564q1
            if (r0 != 0) goto Lb
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = new androidx.constraintlayout.motion.widget.MotionLayout$g
            r0.<init>(r2)
            r2.f1564q1 = r0
        Lb:
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r2.f1564q1
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "motion.progress"
            float r1 = r3.getFloat(r1)
            r0.f1608a = r1
            java.lang.String r1 = "motion.velocity"
            float r1 = r3.getFloat(r1)
            r0.f1609b = r1
            java.lang.String r1 = "motion.StartState"
            int r1 = r3.getInt(r1)
            r0.f1610c = r1
            java.lang.String r1 = "motion.EndState"
            int r3 = r3.getInt(r1)
            r0.f1611d = r3
            boolean r3 = r2.isAttachedToWindow()
            if (r3 == 0) goto L3b
            androidx.constraintlayout.motion.widget.MotionLayout$g r3 = r2.f1564q1
            r3.m895a()
        L3b:
            return
    }

    /* renamed from: t */
    public void m874t(boolean r24) {
            r23 = this;
            r0 = r23
            androidx.constraintlayout.motion.widget.MotionLayout$i r1 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1616b0
            long r2 = r0.f1527F0
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L12
            long r2 = r23.getNanoTime()
            r0.f1527F0 = r2
        L12:
            float r2 = r0.f1526E0
            r3 = -1
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 <= 0) goto L22
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L22
            r0.f1573v0 = r3
        L22:
            boolean r6 = r0.f1545X0
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L34
            boolean r6 = r0.f1530I0
            if (r6 == 0) goto L1f9
            if (r24 != 0) goto L34
            float r6 = r0.f1528G0
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 == 0) goto L1f9
        L34:
            float r6 = r0.f1528G0
            float r6 = r6 - r2
            float r2 = java.lang.Math.signum(r6)
            long r9 = r23.getNanoTime()
            android.view.animation.Interpolator r6 = r0.f1567s0
            boolean r11 = r6 instanceof p346u.AbstractInterpolatorC6271p
            r12 = 814313567(0x3089705f, float:1.0E-9)
            if (r11 != 0) goto L57
            long r13 = r0.f1527F0
            long r13 = r9 - r13
            float r11 = (float) r13
            float r11 = r11 * r2
            float r11 = r11 * r12
            float r13 = r0.f1524C0
            float r11 = r11 / r13
            r0.f1569t0 = r11
            goto L58
        L57:
            r11 = 0
        L58:
            float r13 = r0.f1526E0
            float r13 = r13 + r11
            boolean r14 = r0.f1529H0
            if (r14 == 0) goto L61
            float r13 = r0.f1528G0
        L61:
            int r14 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r14 <= 0) goto L6b
            float r15 = r0.f1528G0
            int r15 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r15 >= 0) goto L75
        L6b:
            int r15 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r15 > 0) goto L7b
            float r15 = r0.f1528G0
            int r15 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r15 > 0) goto L7b
        L75:
            float r13 = r0.f1528G0
            r0.f1530I0 = r8
            r15 = 1
            goto L7c
        L7b:
            r15 = 0
        L7c:
            r0.f1526E0 = r13
            r0.f1525D0 = r13
            r0.f1527F0 = r9
            r16 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r6 == 0) goto Lf3
            if (r15 != 0) goto Lf3
            boolean r15 = r0.f1534M0
            if (r15 == 0) goto Ld6
            long r3 = r0.f1523B0
            long r3 = r9 - r3
            float r3 = (float) r3
            float r3 = r3 * r12
            float r3 = r6.getInterpolation(r3)
            r0.f1526E0 = r3
            r0.f1527F0 = r9
            android.view.animation.Interpolator r4 = r0.f1567s0
            boolean r6 = r4 instanceof p346u.AbstractInterpolatorC6271p
            if (r6 == 0) goto Lf2
            u.p r4 = (p346u.AbstractInterpolatorC6271p) r4
            float r4 = r4.mo881a()
            r0.f1569t0 = r4
            float r6 = java.lang.Math.abs(r4)
            float r9 = r0.f1524C0
            float r6 = r6 * r9
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r6 > 0) goto Lb8
            r0.f1530I0 = r8
        Lb8:
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 <= 0) goto Lc8
            r6 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r9 < 0) goto Lc8
            r0.f1526E0 = r6
            r0.f1530I0 = r8
            r3 = 1065353216(0x3f800000, float:1.0)
        Lc8:
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto Lf2
            int r4 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r4 > 0) goto Lf2
            r0.f1526E0 = r5
            r0.f1530I0 = r8
            r13 = 0
            goto Lf3
        Ld6:
            float r3 = r6.getInterpolation(r13)
            android.view.animation.Interpolator r4 = r0.f1567s0
            boolean r6 = r4 instanceof p346u.AbstractInterpolatorC6271p
            if (r6 == 0) goto Le7
            u.p r4 = (p346u.AbstractInterpolatorC6271p) r4
            float r4 = r4.mo881a()
            goto Lf0
        Le7:
            float r13 = r13 + r11
            float r4 = r4.getInterpolation(r13)
            float r4 = r4 - r3
            float r4 = r4 * r2
            float r4 = r4 / r11
        Lf0:
            r0.f1569t0 = r4
        Lf2:
            r13 = r3
        Lf3:
            float r3 = r0.f1569t0
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L102
            androidx.constraintlayout.motion.widget.MotionLayout$i r3 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1615a0
            r0.setState(r3)
        L102:
            if (r14 <= 0) goto L10a
            float r3 = r0.f1528G0
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L114
        L10a:
            int r3 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r3 > 0) goto L118
            float r3 = r0.f1528G0
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 > 0) goto L118
        L114:
            float r13 = r0.f1528G0
            r0.f1530I0 = r8
        L118:
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r4 >= 0) goto L122
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r3 > 0) goto L127
        L122:
            r0.f1530I0 = r8
            r0.setState(r1)
        L127:
            int r3 = r23.getChildCount()
            r0.f1545X0 = r8
            long r9 = r23.getNanoTime()
            r0.f1561n1 = r13
            r6 = 0
        L134:
            if (r6 >= r3) goto L15d
            android.view.View r11 = r0.getChildAt(r6)
            java.util.HashMap<android.view.View, u.o> r12 = r0.f1522A0
            java.lang.Object r12 = r12.get(r11)
            r17 = r12
            u.o r17 = (p346u.C6270o) r17
            if (r17 == 0) goto L159
            boolean r12 = r0.f1545X0
            f.t r8 = r0.f1562o1
            r18 = r11
            r19 = r13
            r20 = r9
            r22 = r8
            boolean r8 = r17.m12891c(r18, r19, r20, r22)
            r8 = r8 | r12
            r0.f1545X0 = r8
        L159:
            int r6 = r6 + 1
            r8 = 0
            goto L134
        L15d:
            if (r14 <= 0) goto L165
            float r3 = r0.f1528G0
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L16f
        L165:
            int r3 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r3 > 0) goto L171
            float r3 = r0.f1528G0
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 > 0) goto L171
        L16f:
            r3 = 1
            goto L172
        L171:
            r3 = 0
        L172:
            boolean r6 = r0.f1545X0
            if (r6 != 0) goto L17f
            boolean r6 = r0.f1530I0
            if (r6 != 0) goto L17f
            if (r3 == 0) goto L17f
            r0.setState(r1)
        L17f:
            boolean r6 = r0.f1554g1
            if (r6 == 0) goto L186
            r23.requestLayout()
        L186:
            boolean r6 = r0.f1545X0
            r3 = r3 ^ r7
            r3 = r3 | r6
            r0.f1545X0 = r3
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r3 > 0) goto L1a9
            int r3 = r0.f1571u0
            r6 = -1
            if (r3 == r6) goto L1a9
            int r6 = r0.f1573v0
            if (r6 == r3) goto L1a9
            r0.f1573v0 = r3
            androidx.constraintlayout.motion.widget.b r6 = r0.f1565r0
            androidx.constraintlayout.widget.b r3 = r6.m902b(r3)
            r3.m942a(r0)
            r0.setState(r1)
            r8 = 1
            goto L1aa
        L1a9:
            r8 = 0
        L1aa:
            double r9 = (double) r13
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 < 0) goto L1c6
            int r3 = r0.f1573v0
            int r6 = r0.f1575w0
            if (r3 == r6) goto L1c6
            r0.f1573v0 = r6
            androidx.constraintlayout.motion.widget.b r3 = r0.f1565r0
            androidx.constraintlayout.widget.b r3 = r3.m902b(r6)
            r3.m942a(r0)
            r0.setState(r1)
            r8 = 1
        L1c6:
            boolean r3 = r0.f1545X0
            if (r3 != 0) goto L1df
            boolean r3 = r0.f1530I0
            if (r3 == 0) goto L1cf
            goto L1df
        L1cf:
            if (r14 <= 0) goto L1d3
            if (r4 == 0) goto L1db
        L1d3:
            int r3 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r3 >= 0) goto L1e2
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r3 != 0) goto L1e2
        L1db:
            r0.setState(r1)
            goto L1e2
        L1df:
            r23.invalidate()
        L1e2:
            boolean r1 = r0.f1545X0
            if (r1 != 0) goto L1ee
            boolean r1 = r0.f1530I0
            if (r1 == 0) goto L1ee
            if (r14 <= 0) goto L1ee
            if (r4 == 0) goto L1f6
        L1ee:
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 >= 0) goto L1f9
            int r1 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r1 != 0) goto L1f9
        L1f6:
            r23.m879y()
        L1f9:
            float r1 = r0.f1526E0
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L20d
            int r1 = r0.f1573v0
            int r2 = r0.f1575w0
            if (r1 == r2) goto L208
            goto L209
        L208:
            r7 = r8
        L209:
            r0.f1573v0 = r2
            r8 = r7
            goto L218
        L20d:
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L218
            int r1 = r0.f1573v0
            int r2 = r0.f1571u0
            if (r1 == r2) goto L208
            goto L209
        L218:
            boolean r1 = r0.f1570t1
            r1 = r1 | r8
            r0.f1570t1 = r1
            if (r8 == 0) goto L226
            boolean r1 = r0.f1563p1
            if (r1 != 0) goto L226
            r23.requestLayout()
        L226:
            float r1 = r0.f1526E0
            r0.f1525D0 = r1
            return
    }

    @Override // android.view.View
    public java.lang.String toString() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r3.f1571u0
            java.lang.String r2 = p346u.C6256a.m12871b(r0, r2)
            r1.append(r2)
            java.lang.String r2 = "->"
            r1.append(r2)
            int r2 = r3.f1575w0
            java.lang.String r0 = p346u.C6256a.m12871b(r0, r2)
            r1.append(r0)
            java.lang.String r0 = " (pos:"
            r1.append(r0)
            float r0 = r3.f1526E0
            r1.append(r0)
            java.lang.String r0 = " Dpos/Dt:"
            r1.append(r0)
            float r0 = r3.f1569t0
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    /* renamed from: u */
    public final void m875u() {
            r5 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$h r0 = r5.f1531J0
            if (r0 != 0) goto Le
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$h> r0 = r5.f1548a1
            if (r0 == 0) goto L71
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L71
        Le:
            float r0 = r5.f1553f1
            float r1 = r5.f1525D0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L71
            int r0 = r5.f1552e1
            r1 = -1
            if (r0 == r1) goto L42
            androidx.constraintlayout.motion.widget.MotionLayout$h r0 = r5.f1531J0
            if (r0 == 0) goto L26
            int r2 = r5.f1571u0
            int r3 = r5.f1575w0
            r0.mo897b(r5, r2, r3)
        L26:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$h> r0 = r5.f1548a1
            if (r0 == 0) goto L42
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.motion.widget.MotionLayout$h r2 = (androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0325h) r2
            int r3 = r5.f1571u0
            int r4 = r5.f1575w0
            r2.mo897b(r5, r3, r4)
            goto L2e
        L42:
            r5.f1552e1 = r1
            float r0 = r5.f1525D0
            r5.f1553f1 = r0
            androidx.constraintlayout.motion.widget.MotionLayout$h r1 = r5.f1531J0
            if (r1 == 0) goto L53
            int r2 = r5.f1571u0
            int r3 = r5.f1575w0
            r1.mo896a(r5, r2, r3, r0)
        L53:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$h> r0 = r5.f1548a1
            if (r0 == 0) goto L71
            java.util.Iterator r0 = r0.iterator()
        L5b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionLayout$h r1 = (androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0325h) r1
            int r2 = r5.f1571u0
            int r3 = r5.f1575w0
            float r4 = r5.f1525D0
            r1.mo896a(r5, r2, r3, r4)
            goto L5b
        L71:
            return
    }

    /* renamed from: v */
    public void m876v() {
            r3 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$h r0 = r3.f1531J0
            if (r0 != 0) goto Le
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$h> r0 = r3.f1548a1
            if (r0 == 0) goto L42
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L42
        Le:
            int r0 = r3.f1552e1
            r1 = -1
            if (r0 != r1) goto L42
            int r0 = r3.f1573v0
            r3.f1552e1 = r0
            java.util.ArrayList<java.lang.Integer> r0 = r3.f1576w1
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L32
            java.util.ArrayList<java.lang.Integer> r0 = r3.f1576w1
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L33
        L32:
            r0 = -1
        L33:
            int r2 = r3.f1573v0
            if (r0 == r2) goto L42
            if (r2 == r1) goto L42
            java.util.ArrayList<java.lang.Integer> r0 = r3.f1576w1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.add(r1)
        L42:
            r3.m880z()
            return
    }

    /* renamed from: w */
    public void m877w(int r14, float r15, float r16, float r17, float[] r18) {
            r13 = this;
            r0 = r13
            r1 = r14
            java.util.HashMap<android.view.View, u.o> r2 = r0.f1522A0
            android.util.SparseArray<android.view.View> r3 = r0.f1688a0
            java.lang.Object r3 = r3.get(r14)
            r8 = r3
            android.view.View r8 = (android.view.View) r8
            java.lang.Object r2 = r2.get(r8)
            u.o r2 = (p346u.C6270o) r2
            if (r2 == 0) goto Laf
            float[] r1 = r2.f24387t
            r3 = r15
            float r1 = r2.m12889a(r15, r1)
            t.b[] r3 = r2.f24375h
            r4 = 0
            if (r3 == 0) goto L7c
            r3 = r3[r4]
            double r5 = (double) r1
            double[] r1 = r2.f24382o
            r3.mo12534e(r5, r1)
            t.b[] r1 = r2.f24375h
            r1 = r1[r4]
            double[] r3 = r2.f24381n
            r1.mo12532c(r5, r3)
            float[] r1 = r2.f24387t
            r1 = r1[r4]
        L36:
            double[] r7 = r2.f24382o
            int r3 = r7.length
            if (r4 >= r3) goto L45
            r9 = r7[r4]
            double r11 = (double) r1
            double r9 = r9 * r11
            r7[r4] = r9
            int r4 = r4 + 1
            goto L36
        L45:
            t.b r1 = r2.f24376i
            if (r1 == 0) goto L6a
            double[] r3 = r2.f24381n
            int r4 = r3.length
            if (r4 <= 0) goto Lab
            r1.mo12532c(r5, r3)
            t.b r1 = r2.f24376i
            double[] r3 = r2.f24382o
            r1.mo12534e(r5, r3)
            u.q r1 = r2.f24371d
            int[] r5 = r2.f24380m
            double[] r6 = r2.f24382o
            double[] r7 = r2.f24381n
            r2 = r16
            r3 = r17
            r4 = r18
            r1.m12898l(r2, r3, r4, r5, r6, r7)
            goto Lab
        L6a:
            u.q r1 = r2.f24371d
            int[] r5 = r2.f24380m
            double[] r9 = r2.f24381n
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r7
            r7 = r9
            r1.m12898l(r2, r3, r4, r5, r6, r7)
            goto Lab
        L7c:
            u.q r1 = r2.f24372e
            float r3 = r1.f24399c0
            u.q r2 = r2.f24371d
            float r5 = r2.f24399c0
            float r3 = r3 - r5
            float r5 = r1.f24400d0
            float r6 = r2.f24400d0
            float r5 = r5 - r6
            float r6 = r1.f24401e0
            float r7 = r2.f24401e0
            float r6 = r6 - r7
            float r1 = r1.f24402f0
            float r2 = r2.f24402f0
            float r1 = r1 - r2
            float r6 = r6 + r3
            float r1 = r1 + r5
            r2 = 1065353216(0x3f800000, float:1.0)
            float r7 = r2 - r16
            float r7 = r7 * r3
            float r6 = r6 * r16
            float r6 = r6 + r7
            r18[r4] = r6
            float r2 = r2 - r17
            float r2 = r2 * r5
            float r1 = r1 * r17
            float r1 = r1 + r2
            r2 = 1
            r18[r2] = r1
        Lab:
            r8.getY()
            goto Lda
        Laf:
            if (r8 != 0) goto Lb8
            java.lang.String r2 = ""
            java.lang.String r1 = android.support.v4.media.C0142a.m254a(r2, r14)
            goto Lc4
        Lb8:
            android.content.Context r2 = r8.getContext()
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r1 = r2.getResourceName(r14)
        Lc4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "WARNING could not find view id "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MotionLayout"
            android.util.Log.w(r2, r1)
        Lda:
            return
    }

    /* renamed from: x */
    public final boolean m878x(float r9, float r10, android.view.View r11, android.view.MotionEvent r12) {
            r8 = this;
            boolean r0 = r11 instanceof android.view.ViewGroup
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2a
            r0 = r11
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r0.getChildCount()
            r4 = 0
        Le:
            if (r4 >= r3) goto L2a
            android.view.View r5 = r0.getChildAt(r4)
            int r6 = r11.getLeft()
            float r6 = (float) r6
            float r6 = r6 + r9
            int r7 = r11.getTop()
            float r7 = (float) r7
            float r7 = r7 + r10
            boolean r5 = r8.m878x(r6, r7, r5, r12)
            if (r5 == 0) goto L27
            return r2
        L27:
            int r4 = r4 + 1
            goto Le
        L2a:
            android.graphics.RectF r0 = r8.f1572u1
            int r3 = r11.getLeft()
            float r3 = (float) r3
            float r3 = r3 + r9
            int r4 = r11.getTop()
            float r4 = (float) r4
            float r4 = r4 + r10
            int r5 = r11.getRight()
            float r5 = (float) r5
            float r9 = r9 + r5
            int r5 = r11.getBottom()
            float r5 = (float) r5
            float r10 = r10 + r5
            r0.set(r3, r4, r9, r10)
            int r9 = r12.getAction()
            if (r9 != 0) goto L64
            android.graphics.RectF r9 = r8.f1572u1
            float r10 = r12.getX()
            float r0 = r12.getY()
            boolean r9 = r9.contains(r10, r0)
            if (r9 == 0) goto L6b
            boolean r9 = r11.onTouchEvent(r12)
            if (r9 == 0) goto L6b
            return r2
        L64:
            boolean r9 = r11.onTouchEvent(r12)
            if (r9 == 0) goto L6b
            return r2
        L6b:
            return r1
    }

    /* renamed from: y */
    public void m879y() {
            r7 = this;
            androidx.constraintlayout.motion.widget.b r0 = r7.f1565r0
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r7.f1573v0
            boolean r0 = r0.m901a(r7, r1)
            if (r0 == 0) goto L11
            r7.requestLayout()
            return
        L11:
            int r0 = r7.f1573v0
            r1 = -1
            if (r0 == r1) goto Ld8
            androidx.constraintlayout.motion.widget.b r2 = r7.f1565r0
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r3 = r2.f1625d
            java.util.Iterator r3 = r3.iterator()
        L1e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.b$b r4 = (androidx.constraintlayout.motion.widget.C0328b.b) r4
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b$a> r5 = r4.f1653m
            int r5 = r5.size()
            if (r5 <= 0) goto L1e
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b$a> r4 = r4.f1653m
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1e
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.motion.widget.b$b$a r5 = (androidx.constraintlayout.motion.widget.C0328b.b.a) r5
            r5.m916b(r7)
            goto L38
        L48:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r3 = r2.f1627f
            java.util.Iterator r3 = r3.iterator()
        L4e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L78
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.b$b r4 = (androidx.constraintlayout.motion.widget.C0328b.b) r4
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b$a> r5 = r4.f1653m
            int r5 = r5.size()
            if (r5 <= 0) goto L4e
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b$a> r4 = r4.f1653m
            java.util.Iterator r4 = r4.iterator()
        L68:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.motion.widget.b$b$a r5 = (androidx.constraintlayout.motion.widget.C0328b.b.a) r5
            r5.m916b(r7)
            goto L68
        L78:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r3 = r2.f1625d
            java.util.Iterator r3 = r3.iterator()
        L7e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La8
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.b$b r4 = (androidx.constraintlayout.motion.widget.C0328b.b) r4
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b$a> r5 = r4.f1653m
            int r5 = r5.size()
            if (r5 <= 0) goto L7e
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b$a> r5 = r4.f1653m
            java.util.Iterator r5 = r5.iterator()
        L98:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.motion.widget.b$b$a r6 = (androidx.constraintlayout.motion.widget.C0328b.b.a) r6
            r6.m915a(r7, r0, r4)
            goto L98
        La8:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r2 = r2.f1627f
            java.util.Iterator r2 = r2.iterator()
        Lae:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Ld8
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.b$b r3 = (androidx.constraintlayout.motion.widget.C0328b.b) r3
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b$a> r4 = r3.f1653m
            int r4 = r4.size()
            if (r4 <= 0) goto Lae
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b$a> r4 = r3.f1653m
            java.util.Iterator r4 = r4.iterator()
        Lc8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lae
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.motion.widget.b$b$a r5 = (androidx.constraintlayout.motion.widget.C0328b.b.a) r5
            r5.m915a(r7, r0, r3)
            goto Lc8
        Ld8:
            androidx.constraintlayout.motion.widget.b r0 = r7.f1565r0
            boolean r0 = r0.m914n()
            if (r0 == 0) goto L12c
            androidx.constraintlayout.motion.widget.b r0 = r7.f1565r0
            androidx.constraintlayout.motion.widget.b$b r0 = r0.f1624c
            if (r0 == 0) goto L12c
            androidx.constraintlayout.motion.widget.c r0 = r0.f1652l
            if (r0 == 0) goto L12c
            int r2 = r0.f1667d
            if (r2 == r1) goto L115
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f1678o
            android.view.View r1 = r1.findViewById(r2)
            if (r1 != 0) goto L116
            java.lang.String r2 = "cannot find TouchAnchorId @id/"
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f1678o
            android.content.Context r3 = r3.getContext()
            int r4 = r0.f1667d
            java.lang.String r3 = p346u.C6256a.m12871b(r3, r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "TouchResponse"
            android.util.Log.e(r3, r2)
            goto L116
        L115:
            r1 = 0
        L116:
            boolean r2 = r1 instanceof androidx.core.widget.NestedScrollView
            if (r2 == 0) goto L12c
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            u.t r2 = new u.t
            r2.<init>(r0)
            r1.setOnTouchListener(r2)
            u.u r2 = new u.u
            r2.<init>(r0)
            r1.setOnScrollChangeListener(r2)
        L12c:
            return
    }

    /* renamed from: z */
    public final void m880z() {
            r5 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$h r0 = r5.f1531J0
            if (r0 != 0) goto Lf
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$h> r0 = r5.f1548a1
            if (r0 == 0) goto Le
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
        Le:
            return
        Lf:
            java.util.ArrayList<java.lang.Integer> r0 = r5.f1576w1
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            androidx.constraintlayout.motion.widget.MotionLayout$h r2 = r5.f1531J0
            if (r2 == 0) goto L2c
            int r3 = r1.intValue()
            r2.mo899d(r5, r3)
        L2c:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$h> r2 = r5.f1548a1
            if (r2 == 0) goto L15
            java.util.Iterator r2 = r2.iterator()
        L34:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L15
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.MotionLayout$h r3 = (androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0325h) r3
            int r4 = r1.intValue()
            r3.mo899d(r5, r4)
            goto L34
        L48:
            java.util.ArrayList<java.lang.Integer> r0 = r5.f1576w1
            r0.clear()
            return
    }
}
