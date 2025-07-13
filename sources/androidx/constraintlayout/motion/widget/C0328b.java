package androidx.constraintlayout.motion.widget;

/* renamed from: androidx.constraintlayout.motion.widget.b */
/* loaded from: classes.dex */
public class C0328b {

    /* renamed from: a */
    public final androidx.constraintlayout.motion.widget.MotionLayout f1622a;

    /* renamed from: b */
    public p422y.C7097g f1623b;

    /* renamed from: c */
    public androidx.constraintlayout.motion.widget.C0328b.b f1624c;

    /* renamed from: d */
    public java.util.ArrayList<androidx.constraintlayout.motion.widget.C0328b.b> f1625d;

    /* renamed from: e */
    public androidx.constraintlayout.motion.widget.C0328b.b f1626e;

    /* renamed from: f */
    public java.util.ArrayList<androidx.constraintlayout.motion.widget.C0328b.b> f1627f;

    /* renamed from: g */
    public android.util.SparseArray<androidx.constraintlayout.widget.C0333b> f1628g;

    /* renamed from: h */
    public java.util.HashMap<java.lang.String, java.lang.Integer> f1629h;

    /* renamed from: i */
    public android.util.SparseIntArray f1630i;

    /* renamed from: j */
    public int f1631j;

    /* renamed from: k */
    public int f1632k;

    /* renamed from: l */
    public android.view.MotionEvent f1633l;

    /* renamed from: m */
    public boolean f1634m;

    /* renamed from: n */
    public boolean f1635n;

    /* renamed from: o */
    public androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0322e f1636o;

    /* renamed from: p */
    public boolean f1637p;

    /* renamed from: q */
    public float f1638q;

    /* renamed from: r */
    public float f1639r;

    /* renamed from: androidx.constraintlayout.motion.widget.b$a */
    public class a implements android.view.animation.Interpolator {

        /* renamed from: a */
        public final /* synthetic */ p331t.C6088c f1640a;

