package p303r3;

/* renamed from: r3.d */
/* loaded from: classes.dex */
public class C5774d extends p366v0.AbstractC6484c {

    /* renamed from: b */
    public android.graphics.Paint f22258b;

    /* renamed from: c */
    public android.graphics.Paint f22259c;

    /* renamed from: d */
    public p181k3.C3681e f22260d;

    /* renamed from: e */
    public java.util.List<p181k3.C3682f> f22261e;

    /* renamed from: f */
    public android.graphics.Paint.FontMetrics f22262f;

    /* renamed from: g */
    public android.graphics.Path f22263g;

    public C5774d(p323s3.C5953g r2, p181k3.C3681e r3) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 16
            r2.<init>(r0)
            r1.f22261e = r2
            android.graphics.Paint$FontMetrics r2 = new android.graphics.Paint$FontMetrics
            r2.<init>()
            r1.f22262f = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r1.f22263g = r2
            r1.f22260d = r3
            android.graphics.Paint r2 = new android.graphics.Paint
            r3 = 1
            r2.<init>(r3)
            r1.f22258b = r2
            r0 = 1091567616(0x41100000, float:9.0)
            float r0 = p323s3.AbstractC5952f.m12377d(r0)
            r2.setTextSize(r0)
            android.graphics.Paint r2 = r1.f22258b
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.LEFT
            r2.setTextAlign(r0)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r3)
            r1.f22259c = r2
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            return
    }

    /* renamed from: m */
    public void m12098m(android.graphics.Canvas r13, float r14, float r15, p181k3.C3682f r16, p181k3.C3681e r17) {
            r12 = this;
            r0 = r12
            r7 = r13
            r2 = r14
            r1 = r15
            r3 = r16
            r4 = r17
            int r5 = r3.f16300f
            r6 = 1122868(0x112234, float:1.573473E-39)
            if (r5 == r6) goto Lb6
            r6 = 1122867(0x112233, float:1.573472E-39)
            if (r5 == r6) goto Lb6
            if (r5 != 0) goto L18
            goto Lb6
        L18:
            int r8 = r13.save()
            int r5 = r3.f16296b
            r6 = 3
            if (r5 != r6) goto L23
            int r5 = r4.f16283k
        L23:
            android.graphics.Paint r9 = r0.f22259c
            int r10 = r3.f16300f
            r9.setColor(r10)
            float r9 = r3.f16297c
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 == 0) goto L35
            float r9 = r4.f16284l
            goto L37
        L35:
            float r9 = r3.f16297c
        L37:
            float r9 = p323s3.AbstractC5952f.m12377d(r9)
            r10 = 1073741824(0x40000000, float:2.0)
            float r10 = r9 / r10
            int r5 = p365v.C6480g.m13148b(r5)
            r11 = 2
            if (r5 == r11) goto La6
            if (r5 == r6) goto L91
            r6 = 4
            if (r5 == r6) goto La6
            r6 = 5
            if (r5 == r6) goto L4f
            goto Lb3
        L4f:
            float r5 = r3.f16298d
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L5a
            float r5 = r4.f16285m
            goto L5c
        L5a:
            float r5 = r3.f16298d
        L5c:
            float r5 = p323s3.AbstractC5952f.m12377d(r5)
            android.graphics.DashPathEffect r3 = r3.f16299e
            if (r3 != 0) goto L68
            java.util.Objects.requireNonNull(r17)
            r3 = 0
        L68:
            android.graphics.Paint r4 = r0.f22259c
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r4.setStyle(r6)
            android.graphics.Paint r4 = r0.f22259c
            r4.setStrokeWidth(r5)
            android.graphics.Paint r4 = r0.f22259c
            r4.setPathEffect(r3)
            android.graphics.Path r3 = r0.f22263g
            r3.reset()
            android.graphics.Path r3 = r0.f22263g
            r3.moveTo(r14, r15)
            android.graphics.Path r3 = r0.f22263g
            float r2 = r2 + r9
            r3.lineTo(r2, r15)
            android.graphics.Path r1 = r0.f22263g
            android.graphics.Paint r2 = r0.f22259c
            r13.drawPath(r1, r2)
            goto Lb3
        L91:
            android.graphics.Paint r3 = r0.f22259c
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r3.setStyle(r4)
            float r3 = r1 - r10
            float r4 = r2 + r9
            float r5 = r1 + r10
            android.graphics.Paint r6 = r0.f22259c
            r1 = r13
            r2 = r14
            r1.drawRect(r2, r3, r4, r5, r6)
            goto Lb3
        La6:
            android.graphics.Paint r3 = r0.f22259c
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r3.setStyle(r4)
            float r2 = r2 + r10
            android.graphics.Paint r3 = r0.f22259c
            r13.drawCircle(r2, r15, r10, r3)
        Lb3:
            r13.restoreToCount(r8)
        Lb6:
            return
    }
}
