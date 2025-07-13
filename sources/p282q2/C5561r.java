package p282q2;

/* renamed from: q2.r */
/* loaded from: classes.dex */
public class C5561r<Data> implements p282q2.InterfaceC5556m<java.lang.Integer, Data> {

    /* renamed from: a */
    public final p282q2.InterfaceC5556m<android.net.Uri, Data> f21649a;

    /* renamed from: b */
    public final android.content.res.Resources f21650b;

    /* renamed from: q2.r$a */
    public static final class a implements p282q2.InterfaceC5557n<java.lang.Integer, android.content.res.AssetFileDescriptor> {

        /* renamed from: a */
        public final android.content.res.Resources f21651a;

        public a(android.content.res.Resources r1) {
                r0 = this;
                r0.<init>()
                r0.f21651a = r1
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<java.lang.Integer, android.content.res.AssetFileDescriptor> mo9584b(p282q2.C5560q r5) {
                r4 = this;
                q2.r r0 = new q2.r
                android.content.res.Resources r1 = r4.f21651a
                java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
                java.lang.Class<android.content.res.AssetFileDescriptor> r3 = android.content.res.AssetFileDescriptor.class
                q2.m r5 = r5.m11841b(r2, r3)
                r0.<init>(r1, r5)
                return r0
        }
    }

    /* renamed from: q2.r$b */
    public static class b implements p282q2.InterfaceC5557n<java.lang.Integer, android.os.ParcelFileDescriptor> {

        /* renamed from: a */
        public final android.content.res.Resources f21652a;

        public b(android.content.res.Resources r1) {
                r0 = this;
                r0.<init>()
                r0.f21652a = r1
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<java.lang.Integer, android.os.ParcelFileDescriptor> mo9584b(p282q2.C5560q r5) {
                r4 = this;
                q2.r r0 = new q2.r
                android.content.res.Resources r1 = r4.f21652a
                java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
                java.lang.Class<android.os.ParcelFileDescriptor> r3 = android.os.ParcelFileDescriptor.class
                q2.m r5 = r5.m11841b(r2, r3)
                r0.<init>(r1, r5)
                return r0
        }
    }

    /* renamed from: q2.r$c */
    public static class c implements p282q2.InterfaceC5557n<java.lang.Integer, java.io.InputStream> {

        /* renamed from: a */
        public final android.content.res.Resources f21653a;

        public c(android.content.res.Resources r1) {
                r0 = this;
                r0.<init>()
                r0.f21653a = r1
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<java.lang.Integer, java.io.InputStream> mo9584b(p282q2.C5560q r5) {
                r4 = this;
                q2.r r0 = new q2.r
                android.content.res.Resources r1 = r4.f21653a
                java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
                java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
                q2.m r5 = r5.m11841b(r2, r3)
                r0.<init>(r1, r5)
                return r0
        }
    }

    /* renamed from: q2.r$d */
    public static class d implements p282q2.InterfaceC5557n<java.lang.Integer, android.net.Uri> {

        /* renamed from: a */
        public final android.content.res.Resources f21654a;

        public d(android.content.res.Resources r1) {
                r0 = this;
                r0.<init>()
                r0.f21654a = r1
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<java.lang.Integer, android.net.Uri> mo9584b(p282q2.C5560q r3) {
                r2 = this;
                q2.r r3 = new q2.r
                android.content.res.Resources r0 = r2.f21654a
                q2.t<?> r1 = p282q2.C5563t.f21656a
                r3.<init>(r0, r1)
                return r3
        }
    }

    public C5561r(android.content.res.Resources r1, p282q2.InterfaceC5556m<android.net.Uri, Data> r2) {
            r0 = this;
            r0.<init>()
            r0.f21650b = r1
            r0.f21649a = r2
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a mo9582a(java.lang.Integer r6, int r7, int r8, p180k2.C3673e r9) {
            r5 = this;
            java.lang.Integer r6 = (java.lang.Integer) r6
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L45
            r1.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L45
            java.lang.String r2 = "android.resource://"
            r1.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L45
            android.content.res.Resources r2 = r5.f21650b     // Catch: android.content.res.Resources.NotFoundException -> L45
            int r3 = r6.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L45
            java.lang.String r2 = r2.getResourcePackageName(r3)     // Catch: android.content.res.Resources.NotFoundException -> L45
            r1.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L45
            r2 = 47
            r1.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L45
            android.content.res.Resources r3 = r5.f21650b     // Catch: android.content.res.Resources.NotFoundException -> L45
            int r4 = r6.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L45
            java.lang.String r3 = r3.getResourceTypeName(r4)     // Catch: android.content.res.Resources.NotFoundException -> L45
            r1.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L45
            r1.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L45
            android.content.res.Resources r2 = r5.f21650b     // Catch: android.content.res.Resources.NotFoundException -> L45
            int r3 = r6.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L45
            java.lang.String r2 = r2.getResourceEntryName(r3)     // Catch: android.content.res.Resources.NotFoundException -> L45
            r1.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L45
            java.lang.String r1 = r1.toString()     // Catch: android.content.res.Resources.NotFoundException -> L45
            android.net.Uri r6 = android.net.Uri.parse(r1)     // Catch: android.content.res.Resources.NotFoundException -> L45
            goto L64
        L45:
            r1 = move-exception
            r2 = 5
            java.lang.String r3 = "ResourceLoader"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L63
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Received invalid resource id: "
            r2.append(r4)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            android.util.Log.w(r3, r6, r1)
        L63:
            r6 = r0
        L64:
            if (r6 != 0) goto L67
            goto L6d
        L67:
            q2.m<android.net.Uri, Data> r0 = r5.f21649a
            q2.m$a r0 = r0.mo9582a(r6, r7, r8, r9)
        L6d:
            return r0
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo9583b(java.lang.Integer r1) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1 = 1
            return r1
    }
}