        public a(androidx.constraintlayout.motion.widget.C0328b r1, p331t.C6088c r2) {
                r0 = this;
                r0.f1640a = r2
                r0.<init>()
                return
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float r4) {
                r3 = this;
                t.c r0 = r3.f1640a
                double r1 = (double) r4
                double r0 = r0.mo12543a(r1)
                float r4 = (float) r0
                return r4
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.b$b */
    public static class b {

        /* renamed from: a */
        public int f1641a;

        /* renamed from: b */
        public boolean f1642b;

        /* renamed from: c */
        public int f1643c;

        /* renamed from: d */
        public int f1644d;

        /* renamed from: e */
        public int f1645e;

        /* renamed from: f */
        public java.lang.String f1646f;

        /* renamed from: g */
        public int f1647g;

        /* renamed from: h */
        public int f1648h;

        /* renamed from: i */
        public float f1649i;

        /* renamed from: j */
        public final androidx.constraintlayout.motion.widget.C0328b f1650j;

        /* renamed from: k */
        public java.util.ArrayList<p346u.C6262g> f1651k;

        /* renamed from: l */
        public androidx.constraintlayout.motion.widget.C0329c f1652l;

        /* renamed from: m */
        public java.util.ArrayList<androidx.constraintlayout.motion.widget.C0328b.b.a> f1653m;

        /* renamed from: n */
        public int f1654n;

        /* renamed from: o */
        public boolean f1655o;

        /* renamed from: p */
        public int f1656p;

        /* renamed from: q */
        public int f1657q;

        /* renamed from: r */
        public int f1658r;

        /* renamed from: androidx.constraintlayout.motion.widget.b$b$a */
        public static class a implements android.view.View.OnClickListener {

            /* renamed from: Y */
            public final androidx.constraintlayout.motion.widget.C0328b.b f1659Y;

            /* renamed from: Z */
            public int f1660Z;

            /* renamed from: a0 */
            public int f1661a0;

            public a(android.content.Context r3, androidx.constraintlayout.motion.widget.C0328b.b r4, org.xmlpull.v1.XmlPullParser r5) {
                    r2 = this;
                    r2.<init>()
                    r0 = -1
                    r2.f1660Z = r0
                    r0 = 17
                    r2.f1661a0 = r0
                    r2.f1659Y = r4
                    android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r5)
                    int[] r5 = p422y.C7096f.f27469o
                    android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r5)
                    int r4 = r3.getIndexCount()
                    r5 = 0
                L1b:
                    if (r5 >= r4) goto L3a
                    int r0 = r3.getIndex(r5)
                    r1 = 1
                    if (r0 != r1) goto L2d
                    int r1 = r2.f1660Z
                    int r0 = r3.getResourceId(r0, r1)
                    r2.f1660Z = r0
                    goto L37
                L2d:
                    if (r0 != 0) goto L37
                    int r1 = r2.f1661a0
                    int r0 = r3.getInt(r0, r1)
                    r2.f1661a0 = r0
                L37:
                    int r5 = r5 + 1
                    goto L1b
                L3a:
                    r3.recycle()
                    return
            }

            /* renamed from: a */
            public void m915a(androidx.constraintlayout.motion.widget.MotionLayout r7, int r8, androidx.constraintlayout.motion.widget.C0328b.b r9) {
                    r6 = this;
                    int r0 = r6.f1660Z
                    r1 = -1
                    if (r0 != r1) goto L6
                    goto La
                L6:
                    android.view.View r7 = r7.findViewById(r0)
                La:
                    if (r7 != 0) goto L21
                    java.lang.String r7 = "OnClick could not find id "
                    java.lang.StringBuilder r7 = android.support.v4.media.C0144c.m256a(r7)
                    int r8 = r6.f1660Z
                    r7.append(r8)
                    java.lang.String r7 = r7.toString()
                    java.lang.String r8 = "MotionScene"
                    android.util.Log.e(r8, r7)
                    return
                L21:
                    int r0 = r9.f1644d
                    int r9 = r9.f1643c
                    if (r0 != r1) goto L2b
                    r7.setOnClickListener(r6)
                    return
                L2b:
                    int r1 = r6.f1661a0
                    r2 = r1 & 1
                    r3 = 0
                    if (r2 == 0) goto L36
                    if (r8 != r0) goto L36
                    r4 = 1
                    goto L37
                L36:
                    r4 = 0
                L37:
                    r5 = r1 & 256(0x100, float:3.59E-43)
                    if (r5 == 0) goto L3f
                    if (r8 != r0) goto L3f
                    r5 = 1
                    goto L40
                L3f:
                    r5 = 0
                L40:
                    r4 = r4 | r5
                    if (r2 == 0) goto L47
                    if (r8 != r0) goto L47
                    r0 = 1
                    goto L48
                L47:
                    r0 = 0
                L48:
                    r0 = r0 | r4
                    r2 = r1 & 16
                    if (r2 == 0) goto L51
                    if (r8 != r9) goto L51
                    r2 = 1
                    goto L52
                L51:
                    r2 = 0
                L52:
                    r0 = r0 | r2
                    r1 = r1 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L5a
                    if (r8 != r9) goto L5a
                    r3 = 1
                L5a:
                    r8 = r0 | r3
                    if (r8 == 0) goto L61
                    r7.setOnClickListener(r6)
                L61:
                    return
            }

            /* renamed from: b */
            public void m916b(androidx.constraintlayout.motion.widget.MotionLayout r3) {
                    r2 = this;
                    int r0 = r2.f1660Z
                    r1 = -1
                    if (r0 != r1) goto L6
                    return
                L6:
                    android.view.View r3 = r3.findViewById(r0)
                    if (r3 != 0) goto L21
                    java.lang.String r3 = " (*)  could not find id "
                    java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
                    int r0 = r2.f1660Z
                    r3.append(r0)
                    java.lang.String r3 = r3.toString()
                    java.lang.String r0 = "MotionScene"
                    android.util.Log.e(r0, r3)
                    return
                L21:
                    r0 = 0
                    r3.setOnClickListener(r0)
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r11) {
                    r10 = this;
                    androidx.constraintlayout.motion.widget.b$b r11 = r10.f1659Y
                    androidx.constraintlayout.motion.widget.b r0 = r11.f1650j
                    androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f1622a
                    boolean r2 = r1.f1579z0
                    if (r2 != 0) goto Lb
                    return
                Lb:
                    int r2 = r11.f1644d
                    r3 = 1065353216(0x3f800000, float:1.0)
                    r4 = -1
                    if (r2 != r4) goto L38
                    int r11 = r1.getCurrentState()
                    if (r11 != r4) goto L20
                    androidx.constraintlayout.motion.widget.b$b r11 = r10.f1659Y
                    int r11 = r11.f1643c
                    r1.m871D(r11)
                    return
                L20:
                    androidx.constraintlayout.motion.widget.b$b r0 = new androidx.constraintlayout.motion.widget.b$b
                    androidx.constraintlayout.motion.widget.b$b r2 = r10.f1659Y
                    androidx.constraintlayout.motion.widget.b r4 = r2.f1650j
                    r0.<init>(r4, r2)
                    r0.f1644d = r11
                    androidx.constraintlayout.motion.widget.b$b r11 = r10.f1659Y
                    int r11 = r11.f1643c
                    r0.f1643c = r11
                    r1.setTransition(r0)
                    r1.m873s(r3)
                    return
                L38:
                    androidx.constraintlayout.motion.widget.b$b r0 = r0.f1624c
                    int r2 = r10.f1661a0
                    r5 = r2 & 1
                    r6 = 0
                    r7 = 1
                    if (r5 != 0) goto L49
                    r5 = r2 & 256(0x100, float:3.59E-43)
                    if (r5 == 0) goto L47
                    goto L49
                L47:
                    r5 = 0
                    goto L4a
                L49:
                    r5 = 1
                L4a:
                    r8 = r2 & 16
                    if (r8 != 0) goto L55
                    r2 = r2 & 4096(0x1000, float:5.74E-42)
                    if (r2 == 0) goto L53
                    goto L55
                L53:
                    r2 = 0
                    goto L56
                L55:
                    r2 = 1
                L56:
                    if (r5 == 0) goto L5c
                    if (r2 == 0) goto L5c
                    r8 = 1
                    goto L5d
                L5c:
                    r8 = 0
                L5d:
                    if (r8 == 0) goto L7c
                    if (r0 == r11) goto L64
                    r1.setTransition(r11)
                L64:
                    int r11 = r1.getCurrentState()
                    int r8 = r1.getEndState()
                    if (r11 == r8) goto L7b
                    float r11 = r1.getProgress()
                    r8 = 1056964608(0x3f000000, float:0.5)
                    int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                    if (r11 <= 0) goto L79
                    goto L7b
                L79:
                    r2 = 0
                    goto L7c
                L7b:
                    r5 = 0
                L7c:
                    androidx.constraintlayout.motion.widget.b$b r11 = r10.f1659Y
                    if (r11 != r0) goto L81
                    goto L90
                L81:
                    int r0 = r11.f1643c
                    int r8 = r11.f1644d
                    int r9 = r1.f1573v0
                    if (r8 != r4) goto L8c
                    if (r9 == r0) goto L91
                    goto L90
                L8c:
                    if (r9 == r8) goto L90
                    if (r9 != r0) goto L91
                L90:
                    r6 = 1
                L91:
                    if (r6 == 0) goto Lce
                    if (r5 == 0) goto La1
                    int r0 = r10.f1661a0
                    r0 = r0 & r7
                    if (r0 == 0) goto La1
                    r1.setTransition(r11)
                    r1.m873s(r3)
                    goto Lce
                La1:
                    r0 = 0
                    if (r2 == 0) goto Lb1
                    int r4 = r10.f1661a0
                    r4 = r4 & 16
                    if (r4 == 0) goto Lb1
                    r1.setTransition(r11)
                    r1.m873s(r0)
                    goto Lce
                Lb1:
                    if (r5 == 0) goto Lc0
                    int r4 = r10.f1661a0
                    r4 = r4 & 256(0x100, float:3.59E-43)
                    if (r4 == 0) goto Lc0
                    r1.setTransition(r11)
                    r1.setProgress(r3)
                    goto Lce
                Lc0:
                    if (r2 == 0) goto Lce
                    int r2 = r10.f1661a0
                    r2 = r2 & 4096(0x1000, float:5.74E-42)
                    if (r2 == 0) goto Lce
                    r1.setTransition(r11)
                    r1.setProgress(r0)
                Lce:
                    return
            }
        }

