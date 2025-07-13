package androidx.constraintlayout.motion.widget;

/* renamed from: androidx.constraintlayout.motion.widget.c */
/* loaded from: classes.dex */
public class C0329c {

    /* renamed from: v */
    public static final float[][] f1662v = null;

    /* renamed from: w */
    public static final float[][] f1663w = null;

    /* renamed from: a */
    public int f1664a;

    /* renamed from: b */
    public int f1665b;

    /* renamed from: c */
    public int f1666c;

    /* renamed from: d */
    public int f1667d;

    /* renamed from: e */
    public int f1668e;

    /* renamed from: f */
    public int f1669f;

    /* renamed from: g */
    public float f1670g;

    /* renamed from: h */
    public float f1671h;

    /* renamed from: i */
    public float f1672i;

    /* renamed from: j */
    public float f1673j;

    /* renamed from: k */
    public boolean f1674k;

    /* renamed from: l */
    public float[] f1675l;

    /* renamed from: m */
    public float f1676m;

    /* renamed from: n */
    public float f1677n;

    /* renamed from: o */
    public final androidx.constraintlayout.motion.widget.MotionLayout f1678o;

    /* renamed from: p */
    public float f1679p;

    /* renamed from: q */
    public float f1680q;

    /* renamed from: r */
    public boolean f1681r;

    /* renamed from: s */
    public float f1682s;

    /* renamed from: t */
    public int f1683t;

    /* renamed from: u */
    public float f1684u;

