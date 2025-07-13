package p340t8;

/* renamed from: t8.j */
/* loaded from: classes.dex */
public class C6193j {

    /* renamed from: a */
    public final p340t8.C6195l[] f24106a;

    /* renamed from: b */
    public final android.graphics.Matrix[] f24107b;

    /* renamed from: c */
    public final android.graphics.Matrix[] f24108c;

    /* renamed from: d */
    public final android.graphics.PointF f24109d;

    /* renamed from: e */
    public final android.graphics.Path f24110e;

    /* renamed from: f */
    public final android.graphics.Path f24111f;

    /* renamed from: g */
    public final p340t8.C6195l f24112g;

    /* renamed from: h */
    public final float[] f24113h;

    /* renamed from: i */
    public final float[] f24114i;

    /* renamed from: j */
    public final android.graphics.Path f24115j;

    /* renamed from: k */
    public final android.graphics.Path f24116k;

    /* renamed from: l */
    public boolean f24117l;

    /* renamed from: t8.j$a */
    public static class a {

        /* renamed from: a */
        public static final p340t8.C6193j f24118a = null;

        static {
                t8.j r0 = new t8.j
                r0.<init>()
                p340t8.C6193j.a.f24118a = r0
                return
        }
    }

    /* renamed from: t8.j$b */
    public interface b {
    }

    public C6193j() {
            r4 = this;
            r4.<init>()
            r0 = 4
            t8.l[] r1 = new p340t8.C6195l[r0]
            r4.f24106a = r1
            android.graphics.Matrix[] r1 = new android.graphics.Matrix[r0]
            r4.f24107b = r1
            android.graphics.Matrix[] r1 = new android.graphics.Matrix[r0]
            r4.f24108c = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            r4.f24109d = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.f24110e = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.f24111f = r1
            t8.l r1 = new t8.l
            r1.<init>()
            r4.f24112g = r1
            r1 = 2
            float[] r2 = new float[r1]
            r4.f24113h = r2
            float[] r1 = new float[r1]
            r4.f24114i = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.f24115j = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.f24116k = r1
            r1 = 1
            r4.f24117l = r1
            r1 = 0
        L47:
            if (r1 >= r0) goto L67
            t8.l[] r2 = r4.f24106a
            t8.l r3 = new t8.l
            r3.<init>()
            r2[r1] = r3
            android.graphics.Matrix[] r2 = r4.f24107b
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r2[r1] = r3
            android.graphics.Matrix[] r2 = r4.f24108c
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L47
        L67:
            return
    }