        public b(androidx.constraintlayout.motion.widget.C0328b r10, android.content.Context r11, org.xmlpull.v1.XmlPullParser r12) {
                r9 = this;
                r9.<init>()
                r0 = -1
                r9.f1641a = r0
                r1 = 0
                r9.f1642b = r1
                r9.f1643c = r0
                r9.f1644d = r0
                r9.f1645e = r1
                r2 = 0
                r9.f1646f = r2
                r9.f1647g = r0
                r3 = 400(0x190, float:5.6E-43)
                r9.f1648h = r3
                r3 = 0
                r9.f1649i = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r9.f1651k = r3
                r9.f1652l = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r9.f1653m = r2
                r9.f1654n = r1
                r9.f1655o = r1
                r9.f1656p = r0
                r9.f1657q = r1
                r9.f1658r = r1
                int r2 = r10.f1631j
                r9.f1648h = r2
                int r2 = r10.f1632k
                r9.f1657q = r2
                r9.f1650j = r10
                android.util.AttributeSet r12 = android.util.Xml.asAttributeSet(r12)
                int[] r2 = p422y.C7096f.f27475u
                android.content.res.TypedArray r12 = r11.obtainStyledAttributes(r12, r2)
                int r2 = r12.getIndexCount()
                r3 = 0
            L4e:
                r4 = 1
                if (r3 >= r2) goto L147
                int r5 = r12.getIndex(r3)
                r6 = 2
                java.lang.String r7 = "layout"
                if (r5 != r6) goto L81
                int r4 = r9.f1643c
                int r4 = r12.getResourceId(r5, r4)
                r9.f1643c = r4
                android.content.res.Resources r4 = r11.getResources()
                int r5 = r9.f1643c
                java.lang.String r4 = r4.getResourceTypeName(r5)
                boolean r4 = r7.equals(r4)
                if (r4 == 0) goto L143
                androidx.constraintlayout.widget.b r4 = new androidx.constraintlayout.widget.b
                r4.<init>()
                int r5 = r9.f1643c
                r4.m951j(r11, r5)
                android.util.SparseArray<androidx.constraintlayout.widget.b> r5 = r10.f1628g
                int r6 = r9.f1643c
                goto Laa
            L81:
                r6 = 3
                if (r5 != r6) goto Laf
                int r4 = r9.f1644d
                int r4 = r12.getResourceId(r5, r4)
                r9.f1644d = r4
                android.content.res.Resources r4 = r11.getResources()
                int r5 = r9.f1644d
                java.lang.String r4 = r4.getResourceTypeName(r5)
                boolean r4 = r7.equals(r4)
                if (r4 == 0) goto L143
                androidx.constraintlayout.widget.b r4 = new androidx.constraintlayout.widget.b
                r4.<init>()
                int r5 = r9.f1644d
                r4.m951j(r11, r5)
                android.util.SparseArray<androidx.constraintlayout.widget.b> r5 = r10.f1628g
                int r6 = r9.f1644d
            Laa:
                r5.append(r6, r4)
                goto L143
            Laf:
                r7 = 6
                if (r5 != r7) goto Le9
                android.util.TypedValue r7 = r12.peekValue(r5)
                int r7 = r7.type
                r8 = -2
                if (r7 != r4) goto Lc4
                int r4 = r12.getResourceId(r5, r0)
                r9.f1647g = r4
                if (r4 == r0) goto L143
                goto Lda
            Lc4:
                if (r7 != r6) goto Le0
                java.lang.String r4 = r12.getString(r5)
                r9.f1646f = r4
                java.lang.String r6 = "/"
                int r4 = r4.indexOf(r6)
                if (r4 <= 0) goto Lde
                int r4 = r12.getResourceId(r5, r0)
                r9.f1647g = r4
            Lda:
                r9.f1645e = r8
                goto L143
            Lde:
                r4 = -1
                goto Le6
            Le0:
                int r4 = r9.f1645e
                int r4 = r12.getInteger(r5, r4)
            Le6:
                r9.f1645e = r4
                goto L143
            Le9:
                r6 = 4
                if (r5 != r6) goto Lf5
                int r4 = r9.f1648h
                int r4 = r12.getInt(r5, r4)
                r9.f1648h = r4
                goto L143
            Lf5:
                r6 = 8
                if (r5 != r6) goto L102
                float r4 = r9.f1649i
                float r4 = r12.getFloat(r5, r4)
                r9.f1649i = r4
                goto L143
            L102:
                if (r5 != r4) goto L10d
                int r4 = r9.f1654n
                int r4 = r12.getInteger(r5, r4)
                r9.f1654n = r4
                goto L143
            L10d:
                if (r5 != 0) goto L118
                int r4 = r9.f1641a
                int r4 = r12.getResourceId(r5, r4)
                r9.f1641a = r4
                goto L143
            L118:
                r4 = 9
                if (r5 != r4) goto L125
                boolean r4 = r9.f1655o
                boolean r4 = r12.getBoolean(r5, r4)
                r9.f1655o = r4
                goto L143
            L125:
                r4 = 7
                if (r5 != r4) goto L12f
                int r4 = r12.getInteger(r5, r0)
                r9.f1656p = r4
                goto L143
            L12f:
                r4 = 5
                if (r5 != r4) goto L139
                int r4 = r12.getInteger(r5, r1)
                r9.f1657q = r4
                goto L143
            L139:
                r4 = 10
                if (r5 != r4) goto L143
                int r4 = r12.getInteger(r5, r1)
                r9.f1658r = r4
            L143:
                int r3 = r3 + 1
                goto L4e
            L147:
                int r10 = r9.f1644d
                if (r10 != r0) goto L14d
                r9.f1642b = r4
            L14d:
                r12.recycle()
                return
        }

