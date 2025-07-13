package p065e0;

/* renamed from: e0.h */
/* loaded from: classes.dex */
public final class C1503h {

    /* renamed from: a */
    public static final java.lang.ThreadLocal<android.util.TypedValue> f7314a = null;

    /* renamed from: b */
    public static final java.util.WeakHashMap<p065e0.C1503h.b, android.util.SparseArray<p065e0.C1503h.a>> f7315b = null;

    /* renamed from: c */
    public static final java.lang.Object f7316c = null;

    /* renamed from: e0.h$a */
    public static class a {

        /* renamed from: a */
        public final android.content.res.ColorStateList f7317a;

        /* renamed from: b */
        public final android.content.res.Configuration f7318b;

        public a(android.content.res.ColorStateList r1, android.content.res.Configuration r2) {
                r0 = this;
                r0.<init>()
                r0.f7317a = r1
                r0.f7318b = r2
                return
        }
    }

    /* renamed from: e0.h$b */
    public static final class b {

        /* renamed from: a */
        public final android.content.res.Resources f7319a;

        /* renamed from: b */
        public final android.content.res.Resources.Theme f7320b;

        public b(android.content.res.Resources r1, android.content.res.Resources.Theme r2) {
                r0 = this;
                r0.<init>()
                r0.f7319a = r1
                r0.f7320b = r2
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L29
                java.lang.Class<e0.h$b> r2 = p065e0.C1503h.b.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L29
            L10:
                e0.h$b r5 = (p065e0.C1503h.b) r5
                android.content.res.Resources r2 = r4.f7319a
                android.content.res.Resources r3 = r5.f7319a
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L27
                android.content.res.Resources$Theme r2 = r4.f7320b
                android.content.res.Resources$Theme r5 = r5.f7320b
                boolean r5 = java.util.Objects.equals(r2, r5)
                if (r5 == 0) goto L27
                goto L28
            L27:
                r0 = 0
            L28:
                return r0
            L29:
                return r1
        }

        public int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                android.content.res.Resources r1 = r3.f7319a
                r2 = 0
                r0[r2] = r1
                android.content.res.Resources$Theme r1 = r3.f7320b
                r2 = 1
                r0[r2] = r1
                int r0 = java.util.Objects.hash(r0)
                return r0
        }
    }

    /* renamed from: e0.h$c */
    public static abstract class c {

        /* renamed from: e0.h$c$a */
        public class a implements java.lang.Runnable {

            /* renamed from: Y */
            public final /* synthetic */ android.graphics.Typeface f7321Y;

            /* renamed from: Z */
            public final /* synthetic */ p065e0.C1503h.c f7322Z;

            public a(p065e0.C1503h.c r1, android.graphics.Typeface r2) {
                    r0 = this;
                    r0.f7322Z = r1
                    r0.f7321Y = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    e0.h$c r0 = r2.f7322Z
                    android.graphics.Typeface r1 = r2.f7321Y
                    r0.mo846e(r1)
                    return
            }
        }

        /* renamed from: e0.h$c$b */
        public class b implements java.lang.Runnable {

            /* renamed from: Y */
            public final /* synthetic */ int f7323Y;

            /* renamed from: Z */
            public final /* synthetic */ p065e0.C1503h.c f7324Z;

            public b(p065e0.C1503h.c r1, int r2) {
                    r0 = this;
                    r0.f7324Z = r1
                    r0.f7323Y = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    e0.h$c r0 = r2.f7324Z
                    int r1 = r2.f7323Y
                    r0.mo845d(r1)
                    return
            }
        }

        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: c */
        public static android.os.Handler m4084c(android.os.Handler r1) {
                if (r1 != 0) goto Lb
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
            Lb:
                return r1
        }

        /* renamed from: a */
        public final void m4085a(int r2, android.os.Handler r3) {
                r1 = this;
                android.os.Handler r3 = m4084c(r3)
                e0.h$c$b r0 = new e0.h$c$b
                r0.<init>(r1, r2)
                r3.post(r0)
                return
        }

        /* renamed from: b */
        public final void m4086b(android.graphics.Typeface r2, android.os.Handler r3) {
                r1 = this;
                android.os.Handler r3 = m4084c(r3)
                e0.h$c$a r0 = new e0.h$c$a
                r0.<init>(r1, r2)
                r3.post(r0)
                return
        }

        /* renamed from: d */
        public abstract void mo845d(int r1);

        /* renamed from: e */
        public abstract void mo846e(android.graphics.Typeface r1);
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p065e0.C1503h.f7314a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            p065e0.C1503h.f7315b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p065e0.C1503h.f7316c = r0
            return
    }

    /* renamed from: a */
    public static android.graphics.Typeface m4082a(android.content.Context r8, int r9) {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            android.graphics.Typeface r8 = m4083b(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    /* renamed from: b */
    public static android.graphics.Typeface m4083b(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, p065e0.C1503h.c r20, android.os.Handler r21, boolean r22, boolean r23) {
            r9 = r17
            r0 = r18
            r5 = r19
            r10 = r20
            r11 = r21
            android.content.res.Resources r3 = r16.getResources()
            r1 = 1
            r3.getValue(r9, r0, r1)
            java.lang.String r12 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto Lcf
            java.lang.String r13 = r1.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r13.startsWith(r0)
            r14 = -3
            r15 = 0
            if (r0 != 0) goto L2a
            if (r10 == 0) goto Lab
            goto La8
        L2a:
            s.f<java.lang.String, android.graphics.Typeface> r0 = p084f0.C1942e.f8488b
            java.lang.String r1 = p084f0.C1942e.m4839c(r3, r9, r5)
            java.lang.Object r0 = r0.m12329b(r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L40
            if (r10 == 0) goto L3d
            r10.m4086b(r0, r11)
        L3d:
            r15 = r0
            goto Lab
        L40:
            if (r23 == 0) goto L44
            goto Lab
        L44:
            java.lang.String r0 = r13.toLowerCase()     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L91
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L91
            if (r0 == 0) goto L76
            android.content.res.XmlResourceParser r0 = r3.getXml(r9)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L91
            e0.f$a r2 = p065e0.C1501f.m4078a(r0, r3)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L91
            if (r2 != 0) goto L65
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r12, r0)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L91
            if (r10 == 0) goto Lab
            r10.m4085a(r14, r11)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L91
            goto Lab
        L65:
            r1 = r16
            r4 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r15 = p084f0.C1942e.m4837a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L91
            goto Lab
        L76:
            r0 = r16
            android.graphics.Typeface r0 = p084f0.C1942e.m4838b(r0, r3, r9, r13, r5)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L91
            if (r10 == 0) goto L3d
            if (r0 == 0) goto L84
            r10.m4086b(r0, r11)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L91
            goto L3d
        L84:
            r10.m4085a(r14, r11)     // Catch: java.io.IOException -> L88 org.xmlpull.v1.XmlPullParserException -> L91
            goto L3d
        L88:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L99
        L91:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L99:
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r12, r1, r0)
            if (r10 == 0) goto Lab
        La8:
            r10.m4085a(r14, r11)
        Lab:
            if (r15 != 0) goto Lce
            if (r10 != 0) goto Lce
            if (r23 == 0) goto Lb2
            goto Lce
        Lb2:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = "Font resource ID #0x"
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r17)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lce:
            return r15
        Lcf:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.String r2 = "Resource \""
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r3 = r3.getResourceName(r9)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r17)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }
}
