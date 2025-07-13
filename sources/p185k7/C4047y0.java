package p185k7;

/* renamed from: k7.y0 */
/* loaded from: classes.dex */
public final class C4047y0 implements android.os.Parcelable.Creator<p185k7.C4034x0> {
    public C4047y0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p185k7.C4034x0 createFromParcel(android.os.Parcel r18) {
            r17 = this;
            r0 = r18
            int r1 = p270p6.C5368b.m11710t(r18)
            r2 = 0
            r4 = 0
            r5 = 0
            r7 = r2
            r9 = r7
            r12 = r4
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r11 = 0
        L13:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L59
            int r2 = r18.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 1: goto L53;
                case 2: goto L4d;
                case 3: goto L47;
                case 4: goto L41;
                case 5: goto L3b;
                case 6: goto L35;
                case 7: goto L2f;
                case 8: goto L28;
                default: goto L24;
            }
        L24:
            p270p6.C5368b.m11709s(r0, r2)
            goto L13
        L28:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r16 = r2
            goto L13
        L2f:
            android.os.Bundle r2 = p270p6.C5368b.m11691a(r0, r2)
            r15 = r2
            goto L13
        L35:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r14 = r2
            goto L13
        L3b:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r13 = r2
            goto L13
        L41:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r12 = r2
            goto L13
        L47:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r11 = r2
            goto L13
        L4d:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r9 = r2
            goto L13
        L53:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r7 = r2
            goto L13
        L59:
            p270p6.C5368b.m11699i(r0, r1)
            k7.x0 r0 = new k7.x0
            r6 = r0
            r6.<init>(r7, r9, r11, r12, r13, r14, r15, r16)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p185k7.C4034x0[] newArray(int r1) {
            r0 = this;
            k7.x0[] r1 = new p185k7.C4034x0[r1]
            return r1
    }
}
