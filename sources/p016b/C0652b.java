package p016b;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* renamed from: b.b */
/* loaded from: classes.dex */
public class C0652b implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p016b.C0652b> CREATOR = null;

    /* renamed from: Y */
    public p016b.InterfaceC0651a f3792Y;

    /* renamed from: b.b$a */
    public class a implements android.os.Parcelable.Creator<p016b.C0652b> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p016b.C0652b createFromParcel(android.os.Parcel r2) {
                r1 = this;
                b.b r0 = new b.b
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p016b.C0652b[] newArray(int r1) {
                r0 = this;
                b.b[] r1 = new p016b.C0652b[r1]
                return r1
        }
    }

    /* renamed from: b.b$b */
    public class b extends p016b.InterfaceC0651a.a {

        /* renamed from: b */
        public final /* synthetic */ p016b.C0652b f3793b;

        public b(p016b.C0652b r1) {
                r0 = this;
                r0.f3793b = r1
                r0.<init>()
                return
        }

        @Override // p016b.InterfaceC0651a
        /* renamed from: g2 */
        public void mo2196g2(int r2, android.os.Bundle r3) {
                r1 = this;
                b.b r0 = r1.f3793b
                java.util.Objects.requireNonNull(r0)
                b.b r0 = r1.f3793b
                r0.mo188a(r2, r3)
                return
        }
    }

    static {
            b.b$a r0 = new b.b$a
            r0.<init>()
            p016b.C0652b.CREATOR = r0
            return
    }

    public C0652b(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            android.os.IBinder r3 = r3.readStrongBinder()
            int r0 = p016b.InterfaceC0651a.a.f3790a
            if (r3 != 0) goto Ld
            r3 = 0
            goto L23
        Ld:
            java.lang.String r0 = "android.support.v4.os.IResultReceiver"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            if (r0 == 0) goto L1d
            boolean r1 = r0 instanceof p016b.InterfaceC0651a
            if (r1 == 0) goto L1d
            r3 = r0
            b.a r3 = (p016b.InterfaceC0651a) r3
            goto L23
        L1d:
            b.a$a$a r0 = new b.a$a$a
            r0.<init>(r3)
            r3 = r0
        L23:
            r2.f3792Y = r3
            return
    }

    /* renamed from: a */
    public void mo188a(int r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    /* renamed from: b */
    public void m2197b(int r2, android.os.Bundle r3) {
            r1 = this;
            b.a r0 = r1.f3792Y
            if (r0 == 0) goto L7
            r0.mo2196g2(r2, r3)     // Catch: android.os.RemoteException -> L7
        L7:
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            monitor-enter(r0)
            b.a r2 = r0.f3792Y     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto Lc
            b.b$b r2 = new b.b$b     // Catch: java.lang.Throwable -> L17
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L17
            r0.f3792Y = r2     // Catch: java.lang.Throwable -> L17
        Lc:
            b.a r2 = r0.f3792Y     // Catch: java.lang.Throwable -> L17
            android.os.IBinder r2 = r2.asBinder()     // Catch: java.lang.Throwable -> L17
            r1.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }
}
