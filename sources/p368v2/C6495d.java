package p368v2;

/* renamed from: v2.d */
/* loaded from: classes.dex */
public class C6495d implements p180k2.InterfaceC3674f<android.net.Uri, android.graphics.drawable.Drawable> {

    /* renamed from: a */
    public final android.content.Context f25178a;

    public C6495d(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f25178a = r1
            return
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: a */
    public /* bridge */ /* synthetic */ p214m2.InterfaceC4345w<android.graphics.drawable.Drawable> mo8132a(android.net.Uri r1, int r2, int r3, p180k2.C3673e r4) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            m2.w r1 = r0.m13207c(r1)
            return r1
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: b */
    public boolean mo8133b(android.net.Uri r1, p180k2.C3673e r2) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.String r1 = r1.getScheme()
            java.lang.String r2 = "android.resource"
            boolean r1 = r1.equals(r2)
            return r1
    }

    /* renamed from: c */
    public p214m2.InterfaceC4345w m13207c(android.net.Uri r7) {
            r6 = this;
            java.lang.String r0 = r7.getAuthority()
            android.content.Context r1 = r6.f25178a
            java.lang.String r1 = r1.getPackageName()
            boolean r1 = r0.equals(r1)
            r2 = 0
            if (r1 == 0) goto L12
            goto L26
        L12:
            android.content.Context r1 = r6.f25178a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            android.content.Context r0 = r1.createPackageContext(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            goto L28
        L19:
            r1 = move-exception
            android.content.Context r3 = r6.f25178a
            java.lang.String r3 = r3.getPackageName()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto La5
        L26:
            android.content.Context r0 = r6.f25178a
        L28:
            java.util.List r1 = r7.getPathSegments()
            int r3 = r1.size()
            r4 = 1
            r5 = 2
            if (r3 != r5) goto L6b
            java.util.List r1 = r7.getPathSegments()
            java.lang.String r3 = r7.getAuthority()
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            android.content.res.Resources r4 = r0.getResources()
            int r3 = r4.getIdentifier(r1, r2, r3)
            if (r3 != 0) goto L5c
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            java.lang.String r4 = "android"
            int r3 = r3.getIdentifier(r1, r2, r4)
        L5c:
            if (r3 == 0) goto L5f
            goto L81
        L5f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to find resource id for: "
            java.lang.String r7 = androidx.appcompat.widget.C0298q0.m776a(r1, r7)
            r0.<init>(r7)
            throw r0
        L6b:
            int r1 = r1.size()
            java.lang.String r3 = "Unrecognized Uri format: "
            if (r1 != r4) goto L9b
            java.util.List r1 = r7.getPathSegments()
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.NumberFormatException -> L90
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L90
            int r3 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L90
        L81:
            android.content.Context r7 = r6.f25178a
            r1 = 0
            android.graphics.drawable.Drawable r7 = p368v2.C6492a.m13206a(r7, r0, r3, r1)
            if (r7 == 0) goto L8f
            v2.c r1 = new v2.c
            r1.<init>(r7)
        L8f:
            return r1
        L90:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r7 = androidx.appcompat.widget.C0298q0.m776a(r3, r7)
            r1.<init>(r7, r0)
            throw r1
        L9b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r7 = androidx.appcompat.widget.C0298q0.m776a(r3, r7)
            r0.<init>(r7)
            throw r0
        La5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed to obtain context or unrecognized Uri format for: "
            java.lang.String r7 = androidx.appcompat.widget.C0298q0.m776a(r2, r7)
            r0.<init>(r7, r1)
            throw r0
    }
}
