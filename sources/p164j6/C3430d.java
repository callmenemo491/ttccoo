package p164j6;

/* renamed from: j6.d */
/* loaded from: classes.dex */
public class C3430d implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p164j6.C3430d> CREATOR = null;

    /* renamed from: Y */
    public android.os.Messenger f14883Y;

    /* renamed from: j6.d$a */
    public static final class a extends java.lang.ClassLoader {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.ClassLoader
        public final java.lang.Class<?> loadClass(java.lang.String r3, boolean r4) {
                r2 = this;
                java.lang.String r0 = "com.google.android.gms.iid.MessengerCompat"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L2b
                java.lang.String r3 = "CloudMessengerCompat"
                r4 = 3
                boolean r0 = android.util.Log.isLoggable(r3, r4)
                if (r0 != 0) goto L20
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 != r1) goto L1e
                boolean r4 = android.util.Log.isLoggable(r3, r4)
                if (r4 == 0) goto L1e
                goto L20
            L1e:
                r4 = 0
                goto L21
            L20:
                r4 = 1
            L21:
                if (r4 == 0) goto L28
                java.lang.String r4 = "Using renamed FirebaseIidMessengerCompat class"
                android.util.Log.d(r3, r4)
            L28:
                java.lang.Class<j6.d> r3 = p164j6.C3430d.class
                return r3
            L2b:
                java.lang.Class r3 = super.loadClass(r3, r4)
                return r3
        }
    }

    static {
            j6.f r0 = new j6.f
            r0.<init>()
            p164j6.C3430d.CREATOR = r0
            return
    }

    public C3430d(android.os.IBinder r2) {
            r1 = this;
            r1.<init>()
            android.os.Messenger r0 = new android.os.Messenger
            r0.<init>(r2)
            r1.f14883Y = r0
            return
    }

    /* renamed from: a */
    public final android.os.IBinder m7887a() {
            r1 = this;
            android.os.Messenger r0 = r1.f14883Y
            java.util.Objects.requireNonNull(r0)
            android.os.IBinder r0 = r0.getBinder()
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.os.IBinder r1 = r2.m7887a()     // Catch: java.lang.ClassCastException -> L13
            j6.d r3 = (p164j6.C3430d) r3     // Catch: java.lang.ClassCastException -> L13
            android.os.IBinder r3 = r3.m7887a()     // Catch: java.lang.ClassCastException -> L13
            boolean r3 = r1.equals(r3)     // Catch: java.lang.ClassCastException -> L13
            return r3
        L13:
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.os.IBinder r0 = r1.m7887a()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            android.os.Messenger r2 = r0.f14883Y
            java.util.Objects.requireNonNull(r2)
            android.os.IBinder r2 = r2.getBinder()
            r1.writeStrongBinder(r2)
            return
    }
}
