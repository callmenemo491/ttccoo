package p036c6;

/* renamed from: c6.u0 */
/* loaded from: classes.dex */
public final class C0914u0 implements android.os.Parcelable.Creator<com.google.android.gms.cast.MediaTrack> {
    public C0914u0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.cast.MediaTrack createFromParcel(android.os.Parcel r18) {
            r17 = this;
            r0 = r18
            int r1 = p270p6.C5368b.m11710t(r18)
            r2 = 0
            r3 = 0
            r4 = 0
            r10 = r3
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
            r7 = r4
            r9 = 0
            r14 = 0
        L12:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L5d
            int r2 = r18.readInt()
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r2
            switch(r4) {
                case 2: goto L57;
                case 3: goto L51;
                case 4: goto L4b;
                case 5: goto L45;
                case 6: goto L3f;
                case 7: goto L39;
                case 8: goto L33;
                case 9: goto L2d;
                case 10: goto L27;
                default: goto L23;
            }
        L23:
            p270p6.C5368b.m11709s(r0, r2)
            goto L12
        L27:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r3 = r2
            goto L12
        L2d:
            java.util.ArrayList r2 = p270p6.C5368b.m11696f(r0, r2)
            r15 = r2
            goto L12
        L33:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r14 = r2
            goto L12
        L39:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r13 = r2
            goto L12
        L3f:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r12 = r2
            goto L12
        L45:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r11 = r2
            goto L12
        L4b:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r10 = r2
            goto L12
        L51:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r9 = r2
            goto L12
        L57:
            long r4 = p270p6.C5368b.m11706p(r0, r2)
            r7 = r4
            goto L12
        L5d:
            p270p6.C5368b.m11699i(r0, r1)
            com.google.android.gms.cast.MediaTrack r0 = new com.google.android.gms.cast.MediaTrack
            org.json.JSONObject r16 = p123h6.C2487a.m6362a(r3)
            r6 = r0
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.cast.MediaTrack[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.cast.MediaTrack[] r1 = new com.google.android.gms.cast.MediaTrack[r1]
            return r1
    }
}
