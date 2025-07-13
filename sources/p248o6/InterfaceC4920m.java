package p248o6;

/* renamed from: o6.m */
/* loaded from: classes.dex */
public interface InterfaceC4920m extends android.os.IInterface {

    /* renamed from: o6.m$a */
    public static abstract class a extends android.os.Binder implements p248o6.InterfaceC4920m {

        /* renamed from: o6.m$a$a, reason: collision with other inner class name */
        public static class C7411a implements p248o6.InterfaceC4920m {

            /* renamed from: a */
            public final android.os.IBinder f19515a;

            public C7411a(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f19515a = r1
                    return
            }

            @Override // p248o6.InterfaceC4920m
            /* renamed from: F0 */
            public final void mo11072F0(p248o6.InterfaceC4918l r4, p248o6.C4908g r5) {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.google.android.gms.common.internal.IGmsServiceBroker"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
                    g7.a r4 = (p110g7.BinderC2295a) r4     // Catch: java.lang.Throwable -> L2b
                    r0.writeStrongBinder(r4)     // Catch: java.lang.Throwable -> L2b
                    r4 = 0
                    r2 = 1
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L2b
                    r5.writeToParcel(r0, r4)     // Catch: java.lang.Throwable -> L2b
                    android.os.IBinder r5 = r3.f19515a     // Catch: java.lang.Throwable -> L2b
                    r2 = 46
                    r5.transact(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L2b
                    r1.readException()     // Catch: java.lang.Throwable -> L2b
                    r1.recycle()
                    r0.recycle()
                    return
                L2b:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.os.IInterface
            public final android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.f19515a
                    return r0
            }
        }

        public a() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.google.android.gms.common.internal.IGmsServiceBroker"
                r1.attachInterface(r1, r0)
                return
        }

        @Override // android.os.IInterface
        @androidx.annotation.RecentlyNonNull
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, @androidx.annotation.RecentlyNonNull android.os.Parcel r5, android.os.Parcel r6, int r7) {
                r3 = this;
                r0 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 <= r0) goto La
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            La:
                java.lang.String r7 = "com.google.android.gms.common.internal.IGmsServiceBroker"
                r5.enforceInterface(r7)
                android.os.IBinder r7 = r5.readStrongBinder()
                r0 = 0
                if (r7 != 0) goto L18
                r1 = r0
                goto L2a
            L18:
                java.lang.String r1 = "com.google.android.gms.common.internal.IGmsCallbacks"
                android.os.IInterface r1 = r7.queryLocalInterface(r1)
                boolean r2 = r1 instanceof p248o6.InterfaceC4918l
                if (r2 == 0) goto L25
                o6.l r1 = (p248o6.InterfaceC4918l) r1
                goto L2a
            L25:
                o6.u0 r1 = new o6.u0
                r1.<init>(r7)
            L2a:
                r7 = 46
                r2 = 1
                if (r4 != r7) goto L4d
                int r4 = r5.readInt()
                if (r4 == 0) goto L3e
                android.os.Parcelable$Creator<o6.g> r4 = p248o6.C4908g.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                o6.g r0 = (p248o6.C4908g) r0
            L3e:
                r4 = r3
                w9.a r4 = (p391w9.BinderC6821a) r4
                r4.mo11072F0(r1, r0)
                java.lang.String r4 = "null reference"
                java.util.Objects.requireNonNull(r6, r4)
                r6.writeNoException()
                return r2
            L4d:
                r6 = 47
                if (r4 != r6) goto L65
                int r4 = r5.readInt()
                if (r4 == 0) goto L5f
                android.os.Parcelable$Creator<o6.a1> r4 = p248o6.C4896a1.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                o6.a1 r4 = (p248o6.C4896a1) r4
            L5f:
                java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
                r4.<init>()
                throw r4
            L65:
                r5.readInt()
                r6 = 4
                if (r4 == r6) goto L6e
                r5.readString()
            L6e:
                if (r4 == r2) goto Lda
                r6 = 2
                if (r4 == r6) goto Ld3
                r6 = 23
                if (r4 == r6) goto Ld3
                r6 = 25
                if (r4 == r6) goto Ld3
                r6 = 27
                if (r4 == r6) goto Ld3
                r6 = 30
                if (r4 == r6) goto Lc6
                r6 = 34
                if (r4 == r6) goto Lc2
                r6 = 41
                if (r4 == r6) goto Ld3
                r6 = 43
                if (r4 == r6) goto Ld3
                r6 = 37
                if (r4 == r6) goto Ld3
                r6 = 38
                if (r4 == r6) goto Ld3
                switch(r4) {
                    case 5: goto Ld3;
                    case 6: goto Ld3;
                    case 7: goto Ld3;
                    case 8: goto Ld3;
                    case 9: goto Lac;
                    case 10: goto La5;
                    case 11: goto Ld3;
                    case 12: goto Ld3;
                    case 13: goto Ld3;
                    case 14: goto Ld3;
                    case 15: goto Ld3;
                    case 16: goto Ld3;
                    case 17: goto Ld3;
                    case 18: goto Ld3;
                    case 19: goto L9b;
                    case 20: goto Lc6;
                    default: goto L9a;
                }
            L9a:
                goto Lf1
            L9b:
                r5.readStrongBinder()
                int r4 = r5.readInt()
                if (r4 == 0) goto Lf1
                goto Le9
            La5:
                r5.readString()
                r5.createStringArray()
                goto Lf1
            Lac:
                r5.readString()
                r5.createStringArray()
                r5.readString()
                r5.readStrongBinder()
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto Lf1
                goto Le9
            Lc2:
                r5.readString()
                goto Lf1
            Lc6:
                r5.createStringArray()
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto Lf1
                goto Le9
            Ld3:
                int r4 = r5.readInt()
                if (r4 == 0) goto Lf1
                goto Le9
            Lda:
                r5.readString()
                r5.createStringArray()
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto Lf1
            Le9:
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.os.Bundle r4 = (android.os.Bundle) r4
            Lf1:
                java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
                r4.<init>()
                throw r4
        }
    }

    /* renamed from: F0 */
    void mo11072F0(@androidx.annotation.RecentlyNonNull p248o6.InterfaceC4918l r1, p248o6.C4908g r2);
}