        public b(androidx.constraintlayout.motion.widget.C0328b r5, androidx.constraintlayout.motion.widget.C0328b.b r6) {
                r4 = this;
                r4.<init>()
                r0 = -1
                r4.f1641a = r0
                r1 = 0
                r4.f1642b = r1
                r4.f1643c = r0
                r4.f1644d = r0
                r4.f1645e = r1
                r2 = 0
                r4.f1646f = r2
                r4.f1647g = r0
                r3 = 400(0x190, float:5.6E-43)
                r4.f1648h = r3
                r3 = 0
                r4.f1649i = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r4.f1651k = r3
                r4.f1652l = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r4.f1653m = r2
                r4.f1654n = r1
                r4.f1655o = r1
                r4.f1656p = r0
                r4.f1657q = r1
                r4.f1658r = r1
                r4.f1650j = r5
                if (r6 == 0) goto L59
                int r5 = r6.f1656p
                r4.f1656p = r5
                int r5 = r6.f1645e
                r4.f1645e = r5
                java.lang.String r5 = r6.f1646f
                r4.f1646f = r5
                int r5 = r6.f1647g
                r4.f1647g = r5
                int r5 = r6.f1648h
                r4.f1648h = r5
                java.util.ArrayList<u.g> r5 = r6.f1651k
                r4.f1651k = r5
                float r5 = r6.f1649i
                r4.f1649i = r5
                int r5 = r6.f1657q
                r4.f1657q = r5
            L59:
                return
        }
    }

