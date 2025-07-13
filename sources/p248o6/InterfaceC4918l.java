package p248o6;

/* renamed from: o6.l */
/* loaded from: classes.dex */
public interface InterfaceC4918l extends android.os.IInterface {

    /* renamed from: o6.l$a */
    public static abstract class a extends p110g7.BinderC2295a implements p248o6.InterfaceC4918l {
        public a() {
                r1 = this;
                java.lang.String r0 = "com.google.android.gms.common.internal.IGmsCallbacks"
                r1.<init>(r0)
                return
        }

        @Override // p110g7.BinderC2295a
        /* renamed from: v */
        public final boolean mo6060v(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
                r6 = this;
                r10 = 1
                if (r7 == r10) goto L73
                r0 = 2
                if (r7 == r0) goto L5b
                r0 = 3
                if (r7 == r0) goto Lb
                r7 = 0
                return r7
            Lb:
                int r7 = r8.readInt()
                android.os.IBinder r0 = r8.readStrongBinder()
                android.os.Parcelable$Creator<o6.i0> r1 = p248o6.C4913i0.CREATOR
                android.os.Parcelable r8 = p110g7.C2296b.m6061a(r8, r1)
                o6.i0 r8 = (p248o6.C4913i0) r8
                r1 = r6
                o6.c$j r1 = (p248o6.AbstractC4900c.j) r1
                o6.c r2 = r1.f19449a
                java.lang.String r3 = "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"
                com.google.android.gms.common.internal.C1101a.m3104i(r2, r3)
                java.lang.String r3 = "null reference"
                java.util.Objects.requireNonNull(r8, r3)
                r2.f19437u0 = r8
                boolean r2 = r2.mo6393E()
                if (r2 == 0) goto L55
                o6.e r2 = r8.f19506b0
                o6.p r3 = p248o6.C4926p.m11076a()
                if (r2 != 0) goto L3c
                r2 = 0
                goto L3e
            L3c:
                o6.q r2 = r2.f19475Y
            L3e:
                monitor-enter(r3)
                if (r2 != 0) goto L44
                o6.q r2 = p248o6.C4926p.f19531c     // Catch: java.lang.Throwable -> L52
                goto L4e
            L44:
                o6.q r4 = r3.f19532a     // Catch: java.lang.Throwable -> L52
                if (r4 == 0) goto L4e
                int r4 = r4.f19533Y     // Catch: java.lang.Throwable -> L52
                int r5 = r2.f19533Y     // Catch: java.lang.Throwable -> L52
                if (r4 >= r5) goto L50
            L4e:
                r3.f19532a = r2     // Catch: java.lang.Throwable -> L52
            L50:
                monitor-exit(r3)
                goto L55
            L52:
                r7 = move-exception
                monitor-exit(r3)
                throw r7
            L55:
                android.os.Bundle r8 = r8.f19503Y
                r1.mo11063h2(r7, r0, r8)
                goto L89
            L5b:
                r8.readInt()
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                android.os.Parcelable r7 = p110g7.C2296b.m6061a(r8, r7)
                android.os.Bundle r7 = (android.os.Bundle) r7
                java.lang.Exception r7 = new java.lang.Exception
                r7.<init>()
                java.lang.String r8 = "GmsClient"
                java.lang.String r0 = "received deprecated onAccountValidationComplete callback, ignoring"
                android.util.Log.wtf(r8, r0, r7)
                goto L89
            L73:
                int r7 = r8.readInt()
                android.os.IBinder r0 = r8.readStrongBinder()
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                android.os.Parcelable r8 = p110g7.C2296b.m6061a(r8, r1)
                android.os.Bundle r8 = (android.os.Bundle) r8
                r1 = r6
                o6.c$j r1 = (p248o6.AbstractC4900c.j) r1
                r1.mo11063h2(r7, r0, r8)
            L89:
                r9.writeNoException()
                return r10
        }
    }

    /* renamed from: h2 */
    void mo11063h2(int r1, @androidx.annotation.RecentlyNonNull android.os.IBinder r2, @androidx.annotation.RecentlyNonNull android.os.Bundle r3);
}
