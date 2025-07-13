package p346u;

/* renamed from: u.k */
/* loaded from: classes.dex */
public class C6266k extends p346u.AbstractC6258c {

    /* renamed from: e */
    public java.lang.String f24331e;

    /* renamed from: f */
    public int f24332f;

    /* renamed from: g */
    public java.lang.String f24333g;

    /* renamed from: h */
    public java.lang.String f24334h;

    /* renamed from: i */
    public int f24335i;

    /* renamed from: j */
    public int f24336j;

    /* renamed from: k */
    public android.view.View f24337k;

    /* renamed from: l */
    public float f24338l;

    /* renamed from: m */
    public boolean f24339m;

    /* renamed from: n */
    public boolean f24340n;

    /* renamed from: o */
    public boolean f24341o;

    /* renamed from: p */
    public float f24342p;

    /* renamed from: q */
    public java.lang.reflect.Method f24343q;

    /* renamed from: r */
    public java.lang.reflect.Method f24344r;

    /* renamed from: s */
    public java.lang.reflect.Method f24345s;

    /* renamed from: t */
    public float f24346t;

    /* renamed from: u */
    public boolean f24347u;

    /* renamed from: v */
    public android.graphics.RectF f24348v;

    /* renamed from: w */
    public android.graphics.RectF f24349w;

    /* renamed from: u.k$a */
    public static class a {

