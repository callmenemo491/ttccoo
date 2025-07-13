package p422y;

/* renamed from: y.g */
/* loaded from: classes.dex */
public class C7097g {

    /* renamed from: a */
    public int f27477a;

    /* renamed from: b */
    public android.util.SparseArray<p422y.C7097g.a> f27478b;

    /* renamed from: y.g$a */
    public static class a {

        /* renamed from: a */
        public int f27479a;

        /* renamed from: b */
        public java.util.ArrayList<p422y.C7097g.b> f27480b;

        /* renamed from: c */
        public int f27481c;

        public a(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.f27480b = r0
                r0 = -1
                r5.f27481c = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r0 = p422y.C7096f.f27472r
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
                int r0 = r7.getIndexCount()
                r1 = 0
            L1c:
                if (r1 >= r0) goto L53
                int r2 = r7.getIndex(r1)
                if (r2 != 0) goto L2d
                int r3 = r5.f27479a
                int r2 = r7.getResourceId(r2, r3)
                r5.f27479a = r2
                goto L50
            L2d:
                r3 = 1
                if (r2 != r3) goto L50
                int r3 = r5.f27481c
                int r2 = r7.getResourceId(r2, r3)
                r5.f27481c = r2
                android.content.res.Resources r2 = r6.getResources()
                int r3 = r5.f27481c
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r6.getResources()
                int r4 = r5.f27481c
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                r3.equals(r2)
            L50:
                int r1 = r1 + 1
                goto L1c
            L53:
                r7.recycle()
                return
        }

        /* renamed from: a */
        public int m14215a(float r3, float r4) {
                r2 = this;
                r0 = 0
            L1:
                java.util.ArrayList<y.g$b> r1 = r2.f27480b
                int r1 = r1.size()
                if (r0 >= r1) goto L1b
                java.util.ArrayList<y.g$b> r1 = r2.f27480b
                java.lang.Object r1 = r1.get(r0)
                y.g$b r1 = (p422y.C7097g.b) r1
                boolean r1 = r1.m14216a(r3, r4)
                if (r1 == 0) goto L18
                return r0
            L18:
                int r0 = r0 + 1
                goto L1
            L1b:
                r3 = -1
                return r3
        }
    }

    /* renamed from: y.g$b */
    public static class b {

        /* renamed from: a */
        public float f27482a;

        /* renamed from: b */
        public float f27483b;

        /* renamed from: c */
        public float f27484c;

        /* renamed from: d */
        public float f27485d;

        /* renamed from: e */
        public int f27486e;

        public b(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                r0 = 2143289344(0x7fc00000, float:NaN)
                r5.f27482a = r0
                r5.f27483b = r0
                r5.f27484c = r0
                r5.f27485d = r0
                r0 = -1
                r5.f27486e = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r0 = p422y.C7096f.f27476v
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
                int r0 = r7.getIndexCount()
                r1 = 0
            L1f:
                if (r1 >= r0) goto L82
                int r2 = r7.getIndex(r1)
                if (r2 != 0) goto L48
                int r3 = r5.f27486e
                int r2 = r7.getResourceId(r2, r3)
                r5.f27486e = r2
                android.content.res.Resources r2 = r6.getResources()
                int r3 = r5.f27486e
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r6.getResources()
                int r4 = r5.f27486e
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                r3.equals(r2)
                goto L7f
            L48:
                r3 = 1
                if (r2 != r3) goto L54
                float r3 = r5.f27485d
                float r2 = r7.getDimension(r2, r3)
                r5.f27485d = r2
                goto L7f
            L54:
                r3 = 2
                if (r2 != r3) goto L60
                float r3 = r5.f27483b
                float r2 = r7.getDimension(r2, r3)
                r5.f27483b = r2
                goto L7f
            L60:
                r3 = 3
                if (r2 != r3) goto L6c
                float r3 = r5.f27484c
                float r2 = r7.getDimension(r2, r3)
                r5.f27484c = r2
                goto L7f
            L6c:
                r3 = 4
                if (r2 != r3) goto L78
                float r3 = r5.f27482a
                float r2 = r7.getDimension(r2, r3)
                r5.f27482a = r2
                goto L7f
            L78:
                java.lang.String r2 = "ConstraintLayoutStates"
                java.lang.String r3 = "Unknown tag"
                android.util.Log.v(r2, r3)
            L7f:
                int r1 = r1 + 1
                goto L1f
            L82:
                r7.recycle()
                return
        }