    public C0328b(android.content.Context r9, androidx.constraintlayout.motion.widget.MotionLayout r10, int r11) {
            r8 = this;
            r8.<init>()
            r0 = 0
            r8.f1623b = r0
            r8.f1624c = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.f1625d = r1
            r8.f1626e = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.f1627f = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r8.f1628g = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r8.f1629h = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r8.f1630i = r1
            r1 = 400(0x190, float:5.6E-43)
            r8.f1631j = r1
            r1 = 0
            r8.f1632k = r1
            r8.f1634m = r1
            r8.f1635n = r1
            r8.f1622a = r10
            android.content.res.Resources r10 = r9.getResources()
            android.content.res.XmlResourceParser r10 = r10.getXml(r11)
            int r2 = r10.getEventType()     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
        L46:
            r3 = 1
            if (r2 == r3) goto L166
            if (r2 == 0) goto L154
            r4 = 2
            if (r2 == r4) goto L50
            goto L157
        L50:
            java.lang.String r2 = r10.getName()     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            int r5 = r2.hashCode()     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            java.lang.String r6 = "MotionScene"
            r7 = -1
            switch(r5) {
                case -1349929691: goto L98;
                case -1239391468: goto L8e;
                case 269306229: goto L85;
                case 312750793: goto L7b;
                case 327855227: goto L71;
                case 793277014: goto L69;
                case 1382829617: goto L5f;
                default: goto L5e;
            }
        L5e:
            goto La2
        L5f:
            java.lang.String r3 = "StateSet"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            if (r3 == 0) goto La2
            r3 = 4
            goto La3
        L69:
            boolean r3 = r2.equals(r6)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            if (r3 == 0) goto La2
            r3 = 0
            goto La3
        L71:
            java.lang.String r3 = "OnSwipe"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            if (r3 == 0) goto La2
            r3 = 2
            goto La3
        L7b:
            java.lang.String r3 = "OnClick"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            if (r3 == 0) goto La2
            r3 = 3
            goto La3
        L85:
            java.lang.String r4 = "Transition"
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            if (r4 == 0) goto La2
            goto La3
        L8e:
            java.lang.String r3 = "KeyFrameSet"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            if (r3 == 0) goto La2
            r3 = 6
            goto La3
        L98:
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            if (r3 == 0) goto La2
            r3 = 5
            goto La3
        La2:
            r3 = -1
        La3:
            switch(r3) {
                case 0: goto L13b;
                case 1: goto L107;
                case 2: goto Lce;
                case 3: goto Lc2;
                case 4: goto Lb9;
                case 5: goto Lb4;
                case 6: goto La8;
                default: goto La6;
            }     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
        La6:
            goto L13f
        La8:
            u.g r2 = new u.g     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r2.<init>(r9, r10)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            java.util.ArrayList<u.g> r3 = r0.f1651k     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r3.add(r2)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            goto L157
        Lb4:
            r8.m910j(r9, r10)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            goto L157
        Lb9:
            y.g r2 = new y.g     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r2.<init>(r9, r10)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r8.f1623b = r2     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            goto L157
        Lc2:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b$a> r2 = r0.f1653m     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            androidx.constraintlayout.motion.widget.b$b$a r3 = new androidx.constraintlayout.motion.widget.b$b$a     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r3.<init>(r9, r0, r10)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r2.add(r3)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            goto L157
        Lce:
            if (r0 != 0) goto Lfd
            android.content.res.Resources r2 = r9.getResources()     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            java.lang.String r2 = r2.getResourceEntryName(r11)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            int r3 = r10.getLineNumber()     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r4.<init>()     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            java.lang.String r5 = " OnSwipe ("
            r4.append(r5)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r4.append(r2)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            java.lang.String r2 = ".xml:"
            r4.append(r2)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r4.append(r3)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            java.lang.String r2 = ")"
            r4.append(r2)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            java.lang.String r2 = r4.toString()     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            android.util.Log.v(r6, r2)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
        Lfd:
            androidx.constraintlayout.motion.widget.c r2 = new androidx.constraintlayout.motion.widget.c     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r8.f1622a     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r2.<init>(r9, r3, r10)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r0.f1652l = r2     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            goto L157
        L107:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r0 = r8.f1625d     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            androidx.constraintlayout.motion.widget.b$b r2 = new androidx.constraintlayout.motion.widget.b$b     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r2.<init>(r8, r9, r10)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r0.add(r2)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            androidx.constraintlayout.motion.widget.b$b r0 = r8.f1624c     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            if (r0 != 0) goto L124
            boolean r0 = r2.f1642b     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            if (r0 != 0) goto L124
            r8.f1624c = r2     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            androidx.constraintlayout.motion.widget.c r0 = r2.f1652l     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            if (r0 == 0) goto L124
            boolean r3 = r8.f1637p     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r0.m918b(r3)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
        L124:
            boolean r0 = r2.f1642b     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            if (r0 == 0) goto L139
            int r0 = r2.f1643c     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            if (r0 != r7) goto L12f
            r8.f1626e = r2     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            goto L134
        L12f:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r0 = r8.f1627f     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r0.add(r2)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
        L134:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r0 = r8.f1625d     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r0.remove(r2)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
        L139:
            r0 = r2
            goto L157
        L13b:
            r8.m911k(r9, r10)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            goto L157
        L13f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r3.<init>()     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            java.lang.String r4 = "WARNING UNKNOWN ATTRIBUTE "
            r3.append(r4)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            r3.append(r2)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            java.lang.String r2 = r3.toString()     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            android.util.Log.v(r6, r2)     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            goto L157
        L154:
            r10.getName()     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
        L157:
            int r2 = r10.next()     // Catch: java.io.IOException -> L15d org.xmlpull.v1.XmlPullParserException -> L162
            goto L46
        L15d:
            r9 = move-exception
            r9.printStackTrace()
            goto L166
        L162:
            r9 = move-exception
            r9.printStackTrace()
        L166:
            android.util.SparseArray<androidx.constraintlayout.widget.b> r9 = r8.f1628g
            androidx.constraintlayout.widget.b r10 = new androidx.constraintlayout.widget.b
            r10.<init>()
            r11 = 2131362360(0x7f0a0238, float:1.8344498E38)
            r9.put(r11, r10)
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r8.f1629h
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            java.lang.String r11 = "motion_base"
            r9.put(r11, r10)
            return
    }