        /* renamed from: a */
        public static android.util.SparseIntArray f24350a;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                p346u.C6266k.a.f24350a = r0
                r1 = 0
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = p346u.C6266k.a.f24350a
                r1 = 4
                r0.append(r1, r1)
                android.util.SparseIntArray r0 = p346u.C6266k.a.f24350a
                r1 = 5
                r3 = 1
                r0.append(r1, r3)
                android.util.SparseIntArray r0 = p346u.C6266k.a.f24350a
                r4 = 6
                r5 = 2
                r0.append(r4, r5)
                android.util.SparseIntArray r0 = p346u.C6266k.a.f24350a
                r6 = 7
                r0.append(r3, r6)
                android.util.SparseIntArray r0 = p346u.C6266k.a.f24350a
                r0.append(r6, r4)
                android.util.SparseIntArray r0 = p346u.C6266k.a.f24350a
                r3 = 9
                r0.append(r3, r1)
                android.util.SparseIntArray r0 = p346u.C6266k.a.f24350a
                r1 = 3
                r0.append(r1, r3)
                android.util.SparseIntArray r0 = p346u.C6266k.a.f24350a
                r1 = 10
                r0.append(r5, r1)
                android.util.SparseIntArray r0 = p346u.C6266k.a.f24350a
                r1 = 11
                r0.append(r2, r1)
                return
        }
    }

    public C6266k() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f24331e = r0
            r1 = -1
            r2.f24332f = r1
            r2.f24333g = r0
            r2.f24334h = r0
            r2.f24335i = r1
            r2.f24336j = r1
            r2.f24337k = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r2.f24338l = r0
            r0 = 1
            r2.f24339m = r0
            r2.f24340n = r0
            r2.f24341o = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.f24342p = r0
            r0 = 0
            r2.f24347u = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.f24348v = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.f24349w = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f24248d = r0
            return
    }

    @Override // p346u.AbstractC6258c
    /* renamed from: a */
    public void mo12874a(java.util.HashMap<java.lang.String, p346u.AbstractC6273r> r1) {
            r0 = this;
            return
    }

    @Override // p346u.AbstractC6258c
    /* renamed from: b */
    public void mo12875b(java.util.HashSet<java.lang.String> r1) {
            r0 = this;
            return
    }

    @Override // p346u.AbstractC6258c
    /* renamed from: c */
    public void mo12876c(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            int[] r0 = p422y.C7096f.f27463i
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r0)
            android.util.SparseIntArray r6 = p346u.C6266k.a.f24350a
            int r6 = r5.getIndexCount()
            r0 = 0
        Ld:
            if (r0 >= r6) goto Lc7
            int r1 = r5.getIndex(r0)
            android.util.SparseIntArray r2 = p346u.C6266k.a.f24350a
            int r2 = r2.get(r1)
            switch(r2) {
                case 1: goto L98;
                case 2: goto L91;
                case 3: goto L1c;
                case 4: goto L8a;
                case 5: goto L81;
                case 6: goto L78;
                case 7: goto L4f;
                case 8: goto L3c;
                case 9: goto L32;
                case 10: goto L28;
                case 11: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto L9f
        L1e:
            int r2 = r4.f24332f
            int r2 = r5.getResourceId(r1, r2)
            r4.f24332f = r2
            goto L9f
        L28:
            boolean r2 = r4.f24347u
            boolean r1 = r5.getBoolean(r1, r2)
            r4.f24347u = r1
            goto Lc3
        L32:
            int r2 = r4.f24336j
            int r1 = r5.getResourceId(r1, r2)
            r4.f24336j = r1
            goto Lc3
        L3c:
            int r2 = r4.f24245a
            int r1 = r5.getInteger(r1, r2)
            r4.f24245a = r1
            float r1 = (float) r1
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            r4.f24342p = r1
            goto Lc3
        L4f:
            boolean r2 = androidx.constraintlayout.motion.widget.MotionLayout.f1521x1
            if (r2 == 0) goto L5f
            int r2 = r4.f24246b
            int r2 = r5.getResourceId(r1, r2)
            r4.f24246b = r2
            r3 = -1
            if (r2 != r3) goto Lc3
            goto L68
        L5f:
            android.util.TypedValue r2 = r5.peekValue(r1)
            int r2 = r2.type
            r3 = 3
            if (r2 != r3) goto L6f
        L68:
            java.lang.String r1 = r5.getString(r1)
            r4.f24247c = r1
            goto Lc3
        L6f:
            int r2 = r4.f24246b
            int r1 = r5.getResourceId(r1, r2)
            r4.f24246b = r1
            goto Lc3
        L78:
            int r2 = r4.f24335i
            int r1 = r5.getResourceId(r1, r2)
            r4.f24335i = r1
            goto Lc3
        L81:
            float r2 = r4.f24338l
            float r1 = r5.getFloat(r1, r2)
            r4.f24338l = r1
            goto Lc3
        L8a:
            java.lang.String r1 = r5.getString(r1)
            r4.f24331e = r1
            goto Lc3
        L91:
            java.lang.String r1 = r5.getString(r1)
            r4.f24334h = r1
            goto Lc3
        L98:
            java.lang.String r1 = r5.getString(r1)
            r4.f24333g = r1
            goto Lc3
        L9f:
            java.lang.String r2 = "unused attribute 0x"
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r3 = java.lang.Integer.toHexString(r1)
            r2.append(r3)
            java.lang.String r3 = "   "
            r2.append(r3)
            android.util.SparseIntArray r3 = p346u.C6266k.a.f24350a
            int r1 = r3.get(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyTrigger"
            android.util.Log.e(r2, r1)
        Lc3:
            int r0 = r0 + 1
            goto Ld
        Lc7:
            return
    }

    /* renamed from: e */
    public final void m12883e(android.graphics.RectF r2, android.view.View r3, boolean r4) {
            r1 = this;
            int r0 = r3.getTop()
            float r0 = (float) r0
            r2.top = r0
            int r0 = r3.getBottom()
            float r0 = (float) r0
            r2.bottom = r0
            int r0 = r3.getLeft()
            float r0 = (float) r0
            r2.left = r0
            int r0 = r3.getRight()
            float r0 = (float) r0
            r2.right = r0
            if (r4 == 0) goto L25
            android.graphics.Matrix r3 = r3.getMatrix()
            r3.mapRect(r2)
        L25:
            return
    }
}