        /* renamed from: a */
        public boolean m14216a(float r3, float r4) {
                r2 = this;
                float r0 = r2.f27482a
                boolean r0 = java.lang.Float.isNaN(r0)
                r1 = 0
                if (r0 != 0) goto L10
                float r0 = r2.f27482a
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 >= 0) goto L10
                return r1
            L10:
                float r0 = r2.f27483b
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 != 0) goto L1f
                float r0 = r2.f27483b
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 >= 0) goto L1f
                return r1
            L1f:
                float r0 = r2.f27484c
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 != 0) goto L2e
                float r0 = r2.f27484c
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 <= 0) goto L2e
                return r1
            L2e:
                float r3 = r2.f27485d
                boolean r3 = java.lang.Float.isNaN(r3)
                if (r3 != 0) goto L3d
                float r3 = r2.f27485d
                int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r3 <= 0) goto L3d
                return r1
            L3d:
                r3 = 1
                return r3
        }
    }

    public C7097g(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f27477a = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r9.f27478b = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r11)
            int[] r2 = p422y.C7096f.f27473s
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r1, r2)
            int r2 = r1.getIndexCount()
            r3 = 0
            r4 = 0
        L22:
            if (r4 >= r2) goto L35
            int r5 = r1.getIndex(r4)
            if (r5 != 0) goto L32
            int r6 = r9.f27477a
            int r5 = r1.getResourceId(r5, r6)
            r9.f27477a = r5
        L32:
            int r4 = r4 + 1
            goto L22
        L35:
            r1.recycle()
            r1 = 0
            int r2 = r11.getEventType()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
        L3d:
            r4 = 1
            if (r2 == r4) goto Ld6
            if (r2 == 0) goto Lc4
            java.lang.String r5 = "StateSet"
            r6 = 3
            r7 = 2
            if (r2 == r7) goto L58
            if (r2 == r6) goto L4c
            goto Lc7
        L4c:
            java.lang.String r2 = r11.getName()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            boolean r2 = r5.equals(r2)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            if (r2 == 0) goto Lc7
            goto Ld6
        L58:
            java.lang.String r2 = r11.getName()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            int r8 = r2.hashCode()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            switch(r8) {
                case 80204913: goto L80;
                case 1301459538: goto L76;
                case 1382829617: goto L6e;
                case 1901439077: goto L64;
                default: goto L63;
            }     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
        L63:
            goto L8a
        L64:
            java.lang.String r5 = "Variant"
            boolean r5 = r2.equals(r5)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            if (r5 == 0) goto L8a
            r5 = 3
            goto L8b
        L6e:
            boolean r5 = r2.equals(r5)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            if (r5 == 0) goto L8a
            r5 = 1
            goto L8b
        L76:
            java.lang.String r5 = "LayoutDescription"
            boolean r5 = r2.equals(r5)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            if (r5 == 0) goto L8a
            r5 = 0
            goto L8b
        L80:
            java.lang.String r5 = "State"
            boolean r5 = r2.equals(r5)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            if (r5 == 0) goto L8a
            r5 = 2
            goto L8b
        L8a:
            r5 = -1
        L8b:
            if (r5 == 0) goto Lc7
            if (r5 == r4) goto Lc7
            if (r5 == r7) goto Lb7
            if (r5 == r6) goto Laa
            java.lang.String r4 = "ConstraintLayoutStates"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            r5.<init>()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            java.lang.String r6 = "unknown tag "
            r5.append(r6)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            r5.append(r2)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            java.lang.String r2 = r5.toString()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            android.util.Log.v(r4, r2)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            goto Lc7
        Laa:
            y.g$b r2 = new y.g$b     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            r2.<init>(r10, r11)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            if (r1 == 0) goto Lc7
            java.util.ArrayList<y.g$b> r4 = r1.f27480b     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            r4.add(r2)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            goto Lc7
        Lb7:
            y.g$a r1 = new y.g$a     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            r1.<init>(r10, r11)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            android.util.SparseArray<y.g$a> r2 = r9.f27478b     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            int r4 = r1.f27479a     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            r2.put(r4, r1)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            goto Lc7
        Lc4:
            r11.getName()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
        Lc7:
            int r2 = r11.next()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            goto L3d
        Lcd:
            r10 = move-exception
            r10.printStackTrace()
            goto Ld6
        Ld2:
            r10 = move-exception
            r10.printStackTrace()
        Ld6:
            return
    }

    /* renamed from: a */
    public int m14214a(int r3, int r4, int r5) {
            r2 = this;
            float r4 = (float) r4
            float r5 = (float) r5
            r0 = -1
            if (r0 != r3) goto L32
            if (r3 != r0) goto Lf
            android.util.SparseArray<y.g$a> r3 = r2.f27478b
            r1 = 0
            java.lang.Object r3 = r3.valueAt(r1)
            goto L15
        Lf:
            android.util.SparseArray<y.g$a> r3 = r2.f27478b
            java.lang.Object r3 = r3.get(r0)
        L15:
            y.g$a r3 = (p422y.C7097g.a) r3
            if (r3 != 0) goto L1a
            goto L44
        L1a:
            int r4 = r3.m14215a(r4, r5)
            if (r0 != r4) goto L21
            goto L44
        L21:
            if (r4 != r0) goto L26
        L23:
            int r3 = r3.f27481c
            goto L30
        L26:
            java.util.ArrayList<y.g$b> r3 = r3.f27480b
            java.lang.Object r3 = r3.get(r4)
            y.g$b r3 = (p422y.C7097g.b) r3
            int r3 = r3.f27486e
        L30:
            r0 = r3
            goto L44
        L32:
            android.util.SparseArray<y.g$a> r1 = r2.f27478b
            java.lang.Object r3 = r1.get(r3)
            y.g$a r3 = (p422y.C7097g.a) r3
            if (r3 != 0) goto L3d
            goto L44
        L3d:
            int r4 = r3.m14215a(r4, r5)
            if (r4 != r0) goto L26
            goto L23
        L44:
            return r0
    }
}
