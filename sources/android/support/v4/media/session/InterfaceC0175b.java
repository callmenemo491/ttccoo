package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes.dex */
public interface InterfaceC0175b extends android.os.IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    public static abstract class a extends android.os.Binder implements android.support.v4.media.session.InterfaceC0175b {

        /* renamed from: a */
        public static final /* synthetic */ int f583a = 0;

        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        public static class C7364a implements android.support.v4.media.session.InterfaceC0175b {

            /* renamed from: a */
            public android.os.IBinder f584a;

            public C7364a(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f584a = r1
                    return
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: A0 */
            public android.app.PendingIntent mo349A0() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L34
                    android.os.IBinder r2 = r5.f584a     // Catch: java.lang.Throwable -> L34
                    r3 = 8
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L34
                    if (r2 != 0) goto L1a
                    int r2 = android.support.v4.media.session.InterfaceC0175b.a.f583a     // Catch: java.lang.Throwable -> L34
                L1a:
                    r1.readException()     // Catch: java.lang.Throwable -> L34
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L34
                    if (r2 == 0) goto L2c
                    android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR     // Catch: java.lang.Throwable -> L34
                    java.lang.Object r2 = r2.createFromParcel(r1)     // Catch: java.lang.Throwable -> L34
                    android.app.PendingIntent r2 = (android.app.PendingIntent) r2     // Catch: java.lang.Throwable -> L34
                    goto L2d
                L2c:
                    r2 = 0
                L2d:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L34:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: L1 */
            public void mo361L1(long r4) {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L27
                    r0.writeLong(r4)     // Catch: java.lang.Throwable -> L27
                    android.os.IBinder r4 = r3.f584a     // Catch: java.lang.Throwable -> L27
                    r5 = 24
                    r2 = 0
                    boolean r4 = r4.transact(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L27
                    if (r4 != 0) goto L1d
                    int r4 = android.support.v4.media.session.InterfaceC0175b.a.f583a     // Catch: java.lang.Throwable -> L27
                L1d:
                    r1.readException()     // Catch: java.lang.Throwable -> L27
                    r1.recycle()
                    r0.recycle()
                    return
                L27:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: W */
            public void mo365W(android.support.v4.media.session.InterfaceC0174a r5) {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L28
                    android.support.v4.media.session.a$a r5 = (android.support.v4.media.session.InterfaceC0174a.a) r5     // Catch: java.lang.Throwable -> L28
                    r0.writeStrongBinder(r5)     // Catch: java.lang.Throwable -> L28
                    android.os.IBinder r5 = r4.f584a     // Catch: java.lang.Throwable -> L28
                    r2 = 3
                    r3 = 0
                    boolean r5 = r5.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L28
                    if (r5 != 0) goto L1e
                    int r5 = android.support.v4.media.session.InterfaceC0175b.a.f583a     // Catch: java.lang.Throwable -> L28
                L1e:
                    r1.readException()     // Catch: java.lang.Throwable -> L28
                    r1.recycle()
                    r0.recycle()
                    return
                L28:
                    r5 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: Z0 */
            public void mo367Z0(java.lang.String r4, android.os.Bundle r5, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper r6) {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L40
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L40
                    r4 = 1
                    r2 = 0
                    if (r5 == 0) goto L1b
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L40
                    r5.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L40
                    goto L1e
                L1b:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L40
                L1e:
                    if (r6 == 0) goto L29
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L40
                    android.os.ResultReceiver r5 = r6.f529Y     // Catch: java.lang.Throwable -> L40
                    r5.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L40
                    goto L2c
                L29:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L40
                L2c:
                    android.os.IBinder r5 = r3.f584a     // Catch: java.lang.Throwable -> L40
                    boolean r4 = r5.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L40
                    if (r4 != 0) goto L36
                    int r4 = android.support.v4.media.session.InterfaceC0175b.a.f583a     // Catch: java.lang.Throwable -> L40
                L36:
                    r1.readException()     // Catch: java.lang.Throwable -> L40
                    r1.recycle()
                    r0.recycle()
                    return
                L40:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: a1 */
            public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> mo369a1() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2a
                    android.os.IBinder r2 = r5.f584a     // Catch: java.lang.Throwable -> L2a
                    r3 = 29
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2a
                    if (r2 != 0) goto L1a
                    int r2 = android.support.v4.media.session.InterfaceC0175b.a.f583a     // Catch: java.lang.Throwable -> L2a
                L1a:
                    r1.readException()     // Catch: java.lang.Throwable -> L2a
                    android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r2 = android.support.v4.media.session.MediaSessionCompat.QueueItem.CREATOR     // Catch: java.lang.Throwable -> L2a
                    java.util.ArrayList r2 = r1.createTypedArrayList(r2)     // Catch: java.lang.Throwable -> L2a
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2a:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.f584a
                    return r0
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: j */
            public void mo376j() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L24
                    android.os.IBinder r2 = r5.f584a     // Catch: java.lang.Throwable -> L24
                    r3 = 18
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L24
                    if (r2 != 0) goto L1a
                    int r2 = android.support.v4.media.session.InterfaceC0175b.a.f583a     // Catch: java.lang.Throwable -> L24
                L1a:
                    r1.readException()     // Catch: java.lang.Throwable -> L24
                    r1.recycle()
                    r0.recycle()
                    return
                L24:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: j2 */
            public boolean mo377j2(android.view.KeyEvent r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L38
                    r2 = 1
                    r3 = 0
                    if (r6 == 0) goto L18
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L38
                    r6.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L38
                    goto L1b
                L18:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L38
                L1b:
                    android.os.IBinder r6 = r5.f584a     // Catch: java.lang.Throwable -> L38
                    r4 = 2
                    boolean r6 = r6.transact(r4, r0, r1, r3)     // Catch: java.lang.Throwable -> L38
                    if (r6 != 0) goto L26
                    int r6 = android.support.v4.media.session.InterfaceC0175b.a.f583a     // Catch: java.lang.Throwable -> L38
                L26:
                    r1.readException()     // Catch: java.lang.Throwable -> L38
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L38
                    if (r6 == 0) goto L30
                    goto L31
                L30:
                    r2 = 0
                L31:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L38:
                    r6 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: k1 */
            public android.support.v4.media.MediaMetadataCompat mo379k1() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L34
                    android.os.IBinder r2 = r5.f584a     // Catch: java.lang.Throwable -> L34
                    r3 = 27
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L34
                    if (r2 != 0) goto L1a
                    int r2 = android.support.v4.media.session.InterfaceC0175b.a.f583a     // Catch: java.lang.Throwable -> L34
                L1a:
                    r1.readException()     // Catch: java.lang.Throwable -> L34
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L34
                    if (r2 == 0) goto L2c
                    android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r2 = android.support.v4.media.MediaMetadataCompat.CREATOR     // Catch: java.lang.Throwable -> L34
                    java.lang.Object r2 = r2.createFromParcel(r1)     // Catch: java.lang.Throwable -> L34
                    android.support.v4.media.MediaMetadataCompat r2 = (android.support.v4.media.MediaMetadataCompat) r2     // Catch: java.lang.Throwable -> L34
                    goto L2d
                L2c:
                    r2 = 0
                L2d:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L34:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: n */
            public android.support.v4.media.session.PlaybackStateCompat mo384n() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L34
                    android.os.IBinder r2 = r5.f584a     // Catch: java.lang.Throwable -> L34
                    r3 = 28
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L34
                    if (r2 != 0) goto L1a
                    int r2 = android.support.v4.media.session.InterfaceC0175b.a.f583a     // Catch: java.lang.Throwable -> L34
                L1a:
                    r1.readException()     // Catch: java.lang.Throwable -> L34
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L34
                    if (r2 == 0) goto L2c
                    android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r2 = android.support.v4.media.session.PlaybackStateCompat.CREATOR     // Catch: java.lang.Throwable -> L34
                    java.lang.Object r2 = r2.createFromParcel(r1)     // Catch: java.lang.Throwable -> L34
                    android.support.v4.media.session.PlaybackStateCompat r2 = (android.support.v4.media.session.PlaybackStateCompat) r2     // Catch: java.lang.Throwable -> L34
                    goto L2d
                L2c:
                    r2 = 0
                L2d:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L34:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: n1 */
            public void mo385n1(android.support.v4.media.session.InterfaceC0174a r5) {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2e
                    if (r5 == 0) goto L14
                    android.os.IBinder r5 = r5.asBinder()     // Catch: java.lang.Throwable -> L2e
                    goto L15
                L14:
                    r5 = 0
                L15:
                    r0.writeStrongBinder(r5)     // Catch: java.lang.Throwable -> L2e
                    android.os.IBinder r5 = r4.f584a     // Catch: java.lang.Throwable -> L2e
                    r2 = 4
                    r3 = 0
                    boolean r5 = r5.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L2e
                    if (r5 != 0) goto L24
                    int r5 = android.support.v4.media.session.InterfaceC0175b.a.f583a     // Catch: java.lang.Throwable -> L2e
                L24:
                    r1.readException()     // Catch: java.lang.Throwable -> L2e
                    r1.recycle()
                    r0.recycle()
                    return
                L2e:
                    r5 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            public void next() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L24
                    android.os.IBinder r2 = r5.f584a     // Catch: java.lang.Throwable -> L24
                    r3 = 20
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L24
                    if (r2 != 0) goto L1a
                    int r2 = android.support.v4.media.session.InterfaceC0175b.a.f583a     // Catch: java.lang.Throwable -> L24
                L1a:
                    r1.readException()     // Catch: java.lang.Throwable -> L24
                    r1.recycle()
                    r0.recycle()
                    return
                L24:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: p */
            public void mo387p() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L24
                    android.os.IBinder r2 = r5.f584a     // Catch: java.lang.Throwable -> L24
                    r3 = 13
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L24
                    if (r2 != 0) goto L1a
                    int r2 = android.support.v4.media.session.InterfaceC0175b.a.f583a     // Catch: java.lang.Throwable -> L24
                L1a:
                    r1.readException()     // Catch: java.lang.Throwable -> L24
                    r1.recycle()
                    r0.recycle()
                    return
                L24:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            public void previous() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L24
                    android.os.IBinder r2 = r5.f584a     // Catch: java.lang.Throwable -> L24
                    r3 = 21
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L24
                    if (r2 != 0) goto L1a
                    int r2 = android.support.v4.media.session.InterfaceC0175b.a.f583a     // Catch: java.lang.Throwable -> L24
                L1a:
                    r1.readException()     // Catch: java.lang.Throwable -> L24
                    r1.recycle()
                    r0.recycle()
                    return
                L24:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            public void stop() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L24
                    android.os.IBinder r2 = r5.f584a     // Catch: java.lang.Throwable -> L24
                    r3 = 19
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L24
                    if (r2 != 0) goto L1a
                    int r2 = android.support.v4.media.session.InterfaceC0175b.a.f583a     // Catch: java.lang.Throwable -> L24
                L1a:
                    r1.readException()     // Catch: java.lang.Throwable -> L24
                    r1.recycle()
                    r0.recycle()
                    return
                L24:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.InterfaceC0175b
            /* renamed from: u1 */
            public void mo391u1(java.lang.String r4, android.os.Bundle r5) {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L34
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L34
                    r4 = 0
                    if (r5 == 0) goto L1b
                    r2 = 1
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L34
                    r5.writeToParcel(r0, r4)     // Catch: java.lang.Throwable -> L34
                    goto L1e
                L1b:
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L34
                L1e:
                    android.os.IBinder r5 = r3.f584a     // Catch: java.lang.Throwable -> L34
                    r2 = 14
                    boolean r4 = r5.transact(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L34
                    if (r4 != 0) goto L2a
                    int r4 = android.support.v4.media.session.InterfaceC0175b.a.f583a     // Catch: java.lang.Throwable -> L34
                L2a:
                    r1.readException()     // Catch: java.lang.Throwable -> L34
                    r1.recycle()
                    r0.recycle()
                    return
                L34:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }
        }

        public a() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "android.support.v4.media.session.IMediaSession"
                r1.attachInterface(r1, r0)
                return
        }

        /* renamed from: v */
        public static android.support.v4.media.session.InterfaceC0175b m426v(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "android.support.v4.media.session.IMediaSession"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof android.support.v4.media.session.InterfaceC0175b
                if (r1 == 0) goto L13
                android.support.v4.media.session.b r0 = (android.support.v4.media.session.InterfaceC0175b) r0
                return r0
            L13:
                android.support.v4.media.session.b$a$a r0 = new android.support.v4.media.session.b$a$a
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                if (r5 == r0) goto L415
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto L3e8;
                    case 2: goto L3cb;
                    case 3: goto L3b9;
                    case 4: goto L3a7;
                    case 5: goto L399;
                    case 6: goto L38b;
                    case 7: goto L37d;
                    case 8: goto L366;
                    case 9: goto L358;
                    case 10: goto L341;
                    case 11: goto L32b;
                    case 12: goto L315;
                    case 13: goto L30b;
                    case 14: goto L2ee;
                    case 15: goto L2d1;
                    case 16: goto L2a8;
                    case 17: goto L29a;
                    case 18: goto L290;
                    case 19: goto L286;
                    case 20: goto L27c;
                    case 21: goto L272;
                    case 22: goto L268;
                    case 23: goto L25e;
                    case 24: goto L250;
                    case 25: goto L237;
                    case 26: goto L21a;
                    case 27: goto L201;
                    case 28: goto L1ea;
                    case 29: goto L1dc;
                    case 30: goto L1c5;
                    case 31: goto L1ae;
                    case 32: goto L1a0;
                    case 33: goto L196;
                    case 34: goto L179;
                    case 35: goto L15c;
                    case 36: goto L133;
                    case 37: goto L125;
                    case 38: goto L117;
                    case 39: goto L109;
                    case 40: goto Lf8;
                    case 41: goto Ldf;
                    case 42: goto Lc2;
                    case 43: goto La9;
                    case 44: goto L9b;
                    case 45: goto L8d;
                    case 46: goto L7c;
                    case 47: goto L6e;
                    case 48: goto L60;
                    case 49: goto L52;
                    case 50: goto L3b;
                    case 51: goto L12;
                    default: goto Ld;
                }
            Ld:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L12:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L24
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.support.v4.media.RatingCompat r5 = (android.support.v4.media.RatingCompat) r5
                goto L25
            L24:
                r5 = r3
            L25:
                int r8 = r6.readInt()
                if (r8 == 0) goto L34
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L34:
                r4.mo366X(r5, r3)
                r7.writeNoException()
                return r1
            L3b:
                r6.enforceInterface(r2)
                android.os.Bundle r5 = r4.mo383m1()
                r7.writeNoException()
                if (r5 == 0) goto L4e
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L51
            L4e:
                r7.writeInt(r0)
            L51:
                return r1
            L52:
                r6.enforceInterface(r2)
                float r5 = r6.readFloat()
                r4.mo373e2(r5)
                r7.writeNoException()
                return r1
            L60:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo356F(r5)
                r7.writeNoException()
                return r1
            L6e:
                r6.enforceInterface(r2)
                int r5 = r4.mo351B0()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L7c:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L86
                r0 = 1
            L86:
                r4.mo371e0(r0)
                r7.writeNoException()
                return r1
            L8d:
                r6.enforceInterface(r2)
                boolean r5 = r4.mo360J0()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L9b:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo352C0(r5)
                r7.writeNoException()
                return r1
            La9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto Lbb
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaDescriptionCompat r3 = (android.support.v4.media.MediaDescriptionCompat) r3
            Lbb:
                r4.mo389t0(r3)
                r7.writeNoException()
                return r1
            Lc2:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto Ld4
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaDescriptionCompat r3 = (android.support.v4.media.MediaDescriptionCompat) r3
            Ld4:
                int r5 = r6.readInt()
                r4.mo368a0(r3, r5)
                r7.writeNoException()
                return r1
            Ldf:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto Lf1
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaDescriptionCompat r3 = (android.support.v4.media.MediaDescriptionCompat) r3
            Lf1:
                r4.mo392x0(r3)
                r7.writeNoException()
                return r1
            Lf8:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L102
                r0 = 1
            L102:
                r4.mo395z1(r0)
                r7.writeNoException()
                return r1
            L109:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo388q(r5)
                r7.writeNoException()
                return r1
            L117:
                r6.enforceInterface(r2)
                boolean r5 = r4.mo370d0()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L125:
                r6.enforceInterface(r2)
                int r5 = r4.mo348A()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L133:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L145
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L146
            L145:
                r5 = r3
            L146:
                int r8 = r6.readInt()
                if (r8 == 0) goto L155
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L155:
                r4.mo380l0(r5, r3)
                r7.writeNoException()
                return r1
            L15c:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L172
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L172:
                r4.mo358H0(r5, r3)
                r7.writeNoException()
                return r1
            L179:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L18f
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L18f:
                r4.mo381l1(r5, r3)
                r7.writeNoException()
                return r1
            L196:
                r6.enforceInterface(r2)
                r4.mo386o()
                r7.writeNoException()
                return r1
            L1a0:
                r6.enforceInterface(r2)
                int r5 = r4.mo354D0()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L1ae:
                r6.enforceInterface(r2)
                android.os.Bundle r5 = r4.mo357F1()
                r7.writeNoException()
                if (r5 == 0) goto L1c1
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L1c4
            L1c1:
                r7.writeInt(r0)
            L1c4:
                return r1
            L1c5:
                r6.enforceInterface(r2)
                java.lang.CharSequence r5 = r4.mo375g1()
                r7.writeNoException()
                if (r5 == 0) goto L1d8
                r7.writeInt(r1)
                android.text.TextUtils.writeToParcel(r5, r7, r1)
                goto L1db
            L1d8:
                r7.writeInt(r0)
            L1db:
                return r1
            L1dc:
                r6.enforceInterface(r2)
                java.util.List r5 = r4.mo369a1()
                r7.writeNoException()
                r7.writeTypedList(r5)
                return r1
            L1ea:
                r6.enforceInterface(r2)
                android.support.v4.media.session.PlaybackStateCompat r5 = r4.mo384n()
                r7.writeNoException()
                if (r5 == 0) goto L1fd
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L200
            L1fd:
                r7.writeInt(r0)
            L200:
                return r1
            L201:
                r6.enforceInterface(r2)
                android.support.v4.media.MediaMetadataCompat r5 = r4.mo379k1()
                r7.writeNoException()
                if (r5 == 0) goto L216
                r7.writeInt(r1)
                android.os.Bundle r5 = r5.f498Y
                r7.writeBundle(r5)
                goto L219
            L216:
                r7.writeInt(r0)
            L219:
                return r1
            L21a:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L230
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L230:
                r4.mo362Q(r5, r3)
                r7.writeNoException()
                return r1
            L237:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L249
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.RatingCompat r3 = (android.support.v4.media.RatingCompat) r3
            L249:
                r4.mo374f0(r3)
                r7.writeNoException()
                return r1
            L250:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.mo361L1(r5)
                r7.writeNoException()
                return r1
            L25e:
                r6.enforceInterface(r2)
                r4.mo372e1()
                r7.writeNoException()
                return r1
            L268:
                r6.enforceInterface(r2)
                r4.mo355E1()
                r7.writeNoException()
                return r1
            L272:
                r6.enforceInterface(r2)
                r4.previous()
                r7.writeNoException()
                return r1
            L27c:
                r6.enforceInterface(r2)
                r4.next()
                r7.writeNoException()
                return r1
            L286:
                r6.enforceInterface(r2)
                r4.stop()
                r7.writeNoException()
                return r1
            L290:
                r6.enforceInterface(r2)
                r4.mo376j()
                r7.writeNoException()
                return r1
            L29a:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.mo393y1(r5)
                r7.writeNoException()
                return r1
            L2a8:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L2ba
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L2bb
            L2ba:
                r5 = r3
            L2bb:
                int r8 = r6.readInt()
                if (r8 == 0) goto L2ca
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L2ca:
                r4.mo359H1(r5, r3)
                r7.writeNoException()
                return r1
            L2d1:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L2e7
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L2e7:
                r4.mo350A1(r5, r3)
                r7.writeNoException()
                return r1
            L2ee:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L304
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L304:
                r4.mo391u1(r5, r3)
                r7.writeNoException()
                return r1
            L30b:
                r6.enforceInterface(r2)
                r4.mo387p()
                r7.writeNoException()
                return r1
            L315:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.mo378k0(r5, r8, r6)
                r7.writeNoException()
                return r1
            L32b:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.mo363R(r5, r8, r6)
                r7.writeNoException()
                return r1
            L341:
                r6.enforceInterface(r2)
                android.support.v4.media.session.ParcelableVolumeInfo r5 = r4.mo353C1()
                r7.writeNoException()
                if (r5 == 0) goto L354
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L357
            L354:
                r7.writeInt(r0)
            L357:
                return r1
            L358:
                r6.enforceInterface(r2)
                long r5 = r4.mo394z()
                r7.writeNoException()
                r7.writeLong(r5)
                return r1
            L366:
                r6.enforceInterface(r2)
                android.app.PendingIntent r5 = r4.mo349A0()
                r7.writeNoException()
                if (r5 == 0) goto L379
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L37c
            L379:
                r7.writeInt(r0)
            L37c:
                return r1
            L37d:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.mo382m()
                r7.writeNoException()
                r7.writeString(r5)
                return r1
            L38b:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.mo364T1()
                r7.writeNoException()
                r7.writeString(r5)
                return r1
            L399:
                r6.enforceInterface(r2)
                boolean r5 = r4.mo390u0()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L3a7:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.a r5 = android.support.v4.media.session.InterfaceC0174a.a.m425v(r5)
                r4.mo385n1(r5)
                r7.writeNoException()
                return r1
            L3b9:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.a r5 = android.support.v4.media.session.InterfaceC0174a.a.m425v(r5)
                r4.mo365W(r5)
                r7.writeNoException()
                return r1
            L3cb:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L3dd
                android.os.Parcelable$Creator r5 = android.view.KeyEvent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.view.KeyEvent r3 = (android.view.KeyEvent) r3
            L3dd:
                boolean r5 = r4.mo377j2(r3)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L3e8:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L3fe
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.os.Bundle r8 = (android.os.Bundle) r8
                goto L3ff
            L3fe:
                r8 = r3
            L3ff:
                int r0 = r6.readInt()
                if (r0 == 0) goto L40e
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> r0 = android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r3 = r6
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r3 = (android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper) r3
            L40e:
                r4.mo367Z0(r5, r8, r3)
                r7.writeNoException()
                return r1
            L415:
                r7.writeString(r2)
                return r1
        }
    }

    /* renamed from: A */
    int mo348A();

    /* renamed from: A0 */
    android.app.PendingIntent mo349A0();

    /* renamed from: A1 */
    void mo350A1(java.lang.String r1, android.os.Bundle r2);

    /* renamed from: B0 */
    int mo351B0();

    /* renamed from: C0 */
    void mo352C0(int r1);

    /* renamed from: C1 */
    android.support.v4.media.session.ParcelableVolumeInfo mo353C1();

    /* renamed from: D0 */
    int mo354D0();

    /* renamed from: E1 */
    void mo355E1();

    /* renamed from: F */
    void mo356F(int r1);

    /* renamed from: F1 */
    android.os.Bundle mo357F1();

    /* renamed from: H0 */
    void mo358H0(java.lang.String r1, android.os.Bundle r2);

    /* renamed from: H1 */
    void mo359H1(android.net.Uri r1, android.os.Bundle r2);

    /* renamed from: J0 */
    boolean mo360J0();

    /* renamed from: L1 */
    void mo361L1(long r1);

    /* renamed from: Q */
    void mo362Q(java.lang.String r1, android.os.Bundle r2);

    /* renamed from: R */
    void mo363R(int r1, int r2, java.lang.String r3);

    /* renamed from: T1 */
    java.lang.String mo364T1();

    /* renamed from: W */
    void mo365W(android.support.v4.media.session.InterfaceC0174a r1);

    /* renamed from: X */
    void mo366X(android.support.v4.media.RatingCompat r1, android.os.Bundle r2);

    /* renamed from: Z0 */
    void mo367Z0(java.lang.String r1, android.os.Bundle r2, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper r3);

    /* renamed from: a0 */
    void mo368a0(android.support.v4.media.MediaDescriptionCompat r1, int r2);

    /* renamed from: a1 */
    java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> mo369a1();

    /* renamed from: d0 */
    boolean mo370d0();

    /* renamed from: e0 */
    void mo371e0(boolean r1);

    /* renamed from: e1 */
    void mo372e1();

    /* renamed from: e2 */
    void mo373e2(float r1);

    /* renamed from: f0 */
    void mo374f0(android.support.v4.media.RatingCompat r1);

    /* renamed from: g1 */
    java.lang.CharSequence mo375g1();

    /* renamed from: j */
    void mo376j();

    /* renamed from: j2 */
    boolean mo377j2(android.view.KeyEvent r1);

    /* renamed from: k0 */
    void mo378k0(int r1, int r2, java.lang.String r3);

    /* renamed from: k1 */
    android.support.v4.media.MediaMetadataCompat mo379k1();

    /* renamed from: l0 */
    void mo380l0(android.net.Uri r1, android.os.Bundle r2);

    /* renamed from: l1 */
    void mo381l1(java.lang.String r1, android.os.Bundle r2);

    /* renamed from: m */
    java.lang.String mo382m();

    /* renamed from: m1 */
    android.os.Bundle mo383m1();

    /* renamed from: n */
    android.support.v4.media.session.PlaybackStateCompat mo384n();

    /* renamed from: n1 */
    void mo385n1(android.support.v4.media.session.InterfaceC0174a r1);

    void next();

    /* renamed from: o */
    void mo386o();

    /* renamed from: p */
    void mo387p();

    void previous();

    /* renamed from: q */
    void mo388q(int r1);

    void stop();

    /* renamed from: t0 */
    void mo389t0(android.support.v4.media.MediaDescriptionCompat r1);

    /* renamed from: u0 */
    boolean mo390u0();

    /* renamed from: u1 */
    void mo391u1(java.lang.String r1, android.os.Bundle r2);

    /* renamed from: x0 */
    void mo392x0(android.support.v4.media.MediaDescriptionCompat r1);

    /* renamed from: y1 */
    void mo393y1(long r1);

    /* renamed from: z */
    long mo394z();

    /* renamed from: z1 */
    void mo395z1(boolean r1);
}