    /* renamed from: a */
    public void m12794a(p340t8.C6192i r18, float r19, android.graphics.RectF r20, p340t8.C6193j.b r21, android.graphics.Path r22) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r22
            r22.rewind()
            android.graphics.Path r5 = r0.f24110e
            r5.rewind()
            android.graphics.Path r5 = r0.f24111f
            r5.rewind()
            android.graphics.Path r5 = r0.f24111f
            android.graphics.Path$Direction r6 = android.graphics.Path.Direction.CW
            r5.addRect(r3, r6)
            r5 = 0
            r6 = 0
        L20:
            r7 = 2
            r8 = 3
            r9 = 4
            r10 = 1
            if (r6 >= r9) goto Lc7
            if (r6 == r10) goto L35
            if (r6 == r7) goto L32
            if (r6 == r8) goto L2f
            t8.c r9 = r1.f24087f
            goto L37
        L2f:
            t8.c r9 = r1.f24086e
            goto L37
        L32:
            t8.c r9 = r1.f24089h
            goto L37
        L35:
            t8.c r9 = r1.f24088g
        L37:
            if (r6 == r10) goto L46
            if (r6 == r7) goto L43
            if (r6 == r8) goto L40
            y.e r11 = r1.f24083b
            goto L48
        L40:
            y.e r11 = r1.f24082a
            goto L48
        L43:
            y.e r11 = r1.f24085d
            goto L48
        L46:
            y.e r11 = r1.f24084c
        L48:
            t8.l[] r12 = r0.f24106a
            r12 = r12[r6]
            r13 = 1119092736(0x42b40000, float:90.0)
            java.util.Objects.requireNonNull(r11)
            float r9 = r9.mo12753a(r3)
            r11.mo12754f(r12, r13, r2, r9)
            int r9 = r6 + 1
            int r11 = r9 * 90
            float r11 = (float) r11
            android.graphics.Matrix[] r12 = r0.f24107b
            r12 = r12[r6]
            r12.reset()
            android.graphics.PointF r12 = r0.f24109d
            if (r6 == r10) goto L77
            if (r6 == r7) goto L74
            if (r6 == r8) goto L6f
            float r7 = r3.right
            goto L71
        L6f:
            float r7 = r3.left
        L71:
            float r8 = r3.top
            goto L7b
        L74:
            float r7 = r3.left
            goto L79
        L77:
            float r7 = r3.right
        L79:
            float r8 = r3.bottom
        L7b:
            r12.set(r7, r8)
            android.graphics.Matrix[] r7 = r0.f24107b
            r7 = r7[r6]
            android.graphics.PointF r8 = r0.f24109d
            float r12 = r8.x
            float r8 = r8.y
            r7.setTranslate(r12, r8)
            android.graphics.Matrix[] r7 = r0.f24107b
            r7 = r7[r6]
            r7.preRotate(r11)
            float[] r7 = r0.f24113h
            t8.l[] r8 = r0.f24106a
            r12 = r8[r6]
            float r12 = r12.f24123c
            r7[r5] = r12
            r8 = r8[r6]
            float r8 = r8.f24124d
            r7[r10] = r8
            android.graphics.Matrix[] r8 = r0.f24107b
            r8 = r8[r6]
            r8.mapPoints(r7)
            android.graphics.Matrix[] r7 = r0.f24108c
            r7 = r7[r6]
            r7.reset()
            android.graphics.Matrix[] r7 = r0.f24108c
            r7 = r7[r6]
            float[] r8 = r0.f24113h
            r12 = r8[r5]
            r8 = r8[r10]
            r7.setTranslate(r12, r8)
            android.graphics.Matrix[] r7 = r0.f24108c
            r6 = r7[r6]
            r6.preRotate(r11)
            r6 = r9
            goto L20
        Lc7:
            r6 = 0
        Lc8:
            if (r6 >= r9) goto L26f
            float[] r11 = r0.f24113h
            t8.l[] r12 = r0.f24106a
            r13 = r12[r6]
            float r13 = r13.f24121a
            r11[r5] = r13
            r12 = r12[r6]
            float r12 = r12.f24122b
            r11[r10] = r12
            android.graphics.Matrix[] r12 = r0.f24107b
            r12 = r12[r6]
            r12.mapPoints(r11)
            float[] r11 = r0.f24113h
            if (r6 != 0) goto Led
            r12 = r11[r5]
            r11 = r11[r10]
            r4.moveTo(r12, r11)
            goto Lf4
        Led:
            r12 = r11[r5]
            r11 = r11[r10]
            r4.lineTo(r12, r11)
        Lf4:
            t8.l[] r11 = r0.f24106a
            r11 = r11[r6]
            android.graphics.Matrix[] r12 = r0.f24107b
            r12 = r12[r6]
            r11.m12799c(r12, r4)
            if (r21 == 0) goto L133
            t8.l[] r11 = r0.f24106a
            r11 = r11[r6]
            android.graphics.Matrix[] r12 = r0.f24107b
            r12 = r12[r6]
            r13 = r21
            t8.f$a r13 = (p340t8.C6189f.a) r13
            t8.f r14 = r13.f24058a
            java.util.BitSet r14 = r14.f24039b0
            java.util.Objects.requireNonNull(r11)
            r14.set(r6, r5)
            t8.f r13 = r13.f24058a
            t8.l$f[] r13 = r13.f24037Z
            float r14 = r11.f24126f
            r11.m12798b(r14)
            android.graphics.Matrix r14 = new android.graphics.Matrix
            r14.<init>(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            java.util.List<t8.l$f> r15 = r11.f24128h
            r12.<init>(r15)
            t8.k r15 = new t8.k
            r15.<init>(r11, r12, r14)
            r13[r6] = r15
        L133:
            int r11 = r6 + 1
            int r12 = r11 % 4
            float[] r13 = r0.f24113h
            t8.l[] r14 = r0.f24106a
            r15 = r14[r6]
            float r15 = r15.f24123c
            r13[r5] = r15
            r14 = r14[r6]
            float r14 = r14.f24124d
            r13[r10] = r14
            android.graphics.Matrix[] r14 = r0.f24107b
            r14 = r14[r6]
            r14.mapPoints(r13)
            float[] r13 = r0.f24114i
            t8.l[] r14 = r0.f24106a
            r15 = r14[r12]
            float r15 = r15.f24121a
            r13[r5] = r15
            r14 = r14[r12]
            float r14 = r14.f24122b
            r13[r10] = r14
            android.graphics.Matrix[] r14 = r0.f24107b
            r14 = r14[r12]
            r14.mapPoints(r13)
            float[] r13 = r0.f24113h
            r14 = r13[r5]
            float[] r15 = r0.f24114i
            r16 = r15[r5]
            float r14 = r14 - r16
            double r7 = (double) r14
            r13 = r13[r10]
            r14 = r15[r10]
            float r13 = r13 - r14
            double r13 = (double) r13
            double r7 = java.lang.Math.hypot(r7, r13)
            float r7 = (float) r7
            r8 = 981668463(0x3a83126f, float:0.001)
            float r7 = r7 - r8
            r8 = 0
            float r7 = java.lang.Math.max(r7, r8)
            float[] r13 = r0.f24113h
            t8.l[] r14 = r0.f24106a
            r15 = r14[r6]
            float r15 = r15.f24123c
            r13[r5] = r15
            r14 = r14[r6]
            float r14 = r14.f24124d
            r13[r10] = r14
            android.graphics.Matrix[] r14 = r0.f24107b
            r14 = r14[r6]
            r14.mapPoints(r13)
            if (r6 == r10) goto L1a9
            r13 = 3
            if (r6 == r13) goto L1a9
            float r13 = r20.centerY()
            float[] r14 = r0.f24113h
            r14 = r14[r10]
            goto L1b1
        L1a9:
            float r13 = r20.centerX()
            float[] r14 = r0.f24113h
            r14 = r14[r5]
        L1b1:
            float r13 = r13 - r14
            float r13 = java.lang.Math.abs(r13)
            t8.l r14 = r0.f24112g
            r15 = 1132920832(0x43870000, float:270.0)
            r14.m12801e(r8, r8, r15, r8)
            if (r6 == r10) goto L1cf
            r8 = 2
            if (r6 == r8) goto L1cb
            r14 = 3
            if (r6 == r14) goto L1c8
            t8.e r15 = r1.f24091j
            goto L1d3
        L1c8:
            t8.e r15 = r1.f24090i
            goto L1d3
        L1cb:
            r14 = 3
            t8.e r15 = r1.f24093l
            goto L1d3
        L1cf:
            r8 = 2
            r14 = 3
            t8.e r15 = r1.f24092k
        L1d3:
            t8.l r8 = r0.f24112g
            r15.m12756b(r7, r13, r2, r8)
            android.graphics.Path r7 = r0.f24115j
            r7.reset()
            t8.l r7 = r0.f24112g
            android.graphics.Matrix[] r8 = r0.f24108c
            r8 = r8[r6]
            android.graphics.Path r13 = r0.f24115j
            r7.m12799c(r8, r13)
            boolean r7 = r0.f24117l
            if (r7 == 0) goto L22c
            android.graphics.Path r7 = r0.f24115j
            boolean r7 = r0.m12795b(r7, r6)
            if (r7 != 0) goto L1fc
            android.graphics.Path r7 = r0.f24115j
            boolean r7 = r0.m12795b(r7, r12)
            if (r7 == 0) goto L22c
        L1fc:
            android.graphics.Path r7 = r0.f24115j
            android.graphics.Path r8 = r0.f24111f
            android.graphics.Path$Op r12 = android.graphics.Path.Op.DIFFERENCE
            r7.op(r7, r8, r12)
            float[] r7 = r0.f24113h
            t8.l r8 = r0.f24112g
            float r12 = r8.f24121a
            r7[r5] = r12
            float r8 = r8.f24122b
            r7[r10] = r8
            android.graphics.Matrix[] r8 = r0.f24108c
            r8 = r8[r6]
            r8.mapPoints(r7)
            android.graphics.Path r7 = r0.f24110e
            float[] r8 = r0.f24113h
            r12 = r8[r5]
            r8 = r8[r10]
            r7.moveTo(r12, r8)
            t8.l r7 = r0.f24112g
            android.graphics.Matrix[] r8 = r0.f24108c
            r8 = r8[r6]
            android.graphics.Path r12 = r0.f24110e
            goto L233
        L22c:
            t8.l r7 = r0.f24112g
            android.graphics.Matrix[] r8 = r0.f24108c
            r8 = r8[r6]
            r12 = r4
        L233:
            r7.m12799c(r8, r12)
            if (r21 == 0) goto L26a
            t8.l r7 = r0.f24112g
            android.graphics.Matrix[] r8 = r0.f24108c
            r8 = r8[r6]
            r12 = r21
            t8.f$a r12 = (p340t8.C6189f.a) r12
            t8.f r13 = r12.f24058a
            java.util.BitSet r13 = r13.f24039b0
            int r15 = r6 + 4
            java.util.Objects.requireNonNull(r7)
            r13.set(r15, r5)
            t8.f r12 = r12.f24058a
            t8.l$f[] r12 = r12.f24038a0
            float r13 = r7.f24126f
            r7.m12798b(r13)
            android.graphics.Matrix r13 = new android.graphics.Matrix
            r13.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.List<t8.l$f> r15 = r7.f24128h
            r8.<init>(r15)
            t8.k r15 = new t8.k
            r15.<init>(r7, r8, r13)
            r12[r6] = r15
        L26a:
            r6 = r11
            r7 = 2
            r8 = 3
            goto Lc8
        L26f:
            r22.close()
            android.graphics.Path r1 = r0.f24110e
            r1.close()
            android.graphics.Path r1 = r0.f24110e
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L286
            android.graphics.Path r1 = r0.f24110e
            android.graphics.Path$Op r2 = android.graphics.Path.Op.UNION
            r4.op(r1, r2)
        L286:
            return
    }

    /* renamed from: b */
    public final boolean m12795b(android.graphics.Path r4, int r5) {
            r3 = this;
            android.graphics.Path r0 = r3.f24116k
            r0.reset()
            t8.l[] r0 = r3.f24106a
            r0 = r0[r5]
            android.graphics.Matrix[] r1 = r3.f24107b
            r5 = r1[r5]
            android.graphics.Path r1 = r3.f24116k
            r0.m12799c(r5, r1)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r0 = 1
            r4.computeBounds(r5, r0)
            android.graphics.Path r1 = r3.f24116k
            r1.computeBounds(r5, r0)
            android.graphics.Path r1 = r3.f24116k
            android.graphics.Path$Op r2 = android.graphics.Path.Op.INTERSECT
            r4.op(r1, r2)
            r4.computeBounds(r5, r0)
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L44
            float r4 = r5.width()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L43
            float r4 = r5.height()
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L43
            goto L44
        L43:
            r0 = 0
        L44:
            return r0
    }
}
