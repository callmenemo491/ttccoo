package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.a */
/* loaded from: classes.dex */
public interface InterfaceC0174a extends android.os.IInterface {

    /* renamed from: android.support.v4.media.session.a$a */
    public static abstract class a extends android.os.Binder implements android.support.v4.media.session.InterfaceC0174a {

        /* renamed from: a */
        public static final /* synthetic */ int f581a = 0;

        /* renamed from: android.support.v4.media.session.a$a$a, reason: collision with other inner class name */
        public static class C7363a implements android.support.v4.media.session.InterfaceC0174a {

            /* renamed from: a */
            public android.os.IBinder f582a;

            public C7363a(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f582a = r1
                    return
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: G */
            public void mo279G(java.lang.String r3, android.os.Bundle r4) {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L29
                    r0.writeString(r3)     // Catch: java.lang.Throwable -> L29
                    r3 = 0
                    r1 = 1
                    if (r4 == 0) goto L17
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L29
                    r4.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L29
                    goto L1a
                L17:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L29
                L1a:
                    android.os.IBinder r3 = r2.f582a     // Catch: java.lang.Throwable -> L29
                    r4 = 0
                    boolean r3 = r3.transact(r1, r0, r4, r1)     // Catch: java.lang.Throwable -> L29
                    if (r3 != 0) goto L25
                    int r3 = android.support.v4.media.session.InterfaceC0174a.a.f581a     // Catch: java.lang.Throwable -> L29
                L25:
                    r0.recycle()
                    return
                L29:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: Q0 */
            public void mo280Q0(int r5) {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1e
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L1e
                    android.os.IBinder r5 = r4.f582a     // Catch: java.lang.Throwable -> L1e
                    r1 = 12
                    r2 = 0
                    r3 = 1
                    boolean r5 = r5.transact(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L1e
                    if (r5 != 0) goto L1a
                    int r5 = android.support.v4.media.session.InterfaceC0174a.a.f581a     // Catch: java.lang.Throwable -> L1e
                L1a:
                    r0.recycle()
                    return
                L1e:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: Z */
            public void mo268Z() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1a
                    android.os.IBinder r1 = r5.f582a     // Catch: java.lang.Throwable -> L1a
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    boolean r1 = r1.transact(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L1a
                    if (r1 != 0) goto L16
                    int r1 = android.support.v4.media.session.InterfaceC0174a.a.f581a     // Catch: java.lang.Throwable -> L1a
                L16:
                    r0.recycle()
                    return
                L1a:
                    r1 = move-exception
                    r0.recycle()
                    throw r1
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: Z1 */
            public void mo281Z1(android.support.v4.media.session.PlaybackStateCompat r5) {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L27
                    r1 = 1
                    r2 = 0
                    if (r5 == 0) goto L14
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L27
                    r5.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L27
                    goto L17
                L14:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L27
                L17:
                    android.os.IBinder r5 = r4.f582a     // Catch: java.lang.Throwable -> L27
                    r2 = 3
                    r3 = 0
                    boolean r5 = r5.transact(r2, r0, r3, r1)     // Catch: java.lang.Throwable -> L27
                    if (r5 != 0) goto L23
                    int r5 = android.support.v4.media.session.InterfaceC0174a.a.f581a     // Catch: java.lang.Throwable -> L27
                L23:
                    r0.recycle()
                    return
                L27:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.f582a
                    return r0
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: b0 */
            public void mo269b0(android.support.v4.media.MediaMetadataCompat r5) {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L29
                    r1 = 1
                    if (r5 == 0) goto L15
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L29
                    android.os.Bundle r5 = r5.f498Y     // Catch: java.lang.Throwable -> L29
                    r0.writeBundle(r5)     // Catch: java.lang.Throwable -> L29
                    goto L19
                L15:
                    r5 = 0
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L29
                L19:
                    android.os.IBinder r5 = r4.f582a     // Catch: java.lang.Throwable -> L29
                    r2 = 4
                    r3 = 0
                    boolean r5 = r5.transact(r2, r0, r3, r1)     // Catch: java.lang.Throwable -> L29
                    if (r5 != 0) goto L25
                    int r5 = android.support.v4.media.session.InterfaceC0174a.a.f581a     // Catch: java.lang.Throwable -> L29
                L25:
                    r0.recycle()
                    return
                L29:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: c1 */
            public void mo270c1(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r5) {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1d
                    r0.writeTypedList(r5)     // Catch: java.lang.Throwable -> L1d
                    android.os.IBinder r5 = r4.f582a     // Catch: java.lang.Throwable -> L1d
                    r1 = 5
                    r2 = 0
                    r3 = 1
                    boolean r5 = r5.transact(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L1d
                    if (r5 != 0) goto L19
                    int r5 = android.support.v4.media.session.InterfaceC0174a.a.f581a     // Catch: java.lang.Throwable -> L1d
                L19:
                    r0.recycle()
                    return
                L1d:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: i2 */
            public void mo271i2(android.support.v4.media.session.ParcelableVolumeInfo r5) {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L28
                    r1 = 1
                    r2 = 0
                    if (r5 == 0) goto L14
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L28
                    r5.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L28
                    goto L17
                L14:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L28
                L17:
                    android.os.IBinder r5 = r4.f582a     // Catch: java.lang.Throwable -> L28
                    r2 = 8
                    r3 = 0
                    boolean r5 = r5.transact(r2, r0, r3, r1)     // Catch: java.lang.Throwable -> L28
                    if (r5 != 0) goto L24
                    int r5 = android.support.v4.media.session.InterfaceC0174a.a.f581a     // Catch: java.lang.Throwable -> L28
                L24:
                    r0.recycle()
                    return
                L28:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.InterfaceC0174a
            /* renamed from: u */
            public void mo282u(int r5) {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1e
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L1e
                    android.os.IBinder r5 = r4.f582a     // Catch: java.lang.Throwable -> L1e
                    r1 = 9
                    r2 = 0
                    r3 = 1
                    boolean r5 = r5.transact(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L1e
                    if (r5 != 0) goto L1a
                    int r5 = android.support.v4.media.session.InterfaceC0174a.a.f581a     // Catch: java.lang.Throwable -> L1e
                L1a:
                    r0.recycle()
                    return
                L1e:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }
        }

        public a() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                r1.attachInterface(r1, r0)
                return
        }

        /* renamed from: v */
        public static android.support.v4.media.session.InterfaceC0174a m425v(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof android.support.v4.media.session.InterfaceC0174a
                if (r1 == 0) goto L13
                android.support.v4.media.session.a r0 = (android.support.v4.media.session.InterfaceC0174a) r0
                return r0
            L13:
                android.support.v4.media.session.a$a$a r0 = new android.support.v4.media.session.a$a$a
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                if (r4 == r0) goto L10f
                r0 = 0
                switch(r4) {
                    case 1: goto Lf2;
                    case 2: goto Leb;
                    case 3: goto Ld2;
                    case 4: goto Lbc;
                    case 5: goto Laf;
                    case 6: goto L99;
                    case 7: goto L83;
                    case 8: goto L6d;
                    case 9: goto L5f;
                    case 10: goto L58;
                    case 11: goto L35;
                    case 12: goto L27;
                    case 13: goto L11;
                    default: goto Lc;
                }
            Lc:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L11:
                r5.enforceInterface(r2)
                r4 = r3
                android.support.v4.media.session.MediaControllerCompat$a$c r4 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a.c) r4
                java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$a> r4 = r4.f519b
                java.lang.Object r4 = r4.get()
                android.support.v4.media.session.MediaControllerCompat$a r4 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a) r4
                if (r4 == 0) goto L26
                r5 = 13
                r4.m277f(r5, r0, r0)
            L26:
                return r1
            L27:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                r5 = r3
                android.support.v4.media.session.MediaControllerCompat$a$c r5 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a.c) r5
                r5.mo280Q0(r4)
                return r1
            L35:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L40
                r4 = 1
                goto L41
            L40:
                r4 = 0
            L41:
                r5 = r3
                android.support.v4.media.session.MediaControllerCompat$a$c r5 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a.c) r5
                java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$a> r5 = r5.f519b
                java.lang.Object r5 = r5.get()
                android.support.v4.media.session.MediaControllerCompat$a r5 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a) r5
                if (r5 == 0) goto L57
                r6 = 11
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                r5.m277f(r6, r4, r0)
            L57:
                return r1
            L58:
                r5.enforceInterface(r2)
                r5.readInt()
                return r1
            L5f:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                r5 = r3
                android.support.v4.media.session.MediaControllerCompat$a$c r5 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a.c) r5
                r5.mo282u(r4)
                return r1
            L6d:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L7f
                android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> r4 = android.support.v4.media.session.ParcelableVolumeInfo.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.support.v4.media.session.ParcelableVolumeInfo r0 = (android.support.v4.media.session.ParcelableVolumeInfo) r0
            L7f:
                r3.mo271i2(r0)
                return r1
            L83:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L95
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.os.Bundle r0 = (android.os.Bundle) r0
            L95:
                r3.mo267S0(r0)
                return r1
            L99:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto Lab
                android.os.Parcelable$Creator r4 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            Lab:
                r3.mo266M(r0)
                return r1
            Laf:
                r5.enforceInterface(r2)
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r4 = android.support.v4.media.session.MediaSessionCompat.QueueItem.CREATOR
                java.util.ArrayList r4 = r5.createTypedArrayList(r4)
                r3.mo270c1(r4)
                return r1
            Lbc:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto Lce
                android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r4 = android.support.v4.media.MediaMetadataCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.support.v4.media.MediaMetadataCompat r0 = (android.support.v4.media.MediaMetadataCompat) r0
            Lce:
                r3.mo269b0(r0)
                return r1
            Ld2:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto Le4
                android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r4 = android.support.v4.media.session.PlaybackStateCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.support.v4.media.session.PlaybackStateCompat r0 = (android.support.v4.media.session.PlaybackStateCompat) r0
            Le4:
                r4 = r3
                android.support.v4.media.session.MediaControllerCompat$a$c r4 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a.c) r4
                r4.mo281Z1(r0)
                return r1
            Leb:
                r5.enforceInterface(r2)
                r3.mo268Z()
                return r1
            Lf2:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                int r6 = r5.readInt()
                if (r6 == 0) goto L108
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r6.createFromParcel(r5)
                r0 = r5
                android.os.Bundle r0 = (android.os.Bundle) r0
            L108:
                r5 = r3
                android.support.v4.media.session.MediaControllerCompat$a$c r5 = (android.support.v4.media.session.MediaControllerCompat.AbstractC0148a.c) r5
                r5.mo279G(r4, r0)
                return r1
            L10f:
                r6.writeString(r2)
                return r1
        }
    }

    /* renamed from: G */
    void mo279G(java.lang.String r1, android.os.Bundle r2);

    /* renamed from: M */
    void mo266M(java.lang.CharSequence r1);

    /* renamed from: Q0 */
    void mo280Q0(int r1);

    /* renamed from: S0 */
    void mo267S0(android.os.Bundle r1);

    /* renamed from: Z */
    void mo268Z();

    /* renamed from: Z1 */
    void mo281Z1(android.support.v4.media.session.PlaybackStateCompat r1);

    /* renamed from: b0 */
    void mo269b0(android.support.v4.media.MediaMetadataCompat r1);

    /* renamed from: c1 */
    void mo270c1(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r1);

    /* renamed from: i2 */
    void mo271i2(android.support.v4.media.session.ParcelableVolumeInfo r1);

    /* renamed from: u */
    void mo282u(int r1);
}
