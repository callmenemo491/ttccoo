package p346u;

/* renamed from: u.j */
/* loaded from: classes.dex */
public class C6265j extends p346u.AbstractC6258c {

    /* renamed from: e */
    public int f24314e;

    /* renamed from: f */
    public float f24315f;

    /* renamed from: g */
    public float f24316g;

    /* renamed from: h */
    public float f24317h;

    /* renamed from: i */
    public float f24318i;

    /* renamed from: j */
    public float f24319j;

    /* renamed from: k */
    public float f24320k;

    /* renamed from: l */
    public float f24321l;

    /* renamed from: m */
    public float f24322m;

    /* renamed from: n */
    public float f24323n;

    /* renamed from: o */
    public float f24324o;

    /* renamed from: p */
    public float f24325p;

    /* renamed from: q */
    public float f24326q;

    /* renamed from: r */
    public int f24327r;

    /* renamed from: s */
    public float f24328s;

    /* renamed from: t */
    public float f24329t;

    /* renamed from: u.j$a */
    public static class a {

        /* renamed from: a */
        public static android.util.SparseIntArray f24330a;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                p346u.C6265j.a.f24330a = r0
                r1 = 0
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r1 = 9
                r3 = 2
                r0.append(r1, r3)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r4 = 5
                r5 = 4
                r0.append(r4, r5)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r6 = 6
                r0.append(r6, r4)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r4 = 7
                r0.append(r4, r6)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r6 = 3
                r0.append(r6, r4)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r4 = 15
                r6 = 8
                r0.append(r4, r6)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r7 = 14
                r0.append(r7, r1)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r1 = 13
                r8 = 10
                r0.append(r1, r8)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r9 = 11
                r10 = 12
                r0.append(r9, r10)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r0.append(r8, r1)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r0.append(r5, r7)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r0.append(r2, r4)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r1 = 16
                r0.append(r3, r1)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r1 = 17
                r0.append(r6, r1)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r2 = 18
                r0.append(r10, r2)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r3 = 20
                r0.append(r2, r3)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r2 = 21
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = p346u.C6265j.a.f24330a
                r1 = 19
                r0.append(r1, r1)
                return
        }
    }

    public C6265j() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f24314e = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.f24315f = r0
            r2.f24316g = r0
            r2.f24317h = r0
            r2.f24318i = r0
            r2.f24319j = r0
            r2.f24320k = r0
            r2.f24321l = r0
            r2.f24322m = r0
            r2.f24323n = r0
            r2.f24324o = r0
            r2.f24325p = r0
            r2.f24326q = r0
            r1 = 0
            r2.f24327r = r1
            r2.f24328s = r0
            r0 = 0
            r2.f24329t = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f24248d = r0
            return
    }

    @Override // p346u.AbstractC6258c
    /* renamed from: a */
    public void mo12874a(java.util.HashMap<java.lang.String, p346u.AbstractC6273r> r2) {
            r1 = this;
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = " KeyTimeCycles do not support SplineSet"
            r2.<init>(r0)
            throw r2
    }

    @Override // p346u.AbstractC6258c
    /* renamed from: b */
    public void mo12875b(java.util.HashSet<java.lang.String> r5) {
            r4 = this;
            float r0 = r4.f24315f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld
            java.lang.String r0 = "alpha"
            r5.add(r0)
        Ld:
            float r0 = r4.f24316g
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "elevation"
            r5.add(r0)
        L1a:
            float r0 = r4.f24317h
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = "rotation"
            r5.add(r0)
        L27:
            float r0 = r4.f24318i
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = "rotationX"
            r5.add(r0)
        L34:
            float r0 = r4.f24319j
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L41
            java.lang.String r0 = "rotationY"
            r5.add(r0)
        L41:
            float r0 = r4.f24323n
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "translationX"
            r5.add(r0)
        L4e:
            float r0 = r4.f24324o
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "translationY"
            r5.add(r0)
        L5b:
            float r0 = r4.f24325p
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "translationZ"
            r5.add(r0)
        L68:
            float r0 = r4.f24320k
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "transitionPathRotate"
            r5.add(r0)
        L75:
            float r0 = r4.f24321l
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "scaleX"
            r5.add(r0)
        L82:
            float r0 = r4.f24322m
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "scaleY"
            r5.add(r0)
        L8f:
            float r0 = r4.f24326q
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "progress"
            r5.add(r0)
        L9c:
            java.util.HashMap<java.lang.String, y.a> r0 = r4.f24248d
            int r0 = r0.size()
            if (r0 <= 0) goto Lcf
            java.util.HashMap<java.lang.String, y.a> r0 = r4.f24248d
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lae:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lcf
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CUSTOM,"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.add(r1)
            goto Lae
        Lcf:
            return
    }

    @Override // p346u.AbstractC6258c
    /* renamed from: c */
    public void mo12876c(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            int[] r0 = p422y.C7096f.f27462h
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r0)
            android.util.SparseIntArray r6 = p346u.C6265j.a.f24330a
            int r6 = r5.getIndexCount()
            r0 = 0
        Ld:
            if (r0 >= r6) goto L125
            int r1 = r5.getIndex(r0)
            android.util.SparseIntArray r2 = p346u.C6265j.a.f24330a
            int r2 = r2.get(r1)
            switch(r2) {
                case 1: goto L119;
                case 2: goto L110;
                case 3: goto L1c;
                case 4: goto L107;
                case 5: goto Lfe;
                case 6: goto Lf5;
                case 7: goto Lec;
                case 8: goto Le3;
                case 9: goto Ldf;
                case 10: goto Lb6;
                case 11: goto L1c;
                case 12: goto Lac;
                case 13: goto La2;
                case 14: goto L98;
                case 15: goto L8e;
                case 16: goto L84;
                case 17: goto L7a;
                case 18: goto L70;
                case 19: goto L66;
                case 20: goto L5c;
                case 21: goto L42;
                default: goto L1c;
            }
        L1c:
            java.lang.String r2 = "unused attribute 0x"
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r3 = java.lang.Integer.toHexString(r1)
            r2.append(r3)
            java.lang.String r3 = "   "
            r2.append(r3)
            android.util.SparseIntArray r3 = p346u.C6265j.a.f24330a
            int r1 = r3.get(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyTimeCycle"
            android.util.Log.e(r2, r1)
            goto L121
        L42:
            android.util.TypedValue r2 = r5.peekValue(r1)
            int r2 = r2.type
            r3 = 5
            if (r2 != r3) goto L52
            float r2 = r4.f24329t
            float r1 = r5.getDimension(r1, r2)
            goto L58
        L52:
            float r2 = r4.f24329t
            float r1 = r5.getFloat(r1, r2)
        L58:
            r4.f24329t = r1
            goto L121
        L5c:
            float r2 = r4.f24328s
            float r1 = r5.getFloat(r1, r2)
            r4.f24328s = r1
            goto L121
        L66:
            int r2 = r4.f24327r
            int r1 = r5.getInt(r1, r2)
            r4.f24327r = r1
            goto L121
        L70:
            float r2 = r4.f24326q
            float r1 = r5.getFloat(r1, r2)
            r4.f24326q = r1
            goto L121
        L7a:
            float r2 = r4.f24325p
            float r1 = r5.getDimension(r1, r2)
            r4.f24325p = r1
            goto L121
        L84:
            float r2 = r4.f24324o
            float r1 = r5.getDimension(r1, r2)
            r4.f24324o = r1
            goto L121
        L8e:
            float r2 = r4.f24323n
            float r1 = r5.getDimension(r1, r2)
            r4.f24323n = r1
            goto L121
        L98:
            float r2 = r4.f24322m
            float r1 = r5.getFloat(r1, r2)
            r4.f24322m = r1
            goto L121
        La2:
            int r2 = r4.f24314e
            int r1 = r5.getInteger(r1, r2)
            r4.f24314e = r1
            goto L121
        Lac:
            int r2 = r4.f24245a
            int r1 = r5.getInt(r1, r2)
            r4.f24245a = r1
            goto L121
        Lb6:
            boolean r2 = androidx.constraintlayout.motion.widget.MotionLayout.f1521x1
            if (r2 == 0) goto Lc6
            int r2 = r4.f24246b
            int r2 = r5.getResourceId(r1, r2)
            r4.f24246b = r2
            r3 = -1
            if (r2 != r3) goto L121
            goto Lcf
        Lc6:
            android.util.TypedValue r2 = r5.peekValue(r1)
            int r2 = r2.type
            r3 = 3
            if (r2 != r3) goto Ld6
        Lcf:
            java.lang.String r1 = r5.getString(r1)
            r4.f24247c = r1
            goto L121
        Ld6:
            int r2 = r4.f24246b
            int r1 = r5.getResourceId(r1, r2)
            r4.f24246b = r1
            goto L121
        Ldf:
            r5.getString(r1)
            goto L121
        Le3:
            float r2 = r4.f24320k
            float r1 = r5.getFloat(r1, r2)
            r4.f24320k = r1
            goto L121
        Lec:
            float r2 = r4.f24321l
            float r1 = r5.getFloat(r1, r2)
            r4.f24321l = r1
            goto L121
        Lf5:
            float r2 = r4.f24319j
            float r1 = r5.getFloat(r1, r2)
            r4.f24319j = r1
            goto L121
        Lfe:
            float r2 = r4.f24318i
            float r1 = r5.getFloat(r1, r2)
            r4.f24318i = r1
            goto L121
        L107:
            float r2 = r4.f24317h
            float r1 = r5.getFloat(r1, r2)
            r4.f24317h = r1
            goto L121
        L110:
            float r2 = r4.f24316g
            float r1 = r5.getDimension(r1, r2)
            r4.f24316g = r1
            goto L121
        L119:
            float r2 = r4.f24315f
            float r1 = r5.getFloat(r1, r2)
            r4.f24315f = r1
        L121:
            int r0 = r0 + 1
            goto Ld
        L125:
            return
    }

    @Override // p346u.AbstractC6258c
    /* renamed from: d */
    public void mo12877d(java.util.HashMap<java.lang.String, java.lang.Integer> r4) {
            r3 = this;
            int r0 = r3.f24314e
            r1 = -1
            if (r0 != r1) goto L6
            return
        L6:
            float r0 = r3.f24315f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L19
            int r0 = r3.f24314e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "alpha"
            r4.put(r1, r0)
        L19:
            float r0 = r3.f24316g
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L2c
            int r0 = r3.f24314e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "elevation"
            r4.put(r1, r0)
        L2c:
            float r0 = r3.f24317h
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L3f
            int r0 = r3.f24314e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotation"
            r4.put(r1, r0)
        L3f:
            float r0 = r3.f24318i
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L52
            int r0 = r3.f24314e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationX"
            r4.put(r1, r0)
        L52:
            float r0 = r3.f24319j
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L65
            int r0 = r3.f24314e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationY"
            r4.put(r1, r0)
        L65:
            float r0 = r3.f24323n
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L78
            int r0 = r3.f24314e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationX"
            r4.put(r1, r0)
        L78:
            float r0 = r3.f24324o
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8b
            int r0 = r3.f24314e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationY"
            r4.put(r1, r0)
        L8b:
            float r0 = r3.f24325p
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9e
            int r0 = r3.f24314e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationZ"
            r4.put(r1, r0)
        L9e:
            float r0 = r3.f24320k
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb1
            int r0 = r3.f24314e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transitionPathRotate"
            r4.put(r1, r0)
        Lb1:
            float r0 = r3.f24321l
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lc4
            int r0 = r3.f24314e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleX"
            r4.put(r1, r0)
        Lc4:
            float r0 = r3.f24321l
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld7
            int r0 = r3.f24314e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleY"
            r4.put(r1, r0)
        Ld7:
            float r0 = r3.f24326q
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lea
            int r0 = r3.f24314e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "progress"
            r4.put(r1, r0)
        Lea:
            java.util.HashMap<java.lang.String, y.a> r0 = r3.f24248d
            int r0 = r0.size()
            if (r0 <= 0) goto L118
            java.util.HashMap<java.lang.String, y.a> r0 = r3.f24248d
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lfc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L118
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "CUSTOM,"
            java.lang.String r1 = p064e.C1493g.m4049a(r2, r1)
            int r2 = r3.f24314e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.put(r1, r2)
            goto Lfc
        L118:
            return
    }
}