    static {
            r0 = 7
            float[][] r0 = new float[r0][]
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x006c: FILL_ARRAY_DATA , data: [1056964608, 0} // fill-array
            r3 = 0
            r0[r3] = r2
            float[] r2 = new float[r1]
            r2 = {x0074: FILL_ARRAY_DATA , data: [0, 1056964608} // fill-array
            r4 = 1
            r0[r4] = r2
            float[] r2 = new float[r1]
            r2 = {x007c: FILL_ARRAY_DATA , data: [1065353216, 1056964608} // fill-array
            r0[r1] = r2
            float[] r2 = new float[r1]
            r2 = {x0084: FILL_ARRAY_DATA , data: [1056964608, 1065353216} // fill-array
            r5 = 3
            r0[r5] = r2
            float[] r2 = new float[r1]
            r2 = {x008c: FILL_ARRAY_DATA , data: [1056964608, 1056964608} // fill-array
            r6 = 4
            r0[r6] = r2
            float[] r2 = new float[r1]
            r2 = {x0094: FILL_ARRAY_DATA , data: [0, 1056964608} // fill-array
            r7 = 5
            r0[r7] = r2
            float[] r2 = new float[r1]
            r2 = {x009c: FILL_ARRAY_DATA , data: [1065353216, 1056964608} // fill-array
            r8 = 6
            r0[r8] = r2
            androidx.constraintlayout.motion.widget.C0329c.f1662v = r0
            float[][] r0 = new float[r8][]
            float[] r2 = new float[r1]
            r2 = {x00a4: FILL_ARRAY_DATA , data: [0, -1082130432} // fill-array
            r0[r3] = r2
            float[] r2 = new float[r1]
            r2 = {x00ac: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            r0[r4] = r2
            float[] r2 = new float[r1]
            r2 = {x00b4: FILL_ARRAY_DATA , data: [-1082130432, 0} // fill-array
            r0[r1] = r2
            float[] r2 = new float[r1]
            r2 = {x00bc: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            r0[r5] = r2
            float[] r2 = new float[r1]
            r2 = {x00c4: FILL_ARRAY_DATA , data: [-1082130432, 0} // fill-array
            r0[r6] = r2
            float[] r1 = new float[r1]
            r1 = {x00cc: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            r0[r7] = r1
            androidx.constraintlayout.motion.widget.C0329c.f1663w = r0
            return
    }

    public C0329c(android.content.Context r7, androidx.constraintlayout.motion.widget.MotionLayout r8, org.xmlpull.v1.XmlPullParser r9) {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f1664a = r0
            r6.f1665b = r0
            r6.f1666c = r0
            r1 = -1
            r6.f1667d = r1
            r6.f1668e = r1
            r6.f1669f = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r6.f1670g = r1
            r6.f1671h = r1
            r1 = 0
            r6.f1672i = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r6.f1673j = r1
            r6.f1674k = r0
            r2 = 2
            float[] r3 = new float[r2]
            r6.f1675l = r3
            r3 = 1082130432(0x40800000, float:4.0)
            r6.f1679p = r3
            r3 = 1067030938(0x3f99999a, float:1.2)
            r6.f1680q = r3
            r3 = 1
            r6.f1681r = r3
            r6.f1682s = r1
            r6.f1683t = r0
            r1 = 1092616192(0x41200000, float:10.0)
            r6.f1684u = r1
            r6.f1678o = r8
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r9)
            int[] r9 = p422y.C7096f.f27470p
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r9)
            int r8 = r7.getIndexCount()
            r9 = 0
        L4a:
            if (r9 >= r8) goto Lff
            int r1 = r7.getIndex(r9)
            r4 = 9
            if (r1 != r4) goto L5e
            int r4 = r6.f1667d
            int r1 = r7.getResourceId(r1, r4)
            r6.f1667d = r1
            goto Lfb
        L5e:
            r4 = 10
            if (r1 != r4) goto L7a
            int r4 = r6.f1664a
            int r1 = r7.getInt(r1, r4)
            r6.f1664a = r1
            float[][] r4 = androidx.constraintlayout.motion.widget.C0329c.f1662v
            r5 = r4[r1]
            r5 = r5[r0]
            r6.f1671h = r5
            r1 = r4[r1]
            r1 = r1[r3]
            r6.f1670g = r1
            goto Lfb
        L7a:
            if (r1 != 0) goto L94
            int r4 = r6.f1665b
            int r1 = r7.getInt(r1, r4)
            r6.f1665b = r1
            float[][] r4 = androidx.constraintlayout.motion.widget.C0329c.f1663w
            r5 = r4[r1]
            r5 = r5[r0]
            r6.f1672i = r5
            r1 = r4[r1]
            r1 = r1[r3]
            r6.f1673j = r1
            goto Lfb
        L94:
            r4 = 5
            if (r1 != r4) goto La0
            float r4 = r6.f1679p
            float r1 = r7.getFloat(r1, r4)
            r6.f1679p = r1
            goto Lfb
        La0:
            r4 = 4
            if (r1 != r4) goto Lac
            float r4 = r6.f1680q
            float r1 = r7.getFloat(r1, r4)
            r6.f1680q = r1
            goto Lfb
        Lac:
            r4 = 6
            if (r1 != r4) goto Lb8
            boolean r4 = r6.f1681r
            boolean r1 = r7.getBoolean(r1, r4)
            r6.f1681r = r1
            goto Lfb
        Lb8:
            if (r1 != r3) goto Lc3
            float r4 = r6.f1682s
            float r1 = r7.getFloat(r1, r4)
            r6.f1682s = r1
            goto Lfb
        Lc3:
            if (r1 != r2) goto Lce
            float r4 = r6.f1684u
            float r1 = r7.getFloat(r1, r4)
            r6.f1684u = r1
            goto Lfb
        Lce:
            r4 = 11
            if (r1 != r4) goto Ldb
            int r4 = r6.f1668e
            int r1 = r7.getResourceId(r1, r4)
            r6.f1668e = r1
            goto Lfb
        Ldb:
            r4 = 8
            if (r1 != r4) goto Le8
            int r4 = r6.f1666c
            int r1 = r7.getInt(r1, r4)
            r6.f1666c = r1
            goto Lfb
        Le8:
            r4 = 7
            if (r1 != r4) goto Lf2
            int r1 = r7.getInteger(r1, r0)
            r6.f1683t = r1
            goto Lfb
        Lf2:
            r4 = 3
            if (r1 != r4) goto Lfb
            int r1 = r7.getResourceId(r1, r0)
            r6.f1669f = r1
        Lfb:
            int r9 = r9 + 1
            goto L4a
        Lff:
            r7.recycle()
            return
    }

    /* renamed from: a */
    public android.graphics.RectF m917a(android.view.ViewGroup r4, android.graphics.RectF r5) {
            r3 = this;
            int r0 = r3.f1668e
            r1 = 0
            r2 = -1
            if (r0 != r2) goto L7
            return r1
        L7:
            android.view.View r4 = r4.findViewById(r0)
            if (r4 != 0) goto Le
            return r1
        Le:
            int r0 = r4.getLeft()
            float r0 = (float) r0
            int r1 = r4.getTop()
            float r1 = (float) r1
            int r2 = r4.getRight()
            float r2 = (float) r2
            int r4 = r4.getBottom()
            float r4 = (float) r4
            r5.set(r0, r1, r2, r4)
            return r5
    }

    /* renamed from: b */
    public void m918b(boolean r8) {
            r7 = this;
            r0 = 6
            r1 = 3
            r2 = 4
            r3 = 1
            r4 = 5
            r5 = 2
            if (r8 == 0) goto L1d
            float[][] r8 = androidx.constraintlayout.motion.widget.C0329c.f1663w
            r1 = r8[r1]
            r8[r2] = r1
            r1 = r8[r5]
            r8[r4] = r1
            float[][] r8 = androidx.constraintlayout.motion.widget.C0329c.f1662v
            r1 = r8[r5]
            r8[r4] = r1
            r1 = r8[r3]
            r8[r0] = r1
            goto L31
        L1d:
            float[][] r8 = androidx.constraintlayout.motion.widget.C0329c.f1663w
            r6 = r8[r5]
            r8[r2] = r6
            r1 = r8[r1]
            r8[r4] = r1
            float[][] r8 = androidx.constraintlayout.motion.widget.C0329c.f1662v
            r1 = r8[r3]
            r8[r4] = r1
            r1 = r8[r5]
            r8[r0] = r1
        L31:
            float[][] r8 = androidx.constraintlayout.motion.widget.C0329c.f1662v
            int r0 = r7.f1664a
            r1 = r8[r0]
            r2 = 0
            r1 = r1[r2]
            r7.f1671h = r1
            r8 = r8[r0]
            r8 = r8[r3]
            r7.f1670g = r8
            float[][] r8 = androidx.constraintlayout.motion.widget.C0329c.f1663w
            int r0 = r7.f1665b
            r1 = r8[r0]
            r1 = r1[r2]
            r7.f1672i = r1
            r8 = r8[r0]
            r8 = r8[r3]
            r7.f1673j = r8
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.f1672i
            r0.append(r1)
            java.lang.String r1 = " , "
            r0.append(r1)
            float r1 = r2.f1673j
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