    /* renamed from: a */
    public boolean m901a(androidx.constraintlayout.motion.widget.MotionLayout r11, int r12) {
            r10 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$i r0 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1616b0
            androidx.constraintlayout.motion.widget.MotionLayout$i r1 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1615a0
            androidx.constraintlayout.motion.widget.MotionLayout$i r2 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0326i.f1614Z
            androidx.constraintlayout.motion.widget.MotionLayout$e r3 = r10.f1636o
            r4 = 1
            r5 = 0
            if (r3 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            if (r3 == 0) goto L12
            return r5
        L12:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r3 = r10.f1625d
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L92
            java.lang.Object r6 = r3.next()
            androidx.constraintlayout.motion.widget.b$b r6 = (androidx.constraintlayout.motion.widget.C0328b.b) r6
            int r7 = r6.f1654n
            if (r7 != 0) goto L29
            goto L18
        L29:
            androidx.constraintlayout.motion.widget.b$b r8 = r10.f1624c
            if (r8 != r6) goto L2e
            goto L18
        L2e:
            int r8 = r6.f1644d
            if (r12 != r8) goto L61
            r8 = 4
            if (r7 == r8) goto L38
            r9 = 2
            if (r7 != r9) goto L61
        L38:
            r11.setState(r0)
            r11.setTransition(r6)
            int r12 = r6.f1654n
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r12 != r8) goto L4e
            r11.m873s(r3)
            r11.setState(r2)
            r11.setState(r1)
            goto L60
        L4e:
            r11.setProgress(r3)
            r11.m874t(r4)
            r11.setState(r2)
            r11.setState(r1)
            r11.setState(r0)
            r11.m879y()
        L60:
            return r4
        L61:
            int r8 = r6.f1643c
            if (r12 != r8) goto L18
            r8 = 3
            if (r7 == r8) goto L6a
            if (r7 != r4) goto L18
        L6a:
            r11.setState(r0)
            r11.setTransition(r6)
            int r12 = r6.f1654n
            r3 = 0
            if (r12 != r8) goto L7f
            r11.m873s(r3)
            r11.setState(r2)
            r11.setState(r1)
            goto L91
        L7f:
            r11.setProgress(r3)
            r11.m874t(r4)
            r11.setState(r2)
            r11.setState(r1)
            r11.setState(r0)
            r11.m879y()
        L91:
            return r4
        L92:
            return r5
    }

    /* renamed from: b */
    public androidx.constraintlayout.widget.C0333b m902b(int r3) {
            r2 = this;
            y.g r0 = r2.f1623b
            if (r0 == 0) goto Lc
            r1 = -1
            int r0 = r0.m14214a(r3, r1, r1)
            if (r0 == r1) goto Lc
            r3 = r0
        Lc:
            android.util.SparseArray<androidx.constraintlayout.widget.b> r0 = r2.f1628g
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "Warning could not find ConstraintSet id/"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r2.f1622a
            android.content.Context r1 = r1.getContext()
            java.lang.String r3 = p346u.C6256a.m12871b(r1, r3)
            r0.append(r3)
            java.lang.String r3 = " In MotionScene"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "MotionScene"
            android.util.Log.e(r0, r3)
            android.util.SparseArray<androidx.constraintlayout.widget.b> r3 = r2.f1628g
            r0 = 0
            int r0 = r3.keyAt(r0)
            java.lang.Object r3 = r3.get(r0)
            goto L47
        L41:
            android.util.SparseArray<androidx.constraintlayout.widget.b> r0 = r2.f1628g
            java.lang.Object r3 = r0.get(r3)
        L47:
            androidx.constraintlayout.widget.b r3 = (androidx.constraintlayout.widget.C0333b) r3
            return r3
    }

    /* renamed from: c */
    public int m903c() {
            r1 = this;
            androidx.constraintlayout.motion.widget.b$b r0 = r1.f1624c
            if (r0 == 0) goto L7
            int r0 = r0.f1648h
            return r0
        L7:
            int r0 = r1.f1631j
            return r0
    }

    /* renamed from: d */
    public int m904d() {
            r1 = this;
            androidx.constraintlayout.motion.widget.b$b r0 = r1.f1624c
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int r0 = r0.f1643c
            return r0
    }

    /* renamed from: e */
    public final int m905e(android.content.Context r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = "/"
            boolean r0 = r7.contains(r0)
            r1 = -1
            r2 = 1
            if (r0 == 0) goto L24
            r0 = 47
            int r0 = r7.indexOf(r0)
            int r0 = r0 + r2
            java.lang.String r0 = r7.substring(r0)
            android.content.res.Resources r3 = r6.getResources()
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r4 = "id"
            int r6 = r3.getIdentifier(r0, r4, r6)
            goto L25
        L24:
            r6 = -1
        L25:
            if (r6 != r1) goto L3d
            int r0 = r7.length()
            if (r0 <= r2) goto L36
            java.lang.String r6 = r7.substring(r2)
            int r6 = java.lang.Integer.parseInt(r6)
            goto L3d
        L36:
            java.lang.String r7 = "MotionScene"
            java.lang.String r0 = "error in parsing id"
            android.util.Log.e(r7, r0)
        L3d:
            return r6
    }

