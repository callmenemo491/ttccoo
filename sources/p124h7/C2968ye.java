package p124h7;

/* renamed from: h7.ye */
/* loaded from: classes.dex */
public final class C2968ye implements android.os.Parcelable.Creator<p124h7.C2950xe> {
    public C2968ye() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p124h7.C2950xe createFromParcel(android.os.Parcel r17) {
            r16 = this;
            r0 = r17
            int r1 = p270p6.C5368b.m11710t(r17)
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = r3
            r11 = r7
            r12 = r11
            r13 = r12
            r15 = r13
            r8 = r4
            r10 = 0
            r14 = 0
        L12:
            int r2 = r17.dataPosition()
            if (r2 >= r1) goto L57
            int r2 = r17.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 1: goto L51;
                case 2: goto L4b;
                case 3: goto L45;
                case 4: goto L3f;
                case 5: goto L39;
                case 6: goto L33;
                case 7: goto L2d;
                case 8: goto L27;
                default: goto L23;
            }
        L23:
            p270p6.C5368b.m11709s(r0, r2)
            goto L12
        L27:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r15 = r2
            goto L12
        L2d:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r14 = r2
            goto L12
        L33:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r13 = r2
            goto L12
        L39:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r12 = r2
            goto L12
        L3f:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r11 = r2
            goto L12
        L45:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r10 = r2
            goto L12
        L4b:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r8 = r2
            goto L12
        L51:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r7 = r2
            goto L12
        L57:
            p270p6.C5368b.m11699i(r0, r1)
            h7.xe r0 = new h7.xe
            r6 = r0
            r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p124h7.C2950xe[] newArray(int r1) {
            r0 = this;
            h7.xe[] r1 = new p124h7.C2950xe[r1]
            return r1
    }
}
