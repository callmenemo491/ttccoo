package p429y6;

/* renamed from: y6.b */
/* loaded from: classes.dex */
public final class C7121b extends dalvik.system.PathClassLoader {
    public C7121b(java.lang.String r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // java.lang.ClassLoader
    public final java.lang.Class<?> loadClass(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "java."
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = "android."
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L15
            java.lang.Class r2 = r1.findClass(r2)     // Catch: java.lang.ClassNotFoundException -> L15
            return r2
        L15:
            java.lang.Class r2 = super.loadClass(r2, r3)
            return r2
    }
}
