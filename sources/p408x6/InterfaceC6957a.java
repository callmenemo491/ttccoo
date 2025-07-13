package p408x6;

/* renamed from: x6.a */
/* loaded from: classes.dex */
public interface InterfaceC6957a extends android.os.IInterface {

    /* renamed from: x6.a$a */
    public static abstract class a extends p110g7.BinderC2295a implements p408x6.InterfaceC6957a {

        /* renamed from: x6.a$a$a, reason: collision with other inner class name */
        public static class C7430a extends p053d7.C1340b implements p408x6.InterfaceC6957a {
            public C7430a(android.os.IBinder r3) {
                    r2 = this;
                    java.lang.String r0 = "com.google.android.gms.dynamic.IObjectWrapper"
                    r1 = 2
                    r2.<init>(r3, r0, r1)
                    return
            }
        }

        public a() {
                r1 = this;
                java.lang.String r0 = "com.google.android.gms.dynamic.IObjectWrapper"
                r1.<init>(r0)
                return
        }

        @androidx.annotation.RecentlyNonNull
        /* renamed from: x */
        public static p408x6.InterfaceC6957a m14123x(@androidx.annotation.RecentlyNonNull android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.google.android.gms.dynamic.IObjectWrapper"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                boolean r1 = r0 instanceof p408x6.InterfaceC6957a
                if (r1 == 0) goto L11
                x6.a r0 = (p408x6.InterfaceC6957a) r0
                return r0
            L11:
                x6.a$a$a r0 = new x6.a$a$a
                r0.<init>(r2)
                return r0
        }
    }
}
