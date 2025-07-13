package androidx.navigation;

@android.annotation.SuppressLint({"TypeParameterUnusedInFormals"})
/* renamed from: androidx.navigation.w */
/* loaded from: classes.dex */
public class C0528w {

    /* renamed from: b */
    public static final java.util.HashMap<java.lang.Class<?>, java.lang.String> f3018b = null;

    /* renamed from: a */
    public final java.util.HashMap<java.lang.String, androidx.navigation.AbstractC0527v<? extends androidx.navigation.C0518m>> f3019a;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.navigation.C0528w.f3018b = r0
            return
    }

    public C0528w() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f3019a = r0
            return
    }

    /* renamed from: b */
    public static java.lang.String m1610b(java.lang.Class<? extends androidx.navigation.AbstractC0527v> r3) {
            java.util.HashMap<java.lang.Class<?>, java.lang.String> r0 = androidx.navigation.C0528w.f3018b
            java.lang.Object r1 = r0.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L3b
            java.lang.Class<androidx.navigation.v$b> r1 = androidx.navigation.AbstractC0527v.b.class
            java.lang.annotation.Annotation r1 = r3.getAnnotation(r1)
            androidx.navigation.v$b r1 = (androidx.navigation.AbstractC0527v.b) r1
            if (r1 == 0) goto L19
            java.lang.String r1 = r1.value()
            goto L1a
        L19:
            r1 = 0
        L1a:
            boolean r2 = m1611d(r1)
            if (r2 == 0) goto L24
            r0.put(r3, r1)
            goto L3b
        L24:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No @Navigator.Name annotation found for "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L3b:
            return r1
    }

    /* renamed from: d */
    public static boolean m1611d(java.lang.String r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* renamed from: a */
    public final androidx.navigation.AbstractC0527v<? extends androidx.navigation.C0518m> m1612a(androidx.navigation.AbstractC0527v<? extends androidx.navigation.C0518m> r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = m1610b(r0)
            boolean r1 = m1611d(r0)
            if (r1 == 0) goto L17
            java.util.HashMap<java.lang.String, androidx.navigation.v<? extends androidx.navigation.m>> r1 = r2.f3019a
            java.lang.Object r3 = r1.put(r0, r3)
            androidx.navigation.v r3 = (androidx.navigation.AbstractC0527v) r3
            return r3
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "navigator name cannot be an empty string"
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: c */
    public <T extends androidx.navigation.AbstractC0527v<?>> T m1613c(java.lang.String r4) {
            r3 = this;
            boolean r0 = m1611d(r4)
            if (r0 == 0) goto L1f
            java.util.HashMap<java.lang.String, androidx.navigation.v<? extends androidx.navigation.m>> r0 = r3.f3019a
            java.lang.Object r0 = r0.get(r4)
            androidx.navigation.v r0 = (androidx.navigation.AbstractC0527v) r0
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find Navigator with name \""
            java.lang.String r2 = "\". You must call NavController.addNavigator() for each navigation type."
            java.lang.String r4 = android.support.v4.media.C0145d.m257a(r1, r4, r2)
            r0.<init>(r4)
            throw r0
        L1f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "navigator name cannot be an empty string"
            r4.<init>(r0)
            throw r4
    }
}