    /* renamed from: f */
    public android.view.animation.Interpolator m906f() {
            r3 = this;
            androidx.constraintlayout.motion.widget.b$b r0 = r3.f1624c
            int r1 = r0.f1645e
            r2 = -2
            if (r1 == r2) goto L44
            r2 = -1
            if (r1 == r2) goto L38
            if (r1 == 0) goto L32
            r0 = 1
            if (r1 == r0) goto L2c
            r0 = 2
            if (r1 == r0) goto L26
            r0 = 4
            if (r1 == r0) goto L20
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 0
            return r0
        L1a:
            android.view.animation.BounceInterpolator r0 = new android.view.animation.BounceInterpolator
            r0.<init>()
            return r0
        L20:
            android.view.animation.AnticipateInterpolator r0 = new android.view.animation.AnticipateInterpolator
            r0.<init>()
            return r0
        L26:
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            return r0
        L2c:
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            return r0
        L32:
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            return r0
        L38:
            java.lang.String r0 = r0.f1646f
            t.c r0 = p331t.C6088c.m12542c(r0)
            androidx.constraintlayout.motion.widget.b$a r1 = new androidx.constraintlayout.motion.widget.b$a
            r1.<init>(r3, r0)
            return r1
        L44:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.f1622a
            android.content.Context r0 = r0.getContext()
            androidx.constraintlayout.motion.widget.b$b r1 = r3.f1624c
            int r1 = r1.f1647g
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r0, r1)
            return r0
    }

    /* renamed from: g */
    public void m907g(p346u.C6270o r3) {
            r2 = this;
            androidx.constraintlayout.motion.widget.b$b r0 = r2.f1624c
            if (r0 != 0) goto L1f
            androidx.constraintlayout.motion.widget.b$b r0 = r2.f1626e
            if (r0 == 0) goto L1e
            java.util.ArrayList<u.g> r0 = r0.f1651k
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            u.g r1 = (p346u.C6262g) r1
            r1.m12881a(r3)
            goto Le
        L1e:
            return
        L1f:
            java.util.ArrayList<u.g> r0 = r0.f1651k
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            u.g r1 = (p346u.C6262g) r1
            r1.m12881a(r3)
            goto L25
        L35:
            return
    }

    /* renamed from: h */
    public float m908h() {
            r1 = this;
            androidx.constraintlayout.motion.widget.b$b r0 = r1.f1624c
            if (r0 == 0) goto Lb
            androidx.constraintlayout.motion.widget.c r0 = r0.f1652l
            if (r0 == 0) goto Lb
            float r0 = r0.f1680q
            return r0
        Lb:
            r0 = 0
            return r0
    }

    /* renamed from: i */
    public int m909i() {
            r1 = this;
            androidx.constraintlayout.motion.widget.b$b r0 = r1.f1624c
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int r0 = r0.f1644d
            return r0
    }

    /* renamed from: j */
    public final void m910j(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
            r9 = this;
            androidx.constraintlayout.widget.b r0 = new androidx.constraintlayout.widget.b
            r0.<init>()
            r1 = 0
            r0.f1789b = r1
            int r2 = r11.getAttributeCount()
            r3 = -1
            r4 = -1
            r5 = -1
        Lf:
            if (r1 >= r2) goto L51
            java.lang.String r6 = r11.getAttributeName(r1)
            java.lang.String r7 = r11.getAttributeValue(r1)
            java.util.Objects.requireNonNull(r6)
            java.lang.String r8 = "deriveConstraintsFrom"
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L4a
            java.lang.String r8 = "id"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L2d
            goto L4e
        L2d:
            int r4 = r9.m905e(r10, r7)
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r9.f1629h
            r8 = 47
            int r8 = r7.indexOf(r8)
            if (r8 >= 0) goto L3c
            goto L42
        L3c:
            int r8 = r8 + 1
            java.lang.String r7 = r7.substring(r8)
        L42:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r6.put(r7, r8)
            goto L4e
        L4a:
            int r5 = r9.m905e(r10, r7)
        L4e:
            int r1 = r1 + 1
            goto Lf
        L51:
            if (r4 == r3) goto L66
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r9.f1622a
            int r1 = r1.f1532K0
            r0.m952k(r10, r11)
            if (r5 == r3) goto L61
            android.util.SparseIntArray r10 = r9.f1630i
            r10.put(r4, r5)
        L61:
            android.util.SparseArray<androidx.constraintlayout.widget.b> r10 = r9.f1628g
            r10.put(r4, r0)
        L66:
            return
    }

    /* renamed from: k */
    public final void m911k(android.content.Context r5, org.xmlpull.v1.XmlPullParser r6) {
            r4 = this;
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r6)
            int[] r0 = p422y.C7096f.f27468n
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r0)
            int r6 = r5.getIndexCount()
            r0 = 0
            r1 = 0
        L10:
            if (r1 >= r6) goto L2d
            int r2 = r5.getIndex(r1)
            if (r2 != 0) goto L21
            int r3 = r4.f1631j
            int r2 = r5.getInt(r2, r3)
            r4.f1631j = r2
            goto L2a
        L21:
            r3 = 1
            if (r2 != r3) goto L2a
            int r2 = r5.getInteger(r2, r0)
            r4.f1632k = r2
        L2a:
            int r1 = r1 + 1
            goto L10
        L2d:
            r5.recycle()
            return
    }

    /* renamed from: l */
    public final void m912l(int r10) {
            r9 = this;
            android.util.SparseIntArray r0 = r9.f1630i
            int r0 = r0.get(r10)
            if (r0 <= 0) goto Le7
            android.util.SparseIntArray r1 = r9.f1630i
            int r1 = r1.get(r10)
            r9.m912l(r1)
            android.util.SparseArray<androidx.constraintlayout.widget.b> r1 = r9.f1628g
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.widget.b r1 = (androidx.constraintlayout.widget.C0333b) r1
            android.util.SparseArray<androidx.constraintlayout.widget.b> r2 = r9.f1628g
            java.lang.Object r2 = r2.get(r0)
            androidx.constraintlayout.widget.b r2 = (androidx.constraintlayout.widget.C0333b) r2
            if (r2 != 0) goto L40
            java.lang.String r10 = "ERROR! invalid deriveConstraintsFrom: @id/"
            java.lang.StringBuilder r10 = android.support.v4.media.C0144c.m256a(r10)
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r9.f1622a
            android.content.Context r1 = r1.getContext()
            java.lang.String r0 = p346u.C6256a.m12871b(r1, r0)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "MotionScene"
            android.util.Log.e(r0, r10)
            return
        L40:
            java.util.Objects.requireNonNull(r1)
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r0 = r2.f1790c
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L4d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Le1
            java.lang.Object r3 = r0.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r5 = r2.f1790c
            java.lang.Object r3 = r5.get(r3)
            androidx.constraintlayout.widget.b$a r3 = (androidx.constraintlayout.widget.C0333b.a) r3
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r5 = r1.f1790c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r5 = r5.containsKey(r6)
            if (r5 != 0) goto L7f
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r5 = r1.f1790c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            androidx.constraintlayout.widget.b$a r7 = new androidx.constraintlayout.widget.b$a
            r7.<init>()
            r5.put(r6, r7)
        L7f:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r5 = r1.f1790c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r5.get(r4)
            androidx.constraintlayout.widget.b$a r4 = (androidx.constraintlayout.widget.C0333b.a) r4
            androidx.constraintlayout.widget.b$b r5 = r4.f1794d
            boolean r6 = r5.f1826b
            if (r6 != 0) goto L96
            androidx.constraintlayout.widget.b$b r6 = r3.f1794d
            r5.m957a(r6)
        L96:
            androidx.constraintlayout.widget.b$d r5 = r4.f1792b
            boolean r6 = r5.f1868a
            if (r6 != 0) goto La1
            androidx.constraintlayout.widget.b$d r6 = r3.f1792b
            r5.m961a(r6)
        La1:
            androidx.constraintlayout.widget.b$e r5 = r4.f1795e
            boolean r6 = r5.f1874a
            if (r6 != 0) goto Lac
            androidx.constraintlayout.widget.b$e r6 = r3.f1795e
            r5.m963a(r6)
        Lac:
            androidx.constraintlayout.widget.b$c r5 = r4.f1793c
            boolean r6 = r5.f1861a
            if (r6 != 0) goto Lb7
            androidx.constraintlayout.widget.b$c r6 = r3.f1793c
            r5.m959a(r6)
        Lb7:
            java.util.HashMap<java.lang.String, y.a> r5 = r3.f1796f
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        Lc1:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4d
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.HashMap<java.lang.String, y.a> r7 = r4.f1796f
            boolean r7 = r7.containsKey(r6)
            if (r7 != 0) goto Lc1
            java.util.HashMap<java.lang.String, y.a> r7 = r4.f1796f
            java.util.HashMap<java.lang.String, y.a> r8 = r3.f1796f
            java.lang.Object r8 = r8.get(r6)
            r7.put(r6, r8)
            goto Lc1
        Le1:
            android.util.SparseIntArray r0 = r9.f1630i
            r1 = -1
            r0.put(r10, r1)
        Le7:
            return
    }

    /* renamed from: m */
    public void m913m(int r8, int r9) {
            r7 = this;
            y.g r0 = r7.f1623b
            r1 = -1
            if (r0 == 0) goto L16
            int r0 = r0.m14214a(r8, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r8
        Ld:
            y.g r2 = r7.f1623b
            int r2 = r2.m14214a(r9, r1, r1)
            if (r2 == r1) goto L17
            goto L18
        L16:
            r0 = r8
        L17:
            r2 = r9
        L18:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r3 = r7.f1625d
            java.util.Iterator r3 = r3.iterator()
        L1e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.b$b r4 = (androidx.constraintlayout.motion.widget.C0328b.b) r4
            int r5 = r4.f1643c
            if (r5 != r2) goto L32
            int r6 = r4.f1644d
            if (r6 == r0) goto L38
        L32:
            if (r5 != r9) goto L1e
            int r5 = r4.f1644d
            if (r5 != r8) goto L1e
        L38:
            r7.f1624c = r4
            androidx.constraintlayout.motion.widget.c r8 = r4.f1652l
            if (r8 == 0) goto L43
            boolean r9 = r7.f1637p
            r8.m918b(r9)
        L43:
            return
        L44:
            androidx.constraintlayout.motion.widget.b$b r8 = r7.f1626e
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r3 = r7.f1627f
            java.util.Iterator r3 = r3.iterator()
        L4c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.b$b r4 = (androidx.constraintlayout.motion.widget.C0328b.b) r4
            int r5 = r4.f1643c
            if (r5 != r9) goto L4c
            r8 = r4
            goto L4c
        L5e:
            androidx.constraintlayout.motion.widget.b$b r9 = new androidx.constraintlayout.motion.widget.b$b
            r9.<init>(r7, r8)
            r9.f1644d = r0
            r9.f1643c = r2
            if (r0 == r1) goto L6e
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r8 = r7.f1625d
            r8.add(r9)
        L6e:
            r7.f1624c = r9
            return
    }

    /* renamed from: n */
    public boolean m914n() {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.b$b> r0 = r3.f1625d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.b$b r1 = (androidx.constraintlayout.motion.widget.C0328b.b) r1
            androidx.constraintlayout.motion.widget.c r1 = r1.f1652l
            if (r1 == 0) goto L6
            return r2
        L18:
            androidx.constraintlayout.motion.widget.b$b r0 = r3.f1624c
            if (r0 == 0) goto L21
            androidx.constraintlayout.motion.widget.c r0 = r0.f1652l
            if (r0 == 0) goto L21
            goto L22
        L21:
            r2 = 0
        L22:
            return r2
    }
}
