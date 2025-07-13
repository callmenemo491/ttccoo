package p422y;

/* renamed from: y.b */
/* loaded from: classes.dex */
public class C7092b {

    /* renamed from: a */
    public final androidx.constraintlayout.widget.ConstraintLayout f27439a;

    /* renamed from: b */
    public int f27440b;

    /* renamed from: c */
    public int f27441c;

    /* renamed from: d */
    public android.util.SparseArray<p422y.C7092b.a> f27442d;

    /* renamed from: e */
    public android.util.SparseArray<androidx.constraintlayout.widget.C0333b> f27443e;

    /* renamed from: y.b$a */
    public static class a {

        /* renamed from: a */
        public int f27444a;

        /* renamed from: b */
        public java.util.ArrayList<p422y.C7092b.b> f27445b;

        /* renamed from: c */
        public int f27446c;

        /* renamed from: d */
        public androidx.constraintlayout.widget.C0333b f27447d;

        public a(android.content.Context r7, org.xmlpull.v1.XmlPullParser r8) {
                r6 = this;
                r6.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r6.f27445b = r0
                r0 = -1
                r6.f27446c = r0
                android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r8)
                int[] r0 = p422y.C7096f.f27472r
                android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r0)
                int r0 = r8.getIndexCount()
                r1 = 0
            L1c:
                if (r1 >= r0) goto L6d
                int r2 = r8.getIndex(r1)
                if (r2 != 0) goto L2d
                int r3 = r6.f27444a
                int r2 = r8.getResourceId(r2, r3)
                r6.f27444a = r2
                goto L6a
            L2d:
                r3 = 1
                if (r2 != r3) goto L6a
                int r3 = r6.f27446c
                int r2 = r8.getResourceId(r2, r3)
                r6.f27446c = r2
                android.content.res.Resources r2 = r7.getResources()
                int r3 = r6.f27446c
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r7.getResources()
                int r4 = r6.f27446c
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L6a
                androidx.constraintlayout.widget.b r2 = new androidx.constraintlayout.widget.b
                r2.<init>()
                r6.f27447d = r2
                int r3 = r6.f27446c
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r7)
                r5 = 0
                android.view.View r3 = r4.inflate(r3, r5)
                androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
                r2.m946e(r3)
            L6a:
                int r1 = r1 + 1
                goto L1c
            L6d:
                r8.recycle()
                return
        }

        /* renamed from: a */
        public int m14207a(float r3, float r4) {
                r2 = this;
                r0 = 0
            L1:
                java.util.ArrayList<y.b$b> r1 = r2.f27445b
                int r1 = r1.size()
                if (r0 >= r1) goto L1b
                java.util.ArrayList<y.b$b> r1 = r2.f27445b
                java.lang.Object r1 = r1.get(r0)
                y.b$b r1 = (p422y.C7092b.b) r1
                boolean r1 = r1.m14208a(r3, r4)
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

    /* renamed from: y.b$b */
    public static class b {

        /* renamed from: a */
        public float f27448a;

        /* renamed from: b */
        public float f27449b;

        /* renamed from: c */
        public float f27450c;

        /* renamed from: d */
        public float f27451d;

        /* renamed from: e */
        public int f27452e;

        /* renamed from: f */
        public androidx.constraintlayout.widget.C0333b f27453f;

        public b(android.content.Context r7, org.xmlpull.v1.XmlPullParser r8) {
                r6 = this;
                r6.<init>()
                r0 = 2143289344(0x7fc00000, float:NaN)
                r6.f27448a = r0
                r6.f27449b = r0
                r6.f27450c = r0
                r6.f27451d = r0
                r0 = -1
                r6.f27452e = r0
                android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r8)
                int[] r0 = p422y.C7096f.f27476v
                android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r0)
                int r0 = r8.getIndexCount()
                r1 = 0
            L1f:
                if (r1 >= r0) goto L9c
                int r2 = r8.getIndex(r1)
                if (r2 != 0) goto L62
                int r3 = r6.f27452e
                int r2 = r8.getResourceId(r2, r3)
                r6.f27452e = r2
                android.content.res.Resources r2 = r7.getResources()
                int r3 = r6.f27452e
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r7.getResources()
                int r4 = r6.f27452e
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L99
                androidx.constraintlayout.widget.b r2 = new androidx.constraintlayout.widget.b
                r2.<init>()
                r6.f27453f = r2
                int r3 = r6.f27452e
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r7)
                r5 = 0
                android.view.View r3 = r4.inflate(r3, r5)
                androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
                r2.m946e(r3)
                goto L99
            L62:
                r3 = 1
                if (r2 != r3) goto L6e
                float r3 = r6.f27451d
                float r2 = r8.getDimension(r2, r3)
                r6.f27451d = r2
                goto L99
            L6e:
                r3 = 2
                if (r2 != r3) goto L7a
                float r3 = r6.f27449b
                float r2 = r8.getDimension(r2, r3)
                r6.f27449b = r2
                goto L99
            L7a:
                r3 = 3
                if (r2 != r3) goto L86
                float r3 = r6.f27450c
                float r2 = r8.getDimension(r2, r3)
                r6.f27450c = r2
                goto L99
            L86:
                r3 = 4
                if (r2 != r3) goto L92
                float r3 = r6.f27448a
                float r2 = r8.getDimension(r2, r3)
                r6.f27448a = r2
                goto L99
            L92:
                java.lang.String r2 = "ConstraintLayoutStates"
                java.lang.String r3 = "Unknown tag"
                android.util.Log.v(r2, r3)
            L99:
                int r1 = r1 + 1
                goto L1f
            L9c:
                r8.recycle()
                return
        }

        /* renamed from: a */
        public boolean m14208a(float r3, float r4) {
                r2 = this;
                float r0 = r2.f27448a
                boolean r0 = java.lang.Float.isNaN(r0)
                r1 = 0
                if (r0 != 0) goto L10
                float r0 = r2.f27448a
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 >= 0) goto L10
                return r1
            L10:
                float r0 = r2.f27449b
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 != 0) goto L1f
                float r0 = r2.f27449b
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 >= 0) goto L1f
                return r1
            L1f:
                float r0 = r2.f27450c
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 != 0) goto L2e
                float r0 = r2.f27450c
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 <= 0) goto L2e
                return r1
            L2e:
                float r3 = r2.f27451d
                boolean r3 = java.lang.Float.isNaN(r3)
                if (r3 != 0) goto L3d
                float r3 = r2.f27451d
                int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r3 <= 0) goto L3d
                return r1
            L3d:
                r3 = 1
                return r3
        }
    }

    public C7092b(android.content.Context r8, androidx.constraintlayout.widget.ConstraintLayout r9, int r10) {
            r7 = this;
            r7.<init>()
            r0 = -1
            r7.f27440b = r0
            r7.f27441c = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f27442d = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f27443e = r1
            r7.f27439a = r9
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r9.getXml(r10)
            int r10 = r9.getEventType()     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            r1 = 0
        L25:
            r2 = 1
            if (r10 == r2) goto Lc2
            if (r10 == 0) goto Lb0
            r3 = 2
            if (r10 == r3) goto L2f
            goto Lb3
        L2f:
            java.lang.String r10 = r9.getName()     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            int r4 = r10.hashCode()     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L65;
                case 80204913: goto L5b;
                case 1382829617: goto L51;
                case 1657696882: goto L47;
                case 1901439077: goto L3d;
                default: goto L3c;
            }     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
        L3c:
            goto L6f
        L3d:
            java.lang.String r4 = "Variant"
            boolean r4 = r10.equals(r4)     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            if (r4 == 0) goto L6f
            r4 = 3
            goto L70
        L47:
            java.lang.String r4 = "layoutDescription"
            boolean r4 = r10.equals(r4)     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            if (r4 == 0) goto L6f
            r4 = 0
            goto L70
        L51:
            java.lang.String r4 = "StateSet"
            boolean r4 = r10.equals(r4)     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            if (r4 == 0) goto L6f
            r4 = 1
            goto L70
        L5b:
            java.lang.String r4 = "State"
            boolean r4 = r10.equals(r4)     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            if (r4 == 0) goto L6f
            r4 = 2
            goto L70
        L65:
            java.lang.String r4 = "ConstraintSet"
            boolean r4 = r10.equals(r4)     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            if (r4 == 0) goto L6f
            r4 = 4
            goto L70
        L6f:
            r4 = -1
        L70:
            if (r4 == 0) goto Lb3
            if (r4 == r2) goto Lb3
            if (r4 == r3) goto La2
            if (r4 == r6) goto L95
            if (r4 == r5) goto L91
            java.lang.String r2 = "ConstraintLayoutStates"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            r3.<init>()     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            java.lang.String r4 = "unknown tag "
            r3.append(r4)     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            r3.append(r10)     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            java.lang.String r10 = r3.toString()     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            android.util.Log.v(r2, r10)     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            goto Lb3
        L91:
            r7.m14206a(r8, r9)     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            goto Lb3
        L95:
            y.b$b r10 = new y.b$b     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            r10.<init>(r8, r9)     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            if (r1 == 0) goto Lb3
            java.util.ArrayList<y.b$b> r2 = r1.f27445b     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            r2.add(r10)     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            goto Lb3
        La2:
            y.b$a r10 = new y.b$a     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            r10.<init>(r8, r9)     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            android.util.SparseArray<y.b$a> r1 = r7.f27442d     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            int r2 = r10.f27444a     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            r1.put(r2, r10)     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            r1 = r10
            goto Lb3
        Lb0:
            r9.getName()     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
        Lb3:
            int r10 = r9.next()     // Catch: java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbe
            goto L25
        Lb9:
            r8 = move-exception
            r8.printStackTrace()
            goto Lc2
        Lbe:
            r8 = move-exception
            r8.printStackTrace()
        Lc2:
            return
    }

    /* renamed from: a */
    public final void m14206a(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
            r8 = this;
            androidx.constraintlayout.widget.b r0 = new androidx.constraintlayout.widget.b
            r0.<init>()
            int r1 = r10.getAttributeCount()
            r2 = 0
        La:
            if (r2 >= r1) goto L63
            java.lang.String r3 = r10.getAttributeName(r2)
            java.lang.String r4 = "id"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L60
            java.lang.String r1 = r10.getAttributeValue(r2)
            java.lang.String r2 = "/"
            boolean r2 = r1.contains(r2)
            r3 = -1
            r5 = 1
            if (r2 == 0) goto L3e
            r2 = 47
            int r2 = r1.indexOf(r2)
            int r2 = r2 + r5
            java.lang.String r2 = r1.substring(r2)
            android.content.res.Resources r6 = r9.getResources()
            java.lang.String r7 = r9.getPackageName()
            int r2 = r6.getIdentifier(r2, r4, r7)
            goto L3f
        L3e:
            r2 = -1
        L3f:
            if (r2 != r3) goto L57
            int r3 = r1.length()
            if (r3 <= r5) goto L50
            java.lang.String r1 = r1.substring(r5)
            int r2 = java.lang.Integer.parseInt(r1)
            goto L57
        L50:
            java.lang.String r1 = "ConstraintLayoutStates"
            java.lang.String r3 = "error in parsing id"
            android.util.Log.e(r1, r3)
        L57:
            r0.m952k(r9, r10)
            android.util.SparseArray<androidx.constraintlayout.widget.b> r9 = r8.f27443e
            r9.put(r2, r0)
            goto L63
        L60:
            int r2 = r2 + 1
            goto La
        L63:
            return
    }
}
